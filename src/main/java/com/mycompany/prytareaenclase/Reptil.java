/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prytareaenclase;

/**
 *
 * @author HP
 */
public class Reptil extends Animal{
    // ATRIBUTOS
public String tiposDeEscamas;
//CONSTRUCTOR
 public Reptil(String nombre, int edad, String tiposDeEscamas) {
 super(nombre, edad);
 this.tiposDeEscamas=tiposDeEscamas;
 }
 //METODO
 public void mtArrastrarse(){
 System.out.println(nombre+" SE ESTA ARRASTRANDO CON SUS ESCAMAS DE TIPO "+tiposDeEscamas);
 }

}
