/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_leonardobenavides;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author leobe
 */
public class Lab2P2_LeonardoBenavides {

    static double creditos = 1000;
    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Nave> naves = new ArrayList<>();
    static ArrayList<Planeta> planetasImperial = new ArrayList<>();
    static ArrayList<Planeta> planetasAlianza = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;

        do {
            switch (Menu()) {
                case 1:
                    agregarNaves(creditos);
                    break;
                case 2:
                    descubrirPlanetas();
                    break;
                case 3:
                    verPlanetas();
                    break;
                case 4:
                    verFlota();
                    break;
                case 5:
                    mejorarInfraestructura();
                    break;
                case 6:
                    mejorarNave();
                    break;
                case 7:
                    break;
                case 8:
                    continuar = false;

            }
        } while (continuar);
    }

    public static int Menu() {

        System.out.println("-- Star Wars Conquista Galactica en Java -- ");
        System.out.println("");
        System.out.println("-- Bienvenido al Centro de Comando de la Alianza Rebelde, que la fuerza lo acompane ");
        System.out.println("");
        System.out.println("Recursos de la Alianza Rebelde ");

        System.out.println("Creditos: " + creditos);
        System.out.println("Planetas conquistados: ");
        System.out.println("Naves en flota: ");
        System.out.println("-- Menu de Opciones -- ");
        System.out.println("1. Agregar nave ");
        System.out.println("2. Descubrir planetas ");
        System.out.println("3. Ver planetas ");
        System.out.println("4. Ver flota ");
        System.out.println("5. Mejorar infraestructura del planeta ");
        System.out.println("6. Mejorar nave espacial");
        System.out.println("7. Atacar planeta imperial ");
        System.out.println("8. Salir ");
        System.out.println("Ingrese opcion: ");
        int opcion = leer.nextInt();
        return opcion;
    }

    public static void agregarNaves(double creditos) {
        System.out.println("Ingrese nombre de la nave: ");
        leer.nextLine();
        String nombre = leer.nextLine();

        System.out.println("Ingrese el poder de ataque de la nave (100-500): ");
        int ataque = leer.nextInt();
        System.out.println("Ingrese potencia de escudos de la nave (200-800): ");
        int escudos = leer.nextInt();
        System.out.println("Ingrese velocidad de la navidad (100-300): ");
        double velocidad = leer.nextDouble();

        System.out.println("Se anadio la siguiente nave a la flota de la alianza rebelde: ");
        double total = ataque + escudos + velocidad;
        creditos = creditos - total;

        Nave nave = new Nave(nombre, ataque, escudos, velocidad);

        naves.add(nave);

        nave.informacion();
    }

    public static void descubrirPlanetas() {
        String[] arregloEstelar = {"Nucleo galactico", "Borde medio", "Borde exterior"};
        int seleccionAleatoria = random.nextInt(arregloEstelar.length);
        System.out.println("Nombre del planeta: ");
        leer.nextLine();
        String nombre = leer.nextLine();
        String sistemaEstelar = "Nucleo galactico";
        int defensa = random.nextInt(1500, 2500);
        int escudo = random.nextInt(1500, 3000);
        int flota = 1000 + random.nextInt(1000, 2500);
        int creditosProducidos = random.nextInt(100, 400);

        System.out.println("Se ha descubierto el siguiente planeta en el espacio Imeperial ");
        Planeta planeta = new Planeta(nombre, sistemaEstelar, defensa, escudo, flota, creditosProducidos);
        planetasImperial.add(planeta);
        System.out.println(planetasImperial.toString());
    }

    public static void verPlanetas() {
        System.out.println("*** Conectando a la base de datos de Yavin 4 *** ");
        System.out.println("Elija el planeta que desea ver:  ");
        System.out.println("1. Planetas en espacio imperial ");
        System.out.println("2. Planetas en espacio rebelde ");
        System.out.println("Seleccionar opcion ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Planetas en espacio imperial ");
                for (int indice = 0; indice < planetasImperial.size(); indice++) {
                    planetasImperial.get(indice).informacion();
                }
                break;
            case 2:
                for (int indice = 0; indice < planetasAlianza.size(); indice++) {
                    planetasAlianza.get(indice).informacion();
                }
                break;
        }
    }

    public static void verFlota() {
        System.out.println("Naves en la flota rebelde: ");
        for (int indice = 0; indice < naves.size(); indice++) {
            naves.get(indice).informacion();
        }

    }

    public static void mejorarInfraestructura() {

        System.out.println("Selecciona planeta a mejorar: ");
        verPlanetas();
        System.out.println("Elija el indice del planeta ");
        int seleccionar = leer.nextInt();
        if (seleccionar <= 0 && seleccionar <= planetasAlianza.size()) {
            System.out.println("Que desea mejorar: ");
            System.out.println("1. Torretas de defensa ");
            System.out.println("2. Generador de escudos ");
            System.out.println("3. Flota planetaria ");
            System.out.println("Seleccione opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos potencia desea anadir a sus torretas de defensa en grupos de 10? (100 creditos c/u)");
                    int mejoraDefensa = leer.nextInt();
                    int mejorTotalDefensa = mejoraDefensa * 10;
                    creditos = creditos - mejoraDefensa * 100;
                    System.out.println("Mejora realizada! ");
                    System.out.println("Defensa de " + planetasAlianza.get(seleccionar).getNombre() + ":"
                            + planetasAlianza.get(seleccionar).getDefensa() + "->");
                    planetasAlianza.get(seleccionar).setDefensa(++mejorTotalDefensa);
                    System.out.println(planetasAlianza.get(seleccionar).getDefensa());
                    System.out.println("Creditos gastados: " + creditos);
                    break;
                case 2:
                    System.out.println("Cuantos potencia desea anadir a sus generadores de escudos en grupos de 10? (100 creditos c/u)");
                    int mejoraEscudos = leer.nextInt();
                    int mejorTotalEscudos = mejoraEscudos * 10;
                    creditos = creditos - mejoraEscudos * 100;
                    System.out.println("Mejora realizada! ");
                    System.out.println("Defensa de " + planetasAlianza.get(seleccionar).getNombre() + ":"
                            + planetasAlianza.get(seleccionar).getEscudos() + "->");
                    planetasAlianza.get(seleccionar).setEscudos(++mejorTotalEscudos);
                    System.out.println(planetasAlianza.get(seleccionar).getEscudos());
                    System.out.println("Creditos gastados: " + creditos);
                    break;
                case 3:
                    System.out.println("Cuantos potencia desea anadir a sus torretas de defensa en grupos de 10? (100 creditos c/u)");
                    double mejoraFlota = leer.nextInt();
                    double mejorTotalFlota = mejoraFlota * 10;
                    creditos = creditos - mejoraFlota * 100;
                    System.out.println("Mejora realizada! ");
                    System.out.println("Defensa de " + planetasAlianza.get(seleccionar).getNombre() + ":"
                            + planetasAlianza.get(seleccionar).getDefensa() + "->");
                    planetasAlianza.get(seleccionar).setFlota(++mejorTotalFlota);
                    System.out.println(planetasAlianza.get(seleccionar).getFlota());
                    System.out.println("Creditos gastados: " + creditos);
                    break;
                default:
            }

        }

    }
    public static void mejorarNave(){
       
        System.out.println("-- Se le encargo a los mecanicos  sulusteanos de la alianza mejorar una nave de la flota! --");
        System.out.println("Seleccione una nave a mejorar ");
        verFlota();
        
        System.out.println("Elija el indice de la nave ");
        int seleccionar = leer.nextInt();
        
        if(seleccionar>=0&&seleccionar<=naves.size()){
            System.out.println("Seleccione que desea mejorar: ");
            System.out.println("1. Ataque  ");
            System.out.println("2. Defensa ");
            System.out.println("3. Velocidad ");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cuanto poder de ataque desea anadir, en grupos de 5? (50 creditos c/u)");
                    int mejoraAtaque = leer.nextInt();
                    int multiplicadorAtaque = mejoraAtaque * 5;
       
                    System.out.println("Mejora realizada! ");
                    naves.get(seleccionar).setAtaque(naves.get(seleccionar).getAtaque()+multiplicadorAtaque);
                    System.out.println("Ataque de " + naves.get(seleccionar).getNombre() + ":" + naves.get(seleccionar).getAtaque());
                    break;
                case 2:
                    System.out.println("Cuanta potencia al generador de escudo desea anadir, en grupos de 5? (50 creditos c/u)");
                    
                    break;
                case 3:
                    System.out.println("Cuanto velocidad desea anadir, en grupos de 5? (50 creditos c/u)");
                    
                    break;
            }
        }
            
    }

}
