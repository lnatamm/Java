package ArvoreAVL;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;
    private boolean flag;
    public Tree(){
        root = null;
        flag = true;
    }

    private Node<T> simpleLeftRotation(Node<T> root){
        Node<T> subTree = root.getRight();
        if(subTree.getLeft() != null){
            root.setRight(subTree.getLeft());
            subTree.setLeft(root);
        }
        else{
            subTree.setLeft(root);
            root.setRight(null);
        }
        defineFactor(subTree);
        defineFactor(root);
        return subTree;
    }

    private Node<T> doubleLeftRotation(Node<T> root){
        root.setRight(simpleRightRotation(root.getRight()));
        return simpleLeftRotation(root);
    }

    private Node<T> simpleRightRotation(Node<T> root){
        Node<T> subTree = root.getLeft();
        if(subTree.getRight() != null){
            root.setLeft(subTree.getRight());
            subTree.setRight(root);
        }
        else{
            subTree.setRight(root);
            root.setLeft(null);
        }
        defineFactor(subTree);
        defineFactor(root);
        return subTree;
    }

    private Node<T> doubleRightRotation(Node<T> root){
        root.setLeft(simpleLeftRotation(root.getLeft()));
        return simpleRightRotation(root);
    }

    private void defineFactor(Node<T> root){
        root.setFactor(leftHeight(root) - rightHeight(root));
    }

    public void add(T data){
        Node<T> node = new Node(data);
        if(root == null){
            root = node;
        }
        else{
            root = add(data, root);
            flag = true;
            //add(data, root);
        }
    }
    //return Node<T>
    private Node<T> add(T data, Node<T> root){
        if(data.compareTo(root.getData()) < 0){
            if(root.getLeft() == null){
                root.setLeft(new Node(data));
                root.incFactor();
                if(root.getFactor() == 0){
                    flag = false;
                }
            }
            else{
                root.setLeft(add(data, root.getLeft()));
                //add(data, root.getLeft());
                /*if(root.getLeft().getFactor() != 0) {
                    root.incFactor();
                }*/
                if(flag){
                    root.incFactor();
                    if(root.getFactor() == 0){
                        flag = false;
                    }
                }
            }
        }
        else if(data.compareTo(root.getData()) > 0){
            if(root.getRight() == null){
                root.setRight(new Node(data));
                root.decFactor();
                if(root.getFactor() == 0){
                    flag = false;
                }
            }
            else{
                root.setRight(add(data, root.getRight()));
                //add(data, root.getRight());
                /*if(root.getRight().getFactor() != 0) {
                    root.decFactor();
                }*/
                if(flag){
                    root.decFactor();
                    if(root.getFactor() == 0){
                        flag = false;
                    }
                }
            }
        }
        //balanceamento
        if(root.getFactor() >= 2){
            if(root.getLeft().getFactor() >= 0){
                //RSD
                System.out.println("RSD");
                root = simpleRightRotation(root);
            }
            else{
                //RDD
                System.out.println("RDD");
                root = doubleRightRotation(root);
            }
        }
        else if(root.getFactor() <= -2){
            if(root.getRight().getFactor() <= 0){
                //RSE
                System.out.println("RSE");
                root = simpleLeftRotation(root);
            }
            else{
                //RDE
                System.out.println("RDE");
                root = doubleLeftRotation(root);
            }
        }
        return root;
    }

    private Node<T> remove(T data, Node<T> root, Node<T> parent){
        if(root.getData().equals(data)){
            if(root.getLeft() == null && root.getRight() == null){
                if(!root.equals(this.root)){
                    if(root.equals(parent.getLeft())){
                        parent.setLeft(null);
                        parent.decFactor();
                    }
                    else{
                        parent.setRight(null);

                        parent.incFactor();
                    }

                    if(parent.getFactor() != 0){
                        flag = false;
                    }
                }
                else {
                    this.root = null;

                }
                return null;
            }
            else if(root.getLeft() != null && root.getRight() == null){
                if(!root.equals(this.root)){
                    if(root.equals(parent.getLeft())){
                        parent.setLeft(root.getLeft());
                        parent.decFactor();
                        if(parent.getFactor() != 0){
                            flag = false;
                        }
                        return parent.getLeft();
                    }
                    else {
                        parent.setRight(root.getLeft());
                        parent.incFactor();
                        if(parent.getFactor() != 0){
                            flag = false;
                        }
                        return parent.getRight();
                    }

                }
                else{
                    this.root = root.getLeft();
                    root.decFactor();
                    return this.root;
                }
            }
            else if(root.getLeft() == null){
                if(!root.equals(this.root)) {
                    if (root.equals(parent.getLeft())) {
                        parent.setLeft(root.getRight());

                        parent.decFactor();
                        if(parent.getFactor() != 0){
                            flag = false;
                        }
                        root = parent.getLeft();
                    }
                    else {
                        parent.setRight(root.getRight());

                        parent.incFactor();
                        if(parent.getFactor() != 0){
                            flag = false;
                        }
                        root = parent.getRight();
                    }

                }
                else{
                    this.root = root.getRight();

                    root.incFactor();
                    root = this.root;
                }
            }
            else {
                root.setData(min(root.getRight()));
                /*if(parent != null) {
                    //parent.setRight(remove(root.getData(), root.getRight(), root));
                    //root = remove(root.getData(), root.getRight(), root);
                    parent = remove(parent.getData(), root.getRight(), root);
                }
                else {
                    //root = remove(root.getData(), root.getRight(), root);
                    root = remove(root.getData(), root.getRight(), root);
                }*/
                root.setRight(remove(root.getData(), root.getRight(), root));
            }
        }
        else {
            if(data.compareTo(root.getData()) < 0){
                if(root.getLeft() != null){
                    //remove(data, root.getLeft(), root);
                    root.setLeft(remove(data, root.getLeft(), root));
                    //parent = remove(parent.getData(), root.getLeft(), parent);

                    if(flag){
                        if(parent != null) {
                            parent.incFactor();
                            if (parent.getFactor() != 0) {
                                flag = false;
                            }
                        }
                        else{
                            root.decFactor();
                        }
                    }
                }
            }
            else if(data.compareTo(root.getData()) > 0){
                if(root.getRight() != null){
                    //remove(data, root.getRight(), root);
                    root.setRight(remove(data, root.getRight(), root));
                    //parent = remove(data, root.getRight(), root);

                    if(flag){
                        if(parent != null) {
                            parent.decFactor();
                            if (parent.getFactor() != 0) {
                                flag = false;
                            }
                        }
                        else{
                            root.incFactor();
                        }
                    }
                }
            }
        }
        //balanceamento
        if(root != null) {
            if (root.getFactor() >= 2) {
                if (root.getLeft().getFactor() >= 0) {
                    //RSD
                    System.out.println("RSD");
                    root = simpleRightRotation(root);
                    //root = simpleRightRotation(root);
                    //parent = simpleRightRotation(root);
                    //root = simpleRightRotation(parent);
                } else {
                    //RDD
                    System.out.println("RDD");
                    root = doubleRightRotation(root);
                    //root = doubleRightRotation(root);
                    //parent = doubleRightRotation(root);
                    //root = doubleRightRotation(parent);
                }
            } else if (root.getFactor() <= -2) {
                if (root.getRight().getFactor() <= 0) {
                    //RSE
                    System.out.println("RSE");
                    root = simpleLeftRotation(root);
                    //root = simpleLeftRotation(root);
                    //parent = simpleLeftRotation(root);
                    //root = simpleLeftRotation(parent);
                } else {
                    //RDE
                    System.out.println("RDE");
                    root = doubleLeftRotation(root);
                    //root = doubleLeftRotation(root);
                    //parent = doubleLeftRotation(root);
                    //root = doubleLeftRotation(parent);
                }
            }
        }

        //Adicionando:
        /*if(parent != null) {
            return parent;
        }*/
        defineFactor(root);
        return root;
    }

    public void remove(T data){
        if(root != null){
            //remove(data, root, null);
            root = remove(data, root, null);
            flag = true;
        }
    }

    public void clear(){
        root = null;
    }

    public boolean search(T data){
        if(root == null){
            return false;
        }
        return search(data, root);
    }

    private boolean search(T data, Node<T> root){
        if(data.equals(root.getData())){
            return true;
        }
        else{
            if(data.compareTo(root.getData()) < 0){
                if(root.getLeft() == null){
                    return false;
                }
                else{
                    return search(data, root.getLeft());
                }
            }
            else if(data.compareTo(root.getData()) > 0){
                if(root.getRight() == null){
                    return false;
                }
                else{
                    return search(data, root.getRight());
                }
            }
        }
        return false;
    }

    private T min(Node<T> root){
        if(root.getLeft() == null){
            return root.getData();
        }
        return min(root.getLeft());
    }

    private T max(Node<T> root){
        if(root.getRight() == null){
            return root.getData();
        }
        return max(root.getRight());
    }

    public T min(){
        return min(root);
    }

    public T max(){
        return max(root);
    }

    private Node<T> get(T data, Node<T> root){
        if(root != null){
            if(root.getData().equals(data)){
                return root;
            }
            else{
                if(data.compareTo(root.getData()) < 0){
                    if(root.getLeft() != null){
                        return get(data, root.getLeft());
                    }
                }
                else if(data.compareTo(root.getData()) > 0){
                    if(root.getRight() != null){
                        return get(data, root.getRight());
                    }
                }
            }
        }
        return null;
    }

    public Node<T> get(T data){
        return get(data, root);
    }

    private int height(Node<T> root, int left, int right){
        if(root.getLeft() != null){
            left = height(root.getLeft(), ++left, right);
        }
        if(root.getRight() != null){
            right = height(root.getRight(), left, ++right);
        }
        return Math.max(left, right);
    }

    private int height(Node<T> root){
        int left;
        int right;
        if(root != null) {
            if (root.getLeft() != null && root.getRight() != null) {
                left = height(root.getLeft(), 1, 1);
                right = height(root.getRight(), 1, 1);
                System.out.print("");
            } else if (root.getLeft() != null) {
                left = height(root.getLeft(), 1, 0);
                right = 0;
                System.out.print("");
            } else if (root.getRight() != null) {
                left = 0;
                right = height(root.getRight(), 0, 1);
                System.out.print("");
            } else {
                left = 0;
                right = 0;
                System.out.print("");
            }
            return Math.max(left, right);
        }
        return -1;
    }

    public int leftHeight(Node<T> root){
        return height(root.getLeft()) + 1;
    }

    public int rightHeight(Node<T> root){
        return height(root.getRight()) + 1;
    }

    public int leftHeight(){
        return leftHeight(root);
    }

    public int rightHeight(){
        return rightHeight(root);
    }

    public int height(){
        return height(root);
    }

    public boolean isEmpty(){
        return root == null;
    }

    private String preOrdem(Node<T> root, String s){
        s += root.getData() + " ";
        if(root.getLeft() != null){
            s = preOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = preOrdem(root.getRight(), s);
        }
        return s;
    }

    private String emOrdem(Node<T> root, String s){
        if(root.getLeft() != null){
            s = emOrdem(root.getLeft(), s);
        }
        s += root.getData() + " ";
        if(root.getRight() != null){
            s = emOrdem(root.getRight(), s);
        }
        return s;
    }

    private String posOrdem(Node<T> root, String s){
        if(root.getLeft() != null){
            s = posOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = posOrdem(root.getRight(), s);
        }
        s += root.getData() + " ";
        return s;
    }

    private String toString(Node<T> root, String s){
        //Pré Ordem:
        //s += root.getData();
        if(root.getLeft() != null){
            s = toString(root.getLeft(), s);
        }
        //Em Ordem:
        //s += root.getData() + ": Altura Esquerda: " + leftHeight(root) +  " Altura Direita:  " + rightHeight(root) + "\n";
        s += root.getData() + " Fator: " + root.getFactor() + "\n";
        if(root.getRight() != null){
            s = toString(root.getRight(), s);
        }
        //Pós Ordem:
        //s += root.getData();
        return s;
    }

    public String preOrdem(){
        return preOrdem(root, "");
    }

    public String emOrdem(){
        return emOrdem(root, "");
    }

    public String posOrdem(){
        return posOrdem(root, "");
    }

    public T getRoot(){
        return root.getData();
    }

    @Override
    public String toString(){
        return toString(root, "");
    }
}
