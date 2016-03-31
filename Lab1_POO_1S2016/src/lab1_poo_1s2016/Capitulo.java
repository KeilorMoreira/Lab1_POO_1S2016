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

public class Capitulo {
    private String titulo;
    private int cantPag;
    
    public Capitulo(String titulo, int cantPag){
        this.titulo = titulo;
        this.cantPag = cantPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    @Override
    public String toString() {
        return "\ttítulo= " + titulo + ", Páginas= " + cantPag +"\n";
    }
    
}
