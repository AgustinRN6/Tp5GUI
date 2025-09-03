
package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class DirectorioTelefonico {
    private String nombreD;
    private TreeMap<Long,Cliente>clientela = new TreeMap();
    private ArrayList<Cliente>clientes = new ArrayList();
    
    public DirectorioTelefonico(String nombreD){
    this.nombreD = nombreD;
    }
    public void agregarContacto(Cliente c, long numero){
        clientela.put(numero, c);//añadimos cliente al arreglo
    }
    public void buscarContacto(Long numero){
        for(Map.Entry<Long, Cliente> c: clientela.entrySet()){
        if(c.getKey().equals(numero)){
            c.toString();
            }
        }
    }
    public void buscarTelefono(String apellido){
      for(Map.Entry<Long ,Cliente> c: clientela.entrySet()){
          if(c.getValue().getApellido().equals(apellido)){
              System.out.println("Numero de "+ apellido+" es: "+ c.getKey());
          }
      }
            
        
    }
    public ArrayList buscarContactos(String ciudad){
        for(Cliente c: clientela.values()){
            if(c.getCiudad().equals(ciudad)){
            clientes.add(c);
            }
        }
        return clientes;
    }
   public void borrarContacto(long numero){
   clientela.remove(numero);
   }
}
