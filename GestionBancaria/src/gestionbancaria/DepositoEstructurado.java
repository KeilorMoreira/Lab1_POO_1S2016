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
public class DepositoEstructurado extends Deposito{
    private double tipoInteresVariable;
    private double capitalVariable;

    public DepositoEstructurado(double tipoInteresVariable, double capitalVariable, double capital, int dias, double tipoInteres) {
        super(capital, dias, tipoInteres);
        this.tipoInteresVariable = tipoInteresVariable;
        this.capitalVariable = capitalVariable;
    }

    public double getTipoInteresVariable() {
        return (this.getCapital() * tipoInteresVariable * this.getDias())/365;
    }

    public void setTipoInteresVariable(double tipoInteresVariable) {
        this.tipoInteresVariable = tipoInteresVariable;
    }

    public double getCapitalVariable() {
        return capitalVariable;
    }

    public void setCapitalVariable(double capitalVariable) {
        this.capitalVariable = capitalVariable;
    }

    @Override
    public String toString() {
        return "DepositoEstructurado{" + "tipoInteresVariable=" + tipoInteresVariable + ", capitalVariable=" + capitalVariable + '}';
    }
    
    @Override
    public double getCapital(){
        return super.getCapital() + this.getCapitalVariable();
    }
    
}
