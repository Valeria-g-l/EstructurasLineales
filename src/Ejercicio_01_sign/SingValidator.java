package Ejercicio_01_sign;
import java.util.Stack;

public class SingValidator {
    

    public static boolean esValido(String cad) {
        Stack<Character> pila = new Stack<>();
        for (int i=0; i<cad.length(); i++) {
            char c=cad.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char apertura = pila.pop();
                if ((c == ')' && apertura != '(') ||
                    (c == '}' && apertura != '{') ||
                    (c == ']' && apertura != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String Ejercicio1 = "{[()]}";
        String Ejercicio2 = "({)}";

        System.out.println(esValido(Ejercicio1)); 
        System.out.println(esValido(Ejercicio2)); 
    }
}
    

