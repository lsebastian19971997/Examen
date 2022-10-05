package uia.com.menu.nodos;
import uia.com.menu.*;

public class NodoRecordatorio extends NodoMenu implements TipoNodo {

    String mensaje = "";

    String tipo;
    String fecha;
    String fechaRecordatorio;
    String nombre;


    public NodoRecordatorio(String titulo, String subTitulo, String[] opciones, String seleccion, String subSeleccion, int tipo) {
        super(titulo, subTitulo, opciones, seleccion, subSeleccion, tipo);

    }

    public NodoRecordatorio() {
        super();
    }

    public NodoRecordatorio(String tipo, String fecha, String fechaRecordatorio, String nombre) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.fechaRecordatorio = fechaRecordatorio;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(String fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    /*
    @Override
    public void pregunta(){


    }

     */


    @Override
    public void setNodo() {

    }


}