package ArvoreBinariaDeBusca;

public class Tree<T extends Comparable<T>> {

    public Node<T> root;

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

}
