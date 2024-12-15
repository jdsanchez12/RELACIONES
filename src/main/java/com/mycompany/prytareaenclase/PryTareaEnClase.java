/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prytareaenclase;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PryTareaEnClase {

    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);   
int raza;
System.out.println("INGRESE EL NOMBRE DEL ANIMAL: ");
           String nombre=scanner.nextLine();
 System.out.print("Introduce la edad del animal: ");
        int edad = scanner.nextInt();
 //GENERA LA OPCION PARA LA RAZA
        System.out.println("ESCOGA UNA RAZA DE ANIMAL DEL 1 AL 3");
        System.out.println("1. MAMIFERO");
        System.out.println("2. AVE");
        System.err.println("3. REPTIL");
        raza=scanner.nextInt();
// Limpiar el buffer
        scanner.nextLine();        
// Crear el animal según la opción seleccionada
        Animal animal=null;
        if(raza==1){
           System.out.println("Introduce el tipo de pelaje del mamifero: ");
                String tipoPelaje = scanner.nextLine();
                animal = new Mamifero(nombre, edad, tipoPelaje);   
        }else if(raza==2){
            System.out.println("Introduce la envergadura de las alas del ave (en metros): ");
                double envergaduraAlas = scanner.nextDouble();
                animal = new Ave(nombre, edad, envergaduraAlas);
        }else if(raza==3){
             System.out.println("Introduce el tipo de escamas del reptil: ");
                String tiposDeEscamas = scanner.nextLine();
                animal = new Reptil(nombre, edad, tiposDeEscamas);
           
        }else{
             System.out.println("Opción no válida. Creando un animal por defecto.");
                animal = new Animal(nombre, edad);
        }
  // Mostrar el comportamiento del animal
        if (animal != null) {
            animal.mtComer();
            if (animal instanceof Mamifero) {
                ((Mamifero) animal).mtAmamantarCrias();
                ((Mamifero) animal).mtPelaje();
            } else if (animal instanceof Ave) {
                ((Ave) animal).mtVolar();
                
            } else if (animal instanceof Reptil) {
                ((Reptil) animal).mtArrastrarse();
               
            }
 }

    }
}
