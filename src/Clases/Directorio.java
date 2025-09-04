package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Directorio {

    private TreeMap<Long, Cliente> clientela = new TreeMap();
    

    public Directorio() {
      
    }

    public void agregarContacto(Cliente c, long numero) {
        clientela.put(numero, c);//añadimos el cliente al arreglo
        System.out.println("Contacto agregado");
    }

    public void buscarContacto(long numero) {
        int cont = 0;

        for (Map.Entry<Long, Cliente> c : clientela.entrySet()) {
            if (c.getKey() == numero) {
                System.out.println(c.getValue().toString());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No pudimos encontrar al sujeto");
        }
    }

    public void buscarTelefono(String apellido) {
        int cont = 0;
        for (Map.Entry<Long, Cliente> c : clientela.entrySet()) {

            if (c.getValue().getApellido().equals(apellido)) {
                System.out.println("Numero de " + apellido + " es: " + c.getKey());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No pudimos encontrar al sujeto");
        }
    }

    public Cliente buscarContactos(String ciudad) {
        for (Cliente c : clientela.values()) {
            if (c.getCiudad().equals(ciudad)) {//si el valor coinicide con el parametor
                System.out.println(c);
            }
        }//luego retorna la lista con las personas que estan en determinada ciudad.
      return null;
    }

    public void borrarContacto(long numero) {
        clientela.remove(numero);
        System.out.println("Contacto borrado");
    }
}
