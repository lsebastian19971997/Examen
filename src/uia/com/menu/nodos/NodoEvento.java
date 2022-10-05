package uia.com.menu.nodos;

import uia.com.menu.NodoMenu;

public class NodoEvento extends NodoMenu implements TipoNodo {

    NodoRecordatorio recordatorio=null;
    public NodoEvento() {
    }

    public NodoEvento(String tipo, String fecha, String fechaRecordatorio, String nombre)
    {
        recordatorio = new NodoRecordatorio(tipo, fecha, fechaRecordatorio, nombre);
    }

    public NodoRecordatorio getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(NodoRecordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }


    @Override
    public void setNodo() {

    }
}
