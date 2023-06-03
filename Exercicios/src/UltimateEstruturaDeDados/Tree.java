package UltimateEstruturaDeDados;

public class Tree<T extends Comparable<T>> {
    private Root<T> root;
    private boolean flag;
    public Tree(){
        root = null;
        flag = true;
    }

    private Root<T> simpleLeftRotation(Root<T> root){
        Root<T> subTree = root.getRight();
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

    private Root<T> doubleLeftRotation(Root<T> root){
        root.setRight(simpleRightRotation(root.getRight()));
        return simpleLeftRotation(root);
    }

    private Root<T> simpleRightRotation(Root<T> root){
        Root<T> subTree = root.getLeft();
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

    private Root<T> doubleRightRotation(Root<T> root){
        root.setLeft(simpleLeftRotation(root.getLeft()));
        return simpleRightRotation(root);
    }

    private void defineFactor(Root<T> root){
        root.setFactor(leftHeight(root) - rightHeight(root));
    }

    public void add(T data){
        Root<T> node = new Root(data);
        if(root == null){
            root = node;
        }
        else{
            root = add(data, root);
            flag = true;
        }
    }
    private Root<T> add(T data, Root<T> root){
        if(data.compareTo(root.getData()) < 0){
            if(root.getLeft() == null){
                root.setLeft(new Root(data));
                root.incFactor();
                if(root.getFactor() == 0){
                    flag = false;
                }
            }
            else{
                root.setLeft(add(data, root.getLeft()));
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
                root.setRight(new Root(data));
                root.decFactor();
                if(root.getFactor() == 0){
                    flag = false;
                }
            }
            else{
                root.setRight(add(data, root.getRight()));
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
                root = simpleRightRotation(root);
            }
            else{
                root = doubleRightRotation(root);
            }
        }
        else if(root.getFactor() <= -2){
            if(root.getRight().getFactor() <= 0){
                root = simpleLeftRotation(root);
            }
            else{
                root = doubleLeftRotation(root);
            }
        }
        return root;
    }

    private Root<T> remove(T data, Root<T> root, Root<T> parent){
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
                root.setRight(remove(root.getData(), root.getRight(), root));
            }
        }
        else {
            if(data.compareTo(root.getData()) < 0){
                if(root.getLeft() != null){
                    root.setLeft(remove(data, root.getLeft(), root));
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
                    root.setRight(remove(data, root.getRight(), root));
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
                    root = simpleRightRotation(root);
                } else {
                    root = doubleRightRotation(root);
                }
            } else if (root.getFactor() <= -2) {
                if (root.getRight().getFactor() <= 0) {
                    root = simpleLeftRotation(root);
                } else {
                    root = doubleLeftRotation(root);
                }
            }
        }
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

    private boolean search(T data, Root<T> root){
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

    private T min(Root<T> root){
        if(root.getLeft() == null){
            return root.getData();
        }
        return min(root.getLeft());
    }

    private T max(Root<T> root){
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

    private Root<T> get(T data, Root<T> root){
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

    private Root<T> get(T data){
        return get(data, root);
    }

    private int height(Root<T> root, int left, int right){
        if(root.getLeft() != null){
            left = height(root.getLeft(), ++left, right);
        }
        if(root.getRight() != null){
            right = height(root.getRight(), left, ++right);
        }
        return Math.max(left, right);
    }

    private int height(Root<T> root){
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

    private int leftHeight(Root<T> root){
        return height(root.getLeft()) + 1;
    }

    private int rightHeight(Root<T> root){
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

    private void sort(List<T> list, Root<T> root){
        if(root.getLeft() != null){
            sort(list, root.getLeft());
        }
        list.add(root.getData());
        if(root.getRight() != null){
            sort(list, root.getRight());
        }
    }

    public List<T> sort(List<T> list){
        list = new List<>();
        sort(list, root);
        return list;
    }

    private String preOrdem(Root<T> root, String s){
        s += root.getData() + " ";
        if(root.getLeft() != null){
            s = preOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = preOrdem(root.getRight(), s);
        }
        return s;
    }

    private String emOrdem(Root<T> root, String s){
        if(root.getLeft() != null){
            s = emOrdem(root.getLeft(), s);
        }
        s += root.getData() + " ";
        if(root.getRight() != null){
            s = emOrdem(root.getRight(), s);
        }
        return s;
    }

    private String posOrdem(Root<T> root, String s){
        if(root.getLeft() != null){
            s = posOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = posOrdem(root.getRight(), s);
        }
        s += root.getData() + " ";
        return s;
    }

    private String toString(Root<T> root, String s){
        //Pré Ordem:
        //s += root.getData();
        if(root.getLeft() != null){
            s = toString(root.getLeft(), s);
        }
        //Em Ordem:
        //s += root.getData() + ": Altura Esquerda: " + leftHeight(root) +  " Altura Direita:  " + rightHeight(root) + "\n";
        s += root.getData() + "\n";
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
