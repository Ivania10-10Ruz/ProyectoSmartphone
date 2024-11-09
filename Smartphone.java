/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosmartphone;

/**
 *
 * @author Graciela
 */
public class Smartphone {
    private String modelo; // Atributo privado que guarda el modelo del teléfono

    public Smartphone(String modelo) {
        this.modelo = modelo;
    }

    // Método público para encender el teléfono
    public void encender() {
        System.out.println("El teléfono " + modelo + " se está encendiendo.");
    }

    // Método público para hacer una llamada
    public void hacerLlamada(String numero) {
        System.out.println("Llamando al " + numero + " desde " + modelo + ".");
    }

    // Método público para enviar un mensaje
    public void enviarMensaje(String numero, String mensaje) {
        System.out.println("Enviando mensaje a " + numero + ": " + mensaje);
    }
}

