/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbancaria;

/**
 *
 * @author keilor
 */
public class Deposito {
    private double capital;
    private int dias;
    private double tipoInteres;
    private Persona titular;

    public Deposito(double capital, int dias, double tipoInteres) {
        this.capital = capital;
        this.dias = dias;
        this.tipoInteres = tipoInteres;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTipoInteres() {
        return ((this.getDias() * tipoInteres * this.getCapital())/365);
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        return "Deposito{" + "capital=" + capital + ", dias=" + dias + ", tipoInteres=" + tipoInteres + ", p=" + titular.toString() + '}';
    }
    
    public final double liquidar(){
        return this.getCapital() + this.getTipoInteres();
    }

}
