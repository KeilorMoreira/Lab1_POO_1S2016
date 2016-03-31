/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_poo_1s2016;
import java.util.ArrayList;
/**
 *
 * @author keilor Moreira Alvarado
 */
public class Estudiantes {
    private String nombre;
    private int carne;
    private String carerra;
    private String correo;
    private int multa;
    private int tel;
    private ArrayList<Libro>pretados;

    public Estudiantes(int tel) {
        this.tel = tel;
    }
    
    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getCarerra() {
        return carerra;
    }

    public void setCarerra(String carerra) {
        this.carerra = carerra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Estudiantes(String nombre, int carne, String carerra, String correo, int multa) {
        this.nombre = nombre;
        this.carne = carne;
        this.carerra = carerra;
        this.correo = correo;
        this.multa = multa;
    }   
    
}