/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(10, 5.7);
        Figura triangulo = new Triangulo(4, 7);

        System.out.println("Área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo es: " + triangulo.calcularArea());
    }
}

