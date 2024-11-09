/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosmartphone;

/**
 *
 * @author Graciela
 */
public class ProyectoSmartphone {

    public static void main(String[] args) {
        // Crear una instancia de Smartphone
        Smartphone miTelefono = new Smartphone("Samsung Galaxy S22");

        // Usar los métodos del smartphone
        miTelefono.encender();
        miTelefono.hacerLlamada("123456789");
        miTelefono.enviarMensaje("987654321", "Hola, ¿cómo estás?");
    }
}

