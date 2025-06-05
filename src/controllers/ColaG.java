package controllers;

import models.NodeGeneric;
import models.Persona;

import java.util.EmptyStackException;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public int size(){
        return size;
    }

    public void printCola(){
        NodeGeneric<T> actual = primero;
        System.out.print("Cola: ");
        while(actual != null){
            System.out.print(actual.getValue() + " ");
            actual = actual.getNext();
        }
        System.out.println();
    }

    public T removeByName(String name) {
    NodeGeneric<T> actual = primero;
    NodeGeneric<T> anterior = null;

    while (actual != null) {
        if (actual.getValue() instanceof Persona) {
            Persona persona = (Persona) actual.getValue();
            if (persona.getNombre().equalsIgnoreCase(name)) {
                if (anterior == null) { // Está al principio
                    primero = actual.getNext();
                } else {
                    anterior.setNext(actual.getNext());
                }
                if (actual == ultimo) {
                    ultimo = anterior;
                }
                size--;
                return (T) persona;
            }
        }
        anterior = actual;
        actual = actual.getNext();
    }
    return null; // No se encontró
}

}

