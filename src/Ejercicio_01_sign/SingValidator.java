package Ejercicio_01_sign;
import java.util.Stack;

public class SingValidator {
    

    public static boolean esValido(String cad) {
        Stack<Character> pila = new Stack<>();
        for (int i=0; i<cad.length(); i++) {
            char caracter=cad.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char apertura = pila.pop();
                if ((caracter == ')' && apertura != '(') ||
                    (caracter == '}' && apertura != '{') ||
                    (caracter == ']' && apertura != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String Ejemplo1 = "{[()]}";
        String Ejemplo2 = "({)}";

        System.out.println(esValido(Ejemplo1)); 
        System.out.println(esValido(Ejemplo2)); 
    }
}
    

