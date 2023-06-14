package OHallDosAssassinos;

public class Root {

    private Person data;

    private Root left;

    private Root right;

    public Root(Person data){
        this.data = data;
        left = null;
        right = null;
    }

    public Person getData(){
        return data;
    }

    public Root getLeft(){
        return left;
    }

    public Root getRight(){
        return right;
    }

    public void setData(Person data){
        this.data = data;
    }

    public void setLeft(Root left){
        this.left = left;
    }

    public void setRight(Root right){
        this.right = right;
    }

}
