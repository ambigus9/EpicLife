package app.uis.epiclife;

/**
 * Clase Evento  encargada de manejar las propiedades de los eventos y las
 * instancias de los mismos cada evento cuenta con una lista de misiones en
 * particular, un nombre y una descripción.
 *
 * @author Miguel Alberto Plazas Wadynski y Henry Andrés Jimenez Herrera
 * @version 2016/12/08
 */
import java.util.ArrayList;

public class Evento
{

    //Nombre del evento
    private String nombre;
    // Descripcion del evento
    private String descripcion;
    // Lista de misiones del evento
    private ArrayList<Mision> misiones;
    // Tipo de evento {Batalla,Entrenamiento,Investigacion}
    private String tipo;
    // Indica si el evento ha sido completado (True, evento completado, false evento incompleto).
    private Boolean estado;

    /**
     * @param nombre Nombre del evento
     * @param descripcion Descripcion del evento
     * @param misiones de Misiones Lista de misiones del evento
     * @param tipo Tipo de evento: Batalla, Entrenamiento o Investigación
     **/
    public Evento (String nombre, String descripcion, ArrayList<Mision> misiones,String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.misiones = misiones;
        this.tipo = tipo;
        estado=false;
    }


    /**
     * Retorna la lista de misiones que componen el evento
     * @return misiones retorna lista de misiones del evento.
     */
    public ArrayList<Mision> getMisiones(){
        return misiones;
    }


    /**
     * Retorn el estado del evento(True, evento completado, false evento incompleto).
     */
    public boolean getEstado(){
        return estado;
    }


    /**
     * Finaliza el evento
     */
    public void finEvento()
    {
        estado=true;
    }

    /**
     * Retorna el nombre del evento
     * @return nombre Nombre del evento
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Retorna la descripcion del evento
     * @return descripcion Descripcion del evento
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Retorn el tipo de evento {Batalla,Entrenamiento,Investigacion}
     */
    public String getTipoEvento(){
        return tipo;
    }

    /**
     * Imprime las descripciones de las misiones del evento
     */
    public void imprimirMisionesActivas(){
        int c=0;
        for(Mision i: misiones){
            if(i.getCompletada()==false){
                System.out.println(c+") "+i);
                c++;
            }
        }
    }

    /**
     * Evalua si las misiones del evento ya se completaron.
     */
    public void validarMisiones(){
        boolean eventoCompleto=true;
        for(Mision i: misiones){
            if(i.getCompletada()==false){
                eventoCompleto=false;
            }
        }
        if(eventoCompleto){
            System.out.println("Felicidades evento finalizado con exito");
            finEvento();
        }
    }


    /**
     * Sobreescribimos el metodo toString para que imprima la información del
     * evento a nuestar manera
     * @return mensaje Descripción general del evento
     */
    @Override
    public String toString (){
        String mensaje=nombre+" Descripcion: "+descripcion;
        return mensaje;
    }




}
