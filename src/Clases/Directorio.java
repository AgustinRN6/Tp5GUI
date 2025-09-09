package Clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Directorio {

    //Arreglo de tipo Map con la key= llave y el valor igual a objetos de tipo Cliente
    public TreeMap<Long, Contacto> clientela = new TreeMap();

    public Directorio() {
    }

    //METODO PARA AGREGAR UN CLIENTE JUNTO CON SU NUMERO TELEFONICO
    public void agregarContacto(Contacto c, long numero) {
                clientela.put(numero, c);//añadimos el cliente al arreglo
                System.out.println("Contacto agregado");
    }

    //METODO PARA BUSCAR EL CONTACTO DE UNA PERSONA MEDIANTE EL NUMERO TELEFONICO
    public void buscarContacto(long numero) {
        int cont = 0;
        for (Map.Entry<Long, Contacto> c : clientela.entrySet()) {
            if (c.getKey() == numero) {
                System.out.println(c.getValue().toString());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No pudimos encontrar al sujeto");
        }
    }
    //METODO PARA BUSCAR EL CONTACTO DE UNA PERSONA MEDIANTE EL APELLIDO
    public HashSet<Long> buscarTelefono(String apellido) {
        HashSet<Long> numeros = new HashSet();
        for (Map.Entry<Long, Contacto> c : clientela.entrySet()) {
            if (c.getValue().getApellido().equals(apellido)) {
                numeros.add(c.getKey());
            }
        }
        return numeros;
    }

    //METODO QUE RETORNA UN ARRAYLIST CON TODOS LAS PERSONAS SITUADAS EN UNA MISMA CIUDAD
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> clientes = new ArrayList();
        for (Contacto c : clientela.values()) {
            if (c.getCiudad().equals(ciudad)) {
                clientes.add(c);
            }
        }//luego retorna la lista con las personas que estan en determinada ciudad.
        return clientes;
    }
    //METODO QUE BORRA EL CONTACTO Y EL NUMERO DEL ARREGLO
    public void borrarContacto(long numero) {
        clientela.remove(numero);//
        System.out.println("Contacto borrado");
    }
    //METODO PARA DEVOLVER EL TREEMAP PRIVADO
    public TreeMap<Long, Contacto> getClientela() {
        return clientela;
    }
    
    
    
}
