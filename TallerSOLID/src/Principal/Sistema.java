/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
  public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla",1.75);
        arrPostres.add(helado_vainilla);
        

        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate",4.50);
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            
            ManejadorDePrecio mnj_precio= new ManejadorDePrecio();
         
            System.out.println( mnj_precio.showPrecioFinal( postre.getprecioParcial(), postre.getAderezos() ));
            });


    }
}
