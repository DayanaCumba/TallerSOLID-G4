/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    public LecheEntera leche_nueva;

    public ManejadorDeLeche(LecheEntera leche_nueva) {
        this.leche_nueva = leche_nueva;
    }

    public void cambiarTipoLeche(Postre postre){
        postre.cambiarLeche(leche_nueva);
    }
    
}
