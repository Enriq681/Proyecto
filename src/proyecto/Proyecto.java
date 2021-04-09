

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Proyecto {
    

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       cliente[] clientes;
       int tam;
       int espacio = 0;
       System.out.println("De que tamaño quieres el arreglo: ");
       tam=sc.nextInt();
       clientes = new cliente[tam];
       
       for(int i=0; i<clientes.length; i++){
           clientes[i] = new cliente();
       }
       
       try{
          for(int i=0; i<clientes.length; i++){
              System.out.println("codigo: ");
              clientes[i].setcodigocliente(sc.nextInt());
              System.out.println("nombre: ");
              clientes[i].setnombre(bf.readLine());
              System.out.println("ApellidoPaterno: ");
              clientes[i].setApellidoPaterno(bf.readLine());
              System.out.println("ApellidoMaterno: ");
              clientes[i].setApellidoMaterno(bf.readLine());
              System.out.println("Telefono: ");
              clientes[i].setTelefo(bf.readLine());
              System.out.println("Direccion: ");
              clientes[i].setDireccion(bf.readLine());
              System.out.println("Edad: ");
              clientes[i].setEdad(sc.nextInt());
       }
               }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       int opc = 100;
       int opc2 = 100;
       int opc3 = 100;
       while (opc !=4){
           System.out.println("-------------------------");
           System.out.println("1) Agregar a un cliente: ");
           System.out.println("2) Mostrar informacion de todos los clientes: ");
           System.out.println("3) Buscar a un cliente: ");
           System.out.println("0) Cerrar sistema: ");
           System.out.println("Elige una opcion: ");
           opc = sc.nextInt();
           switch(opc){
               case 1:
                   if(espacio <clientes.length){
               for (cliente cliente : clientes) {
                   System.out.println("codigo: ");
                   cliente.setcodigocliente(sc.nextInt());
                   System.out.println("nombre: ");
                   cliente.setnombre(bf.readLine());
                   System.out.println("ApellidoPaterno: ");
                   cliente.setApellidoPaterno(bf.readLine());
                   System.out.println("ApellidoMaterno: ");
                   cliente.setApellidoMaterno(bf.readLine());
                   System.out.println("Telefono: ");
                   cliente.setTelefo(bf.readLine());
                   System.out.println("Direccion: ");
                   cliente.setDireccion(bf.readLine());
                   System.out.println("Edad: ");
                   cliente.setEdad(sc.nextInt());
               }
                   }
                   else{
                    System.out.println("No hay espacios disponibles: ");
                   }
                   System.out.println("-------------------------");
                   break;
               case 2:
                   for(int i=0; i<clientes.length; i++){
                       System.out.println("10 " + clientes[i].getcodigoCliente());
                       System.out.println("nombre " + clientes[i].getnombre());
                       System.out.println("ApellidoPaterno " + clientes[i].getApellidoPaterno());
                       System.out.println("ApellidoMaterno " + clientes[i].getApellidoMaterno());
                       System.out.println("Telefono " + clientes[i].getTelefono());
                       System.out.println("Direccion " + clientes[i].getDireccion());
                       System.out.println("Edad " + clientes[i].getEdad());
                  }
                   System.out.println("-------------------------");
                   break;
               case 3:
                   while(opc3 !=0){       
                       System.out.println("-----Menu secundario-----");
                       System.out.println("1) Buscar por codigo");
                       System.out.println("2) Buscar por nombre");
                       System.out.println("0) Regresar al menu anterior");
                       System.out.println("Elige una opcion");
                       opc3 = sc.nextInt();
                       switch(opc3){
                           case 1:
                               int pos = -1;
                               for(int i=0; i<clientes.length; i++){
                                   if(cliente[i].getcodigoCliente().equals(codigoCliente)){
                                       System.out.println("Registro encontrado:");
                                       pos = i;
                                   }
                                   else{
                                       System.out.println("No se ha encontrado al cliente: ");
                                   }
                               }
                               break;
                           case 2:
                               int pos = -1;
                               for(int i=0; i<clientes.length; i++){
                                   if(cliente[i].getnombre().equals(nombre)){
                                       System.out.println("Registro encontrado: ");
                                       pos = i; 
                                   }
                                   else{
                                       System.out.println("No se ha encontrado el cliente: ");
                                   }
                               }
                               break;
                           case 0:
                               System.out.println("Gracias, que tengas un buen dia: ");
                               break;
                       }
                   }
                   
               case 0:
                   System.out.println("Que tengas un buen dia: ");
                   break;
           }
       }
    }
}
