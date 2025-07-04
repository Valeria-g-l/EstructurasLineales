import Materia.controllers.Cola;
import Materia.controllers.ColaG;
import Materia.models.Persona;

public class App {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tam= " + cola.Size);
        cola.printCola();
        cola.remove();
        System.out.println("tam= " + cola.Size);
        cola.printCola();

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println("Tamaño = " + colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiende a la persona => " + colaPersonas.remove());
        System.out.println("Tamaño = " + colaPersonas.size());
        colaPersonas.printCola();

        Persona pEliminada = colaPersonas.removeByName("David");

        if (pEliminada == null) {
            System.out.println("No se encontró la persona.");
        } else {
            System.out.println("Persona eliminada: " + pEliminada);
        }

    }
}
