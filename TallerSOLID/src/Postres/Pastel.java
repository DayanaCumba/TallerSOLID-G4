/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Leche.LecheDeslactosada;
import Leche.LecheEntera;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{
	public Pastel( String sabor, double precioParcial) {
		super("Pastel",sabor, precioParcial);
	}

        @Override
	public void cambiarLeche(LecheEntera leche_cambio) {
		if (leche_cambio.getClass()==LecheDeslactosada.class) {
			System.out.println("No se puede usar leche deslactosada para un Pastel!!");
		}
                else {leche_cambio.usar();}
		
	}
        @Override
        public String toString() {
            return "Pastel{" + "sabor= " + sabor + ", precioParcial= $" + precioParcial + ", aderezos= " + aderezos + '}';
    }
	

    
}
