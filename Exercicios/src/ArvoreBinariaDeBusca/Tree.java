package ArvoreBinariaDeBusca;
public class Tree<T extends Comparable<T>> {
    private Node<T> root;
    public Tree(){
        root = null;
    }
    public void add(T data){
        Node<T> node = new Node(data);
        if(root == null){
            root = node;
        }
        else{
            add(data, root);
        }
    }
    private void add(T data, Node<T> root){
        if(data.compareTo(root.getData()) < 0){
            if(root.getLeft() == null){
                root.setLeft(new Node(data));
            }
            else{
                add(data, root.getLeft());
            }
        }
        else if(data.compareTo(root.getData()) > 0){
            if(root.getRight() == null){
                root.setRight(new Node(data));
            }
            else{
                add(data, root.getRight());
            }
        }
    }

    private void remove(T data, Node<T> root, Node<T> parent){
        if(root.getData().equals(data)){
            if(root.getLeft() == null && root.getRight() == null){
                if(!root.equals(this.root)){
                    if(root.equals(parent.getLeft())){
                        parent.setLeft(null);
                    }
                    else{
                        parent.setRight(null);
                    }
                }
                else {
                    this.root = null;
                }
            }
            else if(root.getLeft() != null && root.getRight() == null){
                if(!root.equals(this.root)){
                    if(root.equals(parent.getLeft())){
                        parent.setLeft(root.getLeft());
                    }
                    else {
                        parent.setRight(root.getLeft());
                    }
                }
                else{
                    this.root = root.getLeft();
                }
            }
            else if(root.getLeft() == null){
                if(!root.equals(this.root)) {
                    if (root.equals(parent.getLeft())) {
                        parent.setLeft(root.getRight());
                    }
                    else {
                        parent.setRight(root.getRight());
                    }
                }
                else{
                    this.root = root.getRight();
                }
            }
            else {
                root.setData(min(root.getRight()));
                remove(root.getData(), root.getRight(), root);
            }
        }
        else {
            if(data.compareTo(root.getData()) < 0){
                if(root.getLeft() != null){
                    remove(data, root.getLeft(), root);
                }
            }
            else if(data.compareTo(root.getData()) > 0){
                if(root.getRight() != null){
                    remove(data, root.getRight(), root);
                }
            }
        }
    }

    public void remove(T data){
        if(root != null){
            remove(data, root, null);
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

    private Node<T> get(T data){
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
            } else if (root.getLeft() != null) {
                left = height(root.getLeft(), 1, 1);
                right = 0;
            } else if (root.getRight() != null) {
                left = 0;
                right = height(root.getRight(), 1, 1);
            } else {
                left = 0;
                right = 0;
            }
            return Math.max(left, right);
        }
        return 0;
    }

    private int leftHeight(Node<T> root){
        return height(root.getLeft()) + 1;
    }

    private int rightHeight(Node<T> root){
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

    private String preOrdem(Node<T> root, String s){
        s += root.getData();
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
        s += root.getData();
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
        s += root.getData();
        return s;
    }

    private String toString(Node<T> root, String s){
        //Pré Ordem:
        //s += root.getData();
        if(root.getLeft() != null){
            s = toString(root.getLeft(), s);
        }
        //Em Ordem:
        s += root.getData();
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

    @Override
    public String toString(){
        return toString(root, "");
    }
}