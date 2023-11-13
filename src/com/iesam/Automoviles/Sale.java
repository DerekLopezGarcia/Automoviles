package com.iesam.Automoviles;

import java.util.Date;

public class Sale {
    private Integer codVenta;
    private Date fechaVenta;
    private String datosComprador;
    private String datosVehiculo;
    private String metodoPago;
    private Double precio;

    public Integer getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDatosComprador() {
        return datosComprador;
    }

    public void setDatosComprador(String datosComprador) {
        this.datosComprador = datosComprador;
    }

    public String getDatosVehiculo() {
        return datosVehiculo;
    }

    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
