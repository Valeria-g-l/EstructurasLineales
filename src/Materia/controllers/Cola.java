package Materia.controllers;

import java.util.EmptyStackException;

import Materia.models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int Size;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.Size = 0;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        Size++;
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = primero.getValue();
        primero = primero.getNext();
        Size--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue(); 
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public void printCola(){
        Node actual = primero;
        System.out.print("Cola: ");
        while(actual != null){
            System.out.print(actual.getValue() + " ");
            actual = actual.getNext();
        }
        System.out.println();
    }
}

