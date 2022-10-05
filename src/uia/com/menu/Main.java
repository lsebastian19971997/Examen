package uia.com.menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception
    {
        System.out.println("Hola, iniciando prueba de concepto de menu, buena suerte");

        String[] opcionesMenuMain ={"Salir", "Contactos", "Eventos", "Recordatorios"};
        String[] opcionesMenuContactos ={"Salir", "Nuevo", "Modificar", "Borrar"};
        String[] opcionesMenuNuevoContacto ={"Salir", "Nombre", "Telefono"};

        String[] opcionesMenuRecordatorio = {"Salir", "Nuevo"};
        String[] opcionesMenuNuevoRecordatorio ={"Salir", "Nombre", "Fecha_Recordatorio", "Fecha_Evento"};

        NodoMenu menuPrincipal = new NodoMenu("Principal", "Introduzca la opción deseada ?:",  opcionesMenuMain, "", "", 0);
        menuPrincipal.setMenu("Contactos", "Contactos", "Introduzca la opción deseada ?:",  opcionesMenuContactos, "", "", 0);
        menuPrincipal.getNodoMenu("Contactos").getNodoMenu("Nuevo").setMenu("Nuevo", "Nuevo", "Introduzca la opción deseada ?:",  opcionesMenuNuevoContacto, "", "", 1);


        menuPrincipal.setMenu("Recordatorios", "Recordatorios", "Introduzca la opción deseada ?:",  opcionesMenuRecordatorio, "", "", 0);
        menuPrincipal.getNodoMenu("Recordatorios").getNodoMenu("Nuevo").setNodoRecordatorio("Nuevo", "Nuevo", "Introduzca la opción deseada ?:",  opcionesMenuNuevoRecordatorio, "", "", 1);

        menuPrincipal.pregunta();

    }
}
