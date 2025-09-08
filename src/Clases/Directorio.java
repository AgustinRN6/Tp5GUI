package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Directorio {
    //Arreglo de tipo Map con la key= llave y el valor igual a objetos de tipo Cliente
    private TreeMap<Long, Cliente> clientela = new TreeMap();
   
    public Directorio() {
    }
    //METODO PARA AGREGAR UN CLIENTE JUNTO CON SU NUMERO TELEFONICO
    public void agregarContacto(Cliente c, long numero) {
        clientela.put(numero, c);//añadimos el cliente al arreglo
        System.out.println("Contacto agregado");
    }
    //METODO PARA BUSCAR EL CONTACTO DE UNA PERSONA MEDIANTE EL NUMERO TELEFONICO
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
    //METODO PARA BUSCAR EL CONTACTO DE UNA PERSONA MEDIANTE EL APELLIDO
    public void buscarTelefono(String apellido) {
        int cont = 0;//contador sirve para verificar si entro en el bloque if
        for (Map.Entry<Long, Cliente> c : clientela.entrySet()) {
            if (c.getValue().getApellido().equals(apellido)) {
                System.out.println("Su numero es: " + c.getKey());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No pudimos encontrar al sujeto");
        }
    }
    //METODO QUE RETORNA UN ARRAYLIST CON TODOS LAS PERSONAS SITUADAS EN UNA MISMA CIUDAD
    public ArrayList<Cliente> buscarContactos(String ciudad) {
    ArrayList<Cliente> clientes = new ArrayList();   
        int cont =0;
        for (Cliente c : clientela.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {//si el valor coinicide con el parametro
                clientes.add(c);
                cont++;
                System.out.println(cont);    
            } 
        }//luego retorna la lista con las personas que estan en determinada ciudad.
      return clientes;
    }
    public ArrayList<Cliente> prueba(){
        ArrayList<Cliente> clientes = new ArrayList();   
    
        for (Cliente c : clientela.values()) {
                clientes.add(c);
        }
        return clientes;
    }
    //METODO QUE BORRA EL CONTACTO Y EL NUMERO DEL ARREGLO
    public void borrarContacto(long numero) {
        clientela.remove(numero);//
        System.out.println("Contacto borrado");
    }
    //METODO PARA DEVOLVER EL TREEMAP PRIVADO
    public TreeMap<Long, Cliente> getClientela() {
        return clientela;
    }
    
    
    
}
