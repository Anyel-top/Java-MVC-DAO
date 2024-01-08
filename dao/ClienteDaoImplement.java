package com.espe.dao;

import com.espe.idao.IClienteDao;
import com.espe.modelo.ClienteBean;

import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImplement implements IClienteDao {
    List<ClienteBean> clientes;
    // inicializar los objetos y agregar a la visa

    public ClienteDaoImplement() {
        clientes = new ArrayList<>();
        ClienteBean cliente1 = new ClienteBean(0, "Angel", "Patiño", "2300287246");
        ClienteBean cliente2 = new ClienteBean(1, "Genesis", "Yanez", "2300287246");
        clientes.add(cliente1);
        clientes.add(cliente2);
    }

    @Override
    public List<ClienteBean> obtenerClientes() {
        return clientes;
    }

    @Override
    public ClienteBean obtenerClientePorID(int id) {
        return clientes.get(id);
    }

    @Override
    public void actuaizarCliente(ClienteBean cliente) {
        clientes.get(cliente.getIdCli()).setNombreCli(cliente.getNombreCli());
        clientes.get(cliente.getIdCli()).setApellidoCli(cliente.getApellidoCli());
        clientes.get(cliente.getIdCli()).setCedulaCli(cliente.getCedulaCli());

        System.out.println("Cliente con ID: "+cliente.getIdCli() + " Actualizado");
    }

    @Override
    public void eliminarCliente(ClienteBean cliente) {
        clientes.remove(cliente.getIdCli());
        System.out.println("Cliente con ID: "+cliente.getIdCli() + " Eliminado");

    }
}
