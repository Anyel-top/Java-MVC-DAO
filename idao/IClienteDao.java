package com.espe.idao;

import com.espe.modelo.ClienteBean;

import java.util.List;

public interface IClienteDao {
    // declaracion de metodos para acceder a la BD
    List<ClienteBean> obtenerClientes();
    ClienteBean obtenerClientePorID(int id);
    void actuaizarCliente(ClienteBean cliente);
    void eliminarCliente(ClienteBean cliente);

}
