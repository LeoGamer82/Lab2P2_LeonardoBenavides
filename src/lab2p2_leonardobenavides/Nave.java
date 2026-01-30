/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public class Nave {
    private String nombre;
    private int ataque;
    private int escudos;
    private double velocidad;

    public Nave(String nombre, int ataque, int escudos, double velocidad) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.escudos = escudos;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getEscudos() {
        return escudos;
    }

    public void setEscudos(int escudos) {
        this.escudos = escudos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return  this.nombre + "\n" +  
                "Potencia de generador de escudo: " + this.escudos + 
                "\n" + "Poder de ataque: " + this.ataque + 
                "\n" + "Velocidad de nave: " + this.velocidad;
    }
    
    public void informacion(){
        System.out.println(this);
    }
    
    
    
    
}


