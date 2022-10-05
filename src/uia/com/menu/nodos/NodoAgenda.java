package uia.com.menu.nodos;

import uia.com.menu.NodoMenu;

import java.util.HashMap;

public class NodoAgenda extends NodoMenu implements TipoNodo {

    HashMap<String, NodoContacto> contactos = new HashMap<String, NodoContacto>();

    public NodoAgenda() {
    }


    public void agregaEvento(String datosIn)
    {
        String tipo="";
        String fecha="";
        String fechaRecordatorio="";
        String nombre="";
        String contacto="";


        String[] arrSplit = datosIn.split(",");

        for (int i = 0; i < arrSplit.length; i++)
        {
            switch(i) {
                case 0:
                    contacto = arrSplit[0];
                    break;
                case 1:
                    tipo = arrSplit[1];
                    break;
                case 2:
                    fecha = arrSplit[2];
                    break;
                case 3:
                    fechaRecordatorio = arrSplit[3];
                    break;
                case 4:
                    nombre = arrSplit[4];
                    break;
                default:
                    break;
            }

            System.out.println(arrSplit[i]);
        }

        if(contactos.containsKey(contacto)) {
            NodoContacto newContacto = contactos.get(contacto);
            newContacto.agregaEvento(tipo, fecha, fechaRecordatorio, nombre);
        }
        else
        {
            NodoContacto newContacto = new NodoContacto(contacto);
            contactos.put(contacto, newContacto);
            newContacto.agregaEvento(tipo, fecha, fechaRecordatorio, nombre);
            System.out.println(newContacto.getEventos().get(fecha).recordatorio.mensaje);
        }
    }

    @Override
    public void setNodo() {

    }
}
