package es.ciudadescolar;
import es.ciudadescolar.utils.MessageManager;
public class Programa {
    public static void main(String[] args) {
        MessageManager mensaje = new MessageManager();
        String usuario = System.getProperty("user.name");

        System.out.println(mensaje.getSaludo() + " " + usuario);
           
    }
}