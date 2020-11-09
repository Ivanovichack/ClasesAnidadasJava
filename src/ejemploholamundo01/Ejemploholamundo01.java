/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploholamundo01;

import java.util.Scanner;

/**
 *
 * @author FASARLJP
 */
public class Ejemploholamundo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La inicial del nombre de una clase será mayúscula.
        // El nombre de un objeto deberá iniciar en minúscula.
        // El nombre de un método deberá iniciar con minúscula a excepción del constructor.
        // Los atributos de una clase deberán ser declarados con el modificador de acceso private.
        // Para consultar o modificar el valor de un atributo se utilizaran los métodos set y get.
        // Los métodos que genere el usuario (Programador) no deben solicitar ni mostrar información en pantalla. Recibir a través de parámetros. Retor instrucción.
        // Las constantes deberan ser todas en mayusculas , si hay necesidad de dos o mas palabras se debe usar el _.
        
        
       
        
        Celular miCelular;
        String numero= "7474734566";
        String marca="Lg";
        String nombre="Flor Selene";
        int edad=23; 
        
        
       // miCelular= new Celular (numero, marca, nombre, edad);
        
        //Mostrar todos los datos
 
        

        
        
      /*
       miCelular=null ;
        
        System .out.println("Numero de celular:"+ miCelular.getNumero());
        System .out.println("Marca del celular:"+ miCelular.getMarca());
        System .out.println("Nombre del`propietario:"+ miCelular.getPropietario().getNombre());
        System .out.println("Edad del propietario:"+ miCelular.getPropietario().getEdad());
*/
    }
    {
        // TODO code application logic here
          Scanner sn = new Scanner(System.in);
         Scanner sc= new Scanner (System.in);
         Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 String nombre=null,marca=null,numero=null,edad=null;
        while (!salir) {
 
            System.out.println("1.Agregar datos del celular ");
            System.out.println("2. Mostrar todos los datos del celular");
            System.out.println("3. Salir");
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado agregar datos al celular");
                        System.out.println("Ingrese su nombre");
                        nombre =in.next();
                        System.out.println("Ingrese su edad");
                        edad= in.next();
                        System.out.println("Ingrese numero telefonico");
                        numero= in.next();
                        System.out.println("Ingrese marca del celular?");
                        marca= in.next();
                        break;
                    case 2: 
                        System.out.println("Has seleccionado mostrar todos los datos del celular");
                        System.out.println("Nombre:"+nombre);
                        System.out.println("Edad:"+edad);
                        System.out.println("Numero Telefonico:"+numero);
                        System.out.println("Marca de celular"+marca);
                        System.out.println("");
                        
                        break;
                        
                        
                    case 3:
                        salir = true;
                        break;
                 
                    
                }
           
            }
       
        }
   }

    

