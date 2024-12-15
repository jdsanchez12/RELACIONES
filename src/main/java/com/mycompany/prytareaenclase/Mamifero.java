/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prytareaenclase;

/**
 *
 * @author HP
 */
public class Mamifero extends Animal{
     //ATRIBUTOS
public String tipoPelaje;
//CONSTRUCTOR
 public Mamifero(String nombre, int edad, String tipoPelaje) {
 super(nombre, edad);
 this.tipoPelaje=tipoPelaje;
 }
 //METODO
 public void mtAmamantarCrias(){
 System.out.println(nombre+ " ESTA AMAMANTANDO SUS CRIAS");
 }
 public void mtPelaje(){
     System.out.println(nombre+" TIENE TIPO DE PELAJE: "+tipoPelaje);
 }
}
