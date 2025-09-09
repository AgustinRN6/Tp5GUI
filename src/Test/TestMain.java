
package Test;

import Clases.Cliente;
import Clases.Directorio;


public class TestMain {
    public static void main(String[] args){
    Directorio t1 = new Directorio();
        Cliente c1 = new Cliente("Julio","Cesar",45677,"Villa Mercedez","Los inmigrantes");
        Cliente c2 = new Cliente("Pepe","Dominguez",49823,"San Luis","Los inmigrantes");
        Cliente c3 = new Cliente("Gustavo","Perez",47234,"San Luis","Los inmigrantes");
        Cliente c4 = new Cliente("Pedro","Dominguez",43454,"Villa Mercedez","Los inmigrantes");
        Cliente c5 = new Cliente("Carlos","Jofre",43454,"La punta","Los inmigrantes");
        //metodos directorio
        t1.agregarContacto(c1, 266510);
        t1.agregarContacto(c2, 25551);
        t1.agregarContacto(c3, 2342211);
        t1.agregarContacto(c5, 23333333);
        t1.agregarContacto(c4, 23333333);
        //metodo de buscar
        t1.buscarContacto(266510);
      
        for(Long n:  t1.buscarTelefono("Dominguez") ){
            System.out.println("numeros :"+n.toString());
        }
        for(Cliente c: t1.buscarContactos("San Luis")){
            System.out.println(c.toString());
        }
        t1.borrarContacto(2342211);
        
    }
    
}
