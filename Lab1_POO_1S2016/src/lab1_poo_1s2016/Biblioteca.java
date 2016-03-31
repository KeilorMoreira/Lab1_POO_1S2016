/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_poo_1s2016;

/**
 *
 * @author keilor Moreira Alvarado
 */
public class Biblioteca {
    public static void main(String[] args) {
        
        Libro lib = new Libro("Veronica decide morir","Gabriel Garcia Marquez","Vsg34");
        lib.agregarCapitulo("Primer Cap",5);
        lib.agregarCapitulo("Segundo Cap",28);
        System.out.println(lib.toString());
    }
}
