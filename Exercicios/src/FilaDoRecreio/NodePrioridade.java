package FilaDoRecreio;

public class NodePrioridade <T>{

    private T data;

    private int priority;

    private NodePrioridade<T> next;

    private NodePrioridade<T> prev;

    public NodePrioridade(T data, int priority){

        this.data = data;
        this.priority = priority;
        this.next = null;
        this.prev = null;

    }

    public T getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    public NodePrioridade<T> getNext() {
        return next;
    }

    public NodePrioridade<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setNext(NodePrioridade<T> next) {
        this.next = next;
    }

    public void setPrev(NodePrioridade<T> prev) {
        this.prev = prev;
    }

}
