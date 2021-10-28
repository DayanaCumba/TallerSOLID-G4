package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor, double precioParcial){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = precioParcial;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    // Metodo para añadir un aderezo
    public void anadirAderezo(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    // Metodo para eliminar un aderezo
    
    public void quitarAderezo( Aderezo aderezo){
        this.getAderezos().remove(aderezo);
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    

}
