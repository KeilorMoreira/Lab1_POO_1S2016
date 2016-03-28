/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_poo_1s2016;
import java.util.ArrayList;

/**
 *
 * @author keilor
 */
public class Libro {
    private String titulo;
    private String nombreAutor;
    private String codigoISBN;
    private ArrayList<Capitulo> caps;
    
    public Libro(String titulo, String nombreAutor, String codigo){
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.codigoISBN = codigo;
        caps = new ArrayList();
        
    }
    public void agregarCapitulo(String titulo, int cantPag){
        Capitulo c = new Capitulo(titulo, cantPag);
        caps.add(c);
    }
    //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }
    //

    @Override
    public String toString() {
        String capit = "";
        for(int i=0;i<caps.size();i++){
            capit += caps.get(i).toString() + "\n";
        }
        return "Libro: " + "titulo=" + this.getTitulo() + "\nAutor: " + this.getNombreAutor() + "\nISBN: " + this.getCodigoISBN() + "\nCapítulos:\n" + capit;
    }
    
}
    
