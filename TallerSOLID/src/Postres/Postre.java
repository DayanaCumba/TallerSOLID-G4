package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;
import Adicionales.Crema;
import Leche.LecheEntera;

public abstract class Postre {
    //Atributos de la clase abstracta Postre
    protected String nombre;
    protected String sabor;
    protected double precioParcial;
    protected  ArrayList<Aderezo> aderezos;
    
    //Metodo constructor
    public Postre(String nombre,String sabor, double precioParcial){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = precioParcial;
        this.nombre= nombre;
    }
    
    public double getprecioParcial() {return this.precioParcial;}
    public void setprecioParcial(double precio) { precioParcial=precio;}
    
    public String getsabor() {return this.sabor;}
    public void setsabor(String sabor) { this.sabor=sabor;}
    
    public ArrayList<Aderezo> getAderezos() { return aderezos;}
    public void addAderezos(Aderezo aderezo){ this.aderezos.add(aderezo);}
    public void quitarAderezo( Aderezo aderezo){this.getAderezos().remove(aderezo);}
    
    public abstract void cambiarLeche(LecheEntera leche_cambio);



}
