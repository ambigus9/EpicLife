package app.uis.epiclife;

/**
 * Clase Mision  encargada de contener los aspectos de las misiones llevadas a
 * cabo por el jugador
 *
 * @author Miguel Alberto Plazas Wadynski y Henry Andrés Jimenez Herrera
 * @version 08-11-16
 */

import java.util.ArrayList;

public class Mision
{
    // El estado de la mision indica si el jugador a completado la mision;
    private boolean completada;
    // Nombre de la mision
    private String nombre;
    // Descripción de la mision
    private String descripcion;
    // monedas de oro que se consiguen al completar la mision
    private int monedas;
    // contiene los objetivos de la misión.
    private ArrayList<Objetivo> objetivos;
    // Factor de la salud asociado (Nutrición.Ejercicio físico.Descanso); solo puede tener un factor.
    private String factor;
    // Tiempo maximo para cumplir la mision.
    private int tiempo;

    /**
     * @param nombre Nombre de la misión
     * @param descripcion Descripcion de la misión
     * @param monedas Monedas de oro otorgadas por la misión
     * @param factor Factor asociado a la Salud
     * @param objetivos Objetivos de la misión, contiene nombre y si es o no completada
     * @param tiempo Tiempo para cumplir la misión
     **/
    public Mision (String nombre, String descripcion, int monedas,ArrayList<Objetivo> objetivos, String factor, int tiempo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monedas = monedas;
        this.objetivos = objetivos;
        this.factor = factor;
        this.tiempo = tiempo;
        completada=false;
    }

    /**
     * Retorna el estado de la mision (True=Activa, False=No activa)
     * @return estado Estado de la mision (True=Activa, False=No activa)
     */
    public boolean getCompletada(){
        return completada;
    }

    /**
     * Marca como finalizada la misión y añade las monedas que ha ganado el personaje
     */
    public int finalizarMision(){
        System.out.println("Misión "+nombre+" Completada");
        completada=true;
        return monedas;
    }

    /**
     * Imprime los objetivos de la mision y el estado de cada objetivo
     */
    public void imprimirObjetivos(){
        for(Objetivo i: objetivos){
            System.out.println(i);
        }
    }


    /**
     * Sobreescribimos el metodo toString para que imprima la información de
     * la mision a nuestar manera
     * @return mensaje Descripción general de la mision
     */
    @Override
    public String toString (){
        String mensaje=nombre+" Descripcion: "+descripcion + " Recompensa: " + monedas+" Estado";
        if(completada){mensaje+=" Completada";}else {mensaje+=" Incompleta";}
        return mensaje;
    }
}