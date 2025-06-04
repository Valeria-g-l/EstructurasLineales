package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;

public class StackG<T> {

    private int size;
    private NodeGeneric<T> top;

    public StackG(){
        this.size = 0;
        this.top = null;
    }

        public void push(T value){
        NodeGeneric newNode = new NodeGeneric<T>(value);
        newNode.setNext(top);
        top = newNode;
    
    }

    public T pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    T value = top.getValue();
    top = top.getNext();
    return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack() {
    if (isEmpty()) {
        System.out.println("La pila está vacía.");
        return;
    }

    System.out.println("Elementos en la pila:");
    NodeGeneric current = top;
    while (current != null) {
        System.out.println(current.getValue());
        current = current.getNext();
    }
}

    public String size() {
    NodeGeneric aux = top;
    int cont = 0;
    while (aux != null) {
        System.out.print(aux.getValue() + " "); 
        cont++;
        aux = aux.getNext(); 
    }
    return "Tamaño de la pila: " + cont;
}  
}
