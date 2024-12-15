/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prytareaenclase;

/**
 *
 * @author HP
 */
public class Ave extends Animal{
    //ATRIBUTOS
public double envergaduraAlas;
//CONSTRUCTOR
 public Ave(String nombre, int edad, double envergaduraAlas) {
 super(nombre, edad);
 this.envergaduraAlas=envergaduraAlas;
 }
 //METODO
 public void mtVolar(){
 System.out.println(nombre+" ESTA VOLANDO CON UNA ENVERGADURA DE "+envergaduraAlas+" METROS.");
}
}