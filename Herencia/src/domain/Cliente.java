package domain;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contador;
    
    public Cliente() {}
    public Cliente(String nom, char gen, int ed, String dir, Date date, boolean vip) {
        super(nom, gen, ed, dir);
        this.idCliente = ++Cliente.contador;
        this.fechaRegistro = date;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return  "Cliente { " + "idCliente= " + idCliente + super.toString() + ", fechaRegistro= " + fechaRegistro + ", vip= " + vip + '}';
    }
    
    
}
