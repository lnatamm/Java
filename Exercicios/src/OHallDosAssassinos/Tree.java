package OHallDosAssassinos;

public class Tree {
    private Root root;
    public Tree(){
        root = null;
    }
    public void add(Person data){
        Root root = new Root(data);
        if(this.root == null){
            this.root = root;
        }
        else{
            add(data, this.root);
        }
    }
    private void add(Person data, Root root){
        if(data.getName().compareTo(root.getData().getName()) < 0){
            if(root.getLeft() == null){
                root.setLeft(new Root(data));
            }
            else{
                add(data, root.getLeft());
            }
        }
        else if(data.getName().compareTo(root.getData().getName()) > 0){
            if(root.getRight() == null){
                root.setRight(new Root(data));
            }
            else{
                add(data, root.getRight());
            }
        }
    }

    public void clear(){
        root = null;
    }

    private Root get(Person data, Root root){
        if(root != null){
            if(root.getData().equals(data)){
                return root;
            }
            else{
                if(data.getName().compareTo(root.getData().getName()) < 0){
                    if(root.getLeft() != null){
                        return get(data, root.getLeft());
                    }
                }
                else if(data.getName().compareTo(root.getData().getName()) > 0){
                    if(root.getRight() != null){
                        return get(data, root.getRight());
                    }
                }
            }
        }
        return null;
    }

    private Root get(Person data){
        return get(data, root);
    }

    private String preOrdem(Root root, String s){
        s += root.getData();
        if(root.getLeft() != null){
            s = preOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = preOrdem(root.getRight(), s);
        }
        return s;
    }

    private String emOrdem(Root root, String s){
        if(root.getLeft() != null){
            s = emOrdem(root.getLeft(), s);
        }
        s += root.getData();
        if(root.getRight() != null){
            s = emOrdem(root.getRight(), s);
        }
        return s;
    }

    private String posOrdem(Root root, String s){
        if(root.getLeft() != null){
            s = posOrdem(root.getLeft(), s);
        }
        if(root.getRight() != null){
            s = posOrdem(root.getRight(), s);
        }
        s += root.getData();
        return s;
    }

    private String toString(Root root, String s){
        //Pré Ordem:
        //s += root.getData();
        if(root.getLeft() != null){
            s = toString(root.getLeft(), s);
        }
        //Em Ordem:
        s += root.getData().getName() + " "  + root.getData().getKillCount() + "\n";
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
