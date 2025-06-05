package Ejercicio_02_sorting;
import java.util.Stack;

public class StackSorter {
    public static void ordenar(Stack<Integer> pila) {
        Stack<Integer> pilaAux = new Stack<>();
        while (!pila.isEmpty()) {
            int moment = pila.pop();
            while (!pilaAux.isEmpty() && pilaAux.peek() > moment) {
                pila.push(pilaAux.pop());
            }
            pilaAux.push(moment);
        }
        
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        ordenar(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    
    }
}
  

