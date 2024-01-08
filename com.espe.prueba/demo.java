package com.espe.prueba;

import com.espe.controlador.ClienteControlador;
import com.espe.modelo.ClienteBean;
import com.espe.vista.ClienteVista;
public class demo {
    public static void main(String[] args) {
        // objeto vista y modelo
        ClienteBean oModelo = llenarDatosCliente();
        ClienteVista oVista = new ClienteVista();

        // objeto controlador y pasamos la vista y el modleo
        ClienteControlador oControlador = new ClienteControlador(oVista, oModelo);
        oControlador.actualizarVista();

    }
    // se muestra los datos del cliente
    private static ClienteBean llenarDatosCliente() {
        ClienteBean cliente = new ClienteBean();
        cliente.setIdCli(1);
        cliente.setNombreCli("Angel");
        cliente.setApellidoCli("Angel");
        cliente.setCedulaCli("Angel");
        return cliente;
    }
}
