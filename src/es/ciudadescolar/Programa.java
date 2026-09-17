package es.ciudadescolar;
import es.ciudadescolar.utils.MessageManager;

public class Programa {
    public static void main(String[] args) throws Exception {
        MessageManager mensaje = new MessageManager();

        System.out.println(mensaje.getSaludo());
    }
}