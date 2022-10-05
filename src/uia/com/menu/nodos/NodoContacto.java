package uia.com.menu.nodos;

import uia.com.menu.NodoMenu;

import java.util.HashMap;

public class NodoContacto extends NodoMenu implements TipoNodo {

    String nombre="";

    HashMap<String, NodoEvento> eventos = new HashMap<String, NodoEvento>();

    public NodoContacto(String nom)
    {
        nombre=nom;
    }

    public NodoContacto(String tipo, String fecha, String fechaRecordatorio, String nombre) {
        agregaEvento(tipo, fecha, fechaRecordatorio, nombre);
    }

    public NodoContacto() {

    }

    public void agregaEvento(String tipo, String fecha, String fechaRecordatorio, String nombre)
    {
        NodoEvento newEvento = new NodoEvento(tipo, fecha, fechaRecordatorio, nombre);
        eventos.put(fecha, newEvento);
    }

    public HashMap<String, NodoEvento> getEventos() {
        return eventos;
    }

    public void setEventos(HashMap<String, NodoEvento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public void setNodo() {

    }
}