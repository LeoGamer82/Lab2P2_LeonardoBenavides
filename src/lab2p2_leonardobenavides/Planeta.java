/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public class Planeta {
    private String nombre;
    private String sistemaEstelar;
    private int defensa;
    private int escudos;
    private double flota;
    private double creditosProducidos;

    public Planeta(String nombre, String sistemaEstelar, int defensa, int escudos, double flota, double creditosProducidos) {
        this.nombre = nombre;
        this.sistemaEstelar = sistemaEstelar;
        this.defensa = defensa;
        this.escudos = escudos;
        this.flota = flota;
        this.creditosProducidos = creditosProducidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSistemaEstelar() {
        return sistemaEstelar;
    }

    public void setSistemaEstelar(String sistemaEstelar) {
        this.sistemaEstelar = sistemaEstelar;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getEscudos() {
        return escudos;
    }

    public void setEscudos(int escudos) {
        this.escudos = escudos;
    }

    public double getFlota() {
        return flota;
    }

    public void setFlota(double flota) {
        this.flota = flota;
    }

    public double getCreditosProducidos() {
        return creditosProducidos;
    }

    public void setCreditosProducidos(double creditosProducidos) {
        this.creditosProducidos = creditosProducidos;
    }

    @Override
    public String toString() {
        return  this.nombre + " - " + this.sistemaEstelar + "\n" +
                "Torretas de defensa planetaria: " + this.defensa + "\n" +
                "Poder de generador de escudos: " + this.escudos + "\n" +
                "Flota de defensa del planeta: " + this.flota + "\n" +
                "Creditos producidos: " +  this.creditosProducidos;
    }
    
    public void informacion(){
        System.out.println(this);
    }
    
    
}
