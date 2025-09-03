package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DirectorioTelefonico {

    private String nombreD;
    private TreeMap<Long, Cliente> clientela = new TreeMap();
    private ArrayList<Cliente> clientes = new ArrayList();

    public DirectorioTelefonico(String nombreD) {
        this.nombreD = nombreD;
    }

    public void agregarContacto(Cliente c, long numero) {
        clientela.put(numero, c);//añadimos el cliente al arreglo
        System.out.println("Contacto agregado");
    }

    public void buscarContacto(long numero) {
        int cont = 0;

        for (Map.Entry<Long, Cliente> c : clientela.entrySet()) {
            if (c.getKey() == numero) {
                System.out.println(c.toString());
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

    public ArrayList<Cliente> buscarContactos(String ciudad) {
        for (Cliente c : clientela.values()) {
            if (c.getCiudad().equals(ciudad)) {//si el valor coinicide con el parametor
                clientes.add(c);//se agrega al arrayList
            }
        }//luego retorna la lista con las personas que estan en determinada ciudad.
        return clientes;
    }

    public void borrarContacto(long numero) {
        clientela.remove(numero);
        System.out.println("Contacto borrado");
    }
}
