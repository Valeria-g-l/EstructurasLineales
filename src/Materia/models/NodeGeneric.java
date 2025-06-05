package Materia.models;

public class NodeGeneric <T> {

    private T value;
    private NodeGeneric next;

     public NodeGeneric(T value){
        this.value = value;
        this.next = null; 
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric getNext() {
        return next;
    }

    public void setNext(NodeGeneric next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGeneric [value=" + value + ", next=" + next + "]";
    }

}
