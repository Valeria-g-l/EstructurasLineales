package Materia.controllers;

import java.util.EmptyStackException;

import Materia.models.Node;

public class Stack {

    private Node top; 

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value); 
        newNode.setNext(top);           
        top = newNode;                  
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext(); 
        return value;
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

 
    public boolean isEmpty() {
        return top == null;
    }

    
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Elementos en la pila:");
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}

