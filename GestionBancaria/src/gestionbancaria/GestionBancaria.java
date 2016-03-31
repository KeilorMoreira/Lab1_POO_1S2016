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
public class GestionBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Persona pablo = new Persona ("1-111-111","Pablo Martinez","Santa Clara");
       Deposito d1 = new Deposito(12000,90,2);
       d1.setTitular(pablo);
       
       DepositoEstructurado d2 = new DepositoEstructurado(2,25000,10000000,180,3);
       d2.setTitular(pablo);
       
       System.out.println("Capital deposito 1" + d1.getCapital() );
       System.out.println("Capital deposito 2" + d2.getCapital() );
       
       System.out.println("Liquidar deposito 1" + d1.liquidar() );
       System.out.println("Liquidar deposito 2" + d2.liquidar() );
       
    }
    
}
