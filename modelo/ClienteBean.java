package com.espe.modelo;

public class ClienteBean {
    private int idCli;
    private String nombreCli;
    private String apellidoCli;
    private String cedulaCli;

    public ClienteBean() {
    }

    public ClienteBean(int idCli, String nombreCli, String apellidoCli, String cedulaCli) {
        this.idCli = idCli;
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.cedulaCli = cedulaCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public String getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(String cedulaCli) {
        this.cedulaCli = cedulaCli;
    }


    @Override
    public String toString() {
        return "ClienteBean{" +
                "idCli=" + idCli +
                ", nombreCli='" + nombreCli + '\'' +
                ", apellidoCli='" + apellidoCli + '\'' +
                ", cedulaCli='" + cedulaCli + '\'' +
                '}';
    }
}
