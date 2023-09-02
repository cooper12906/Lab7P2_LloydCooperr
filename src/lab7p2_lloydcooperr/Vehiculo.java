package lab7p2_lloydcooperr;

import java.awt.Color;

public class Vehiculo {
    private String marcaVehiculo;
    private String colorVehiculo;
    private String modelo;
    private String año;
    private int idCarro;
    private int precioVenta;

    public Vehiculo(String marcaVehiculo, String colorVehiculo, String modelo, String año, int idCarro, int precioVenta) {
        this.marcaVehiculo = marcaVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.modelo = modelo;
        this.año = año;
        this.idCarro = idCarro;
        this.precioVenta = precioVenta;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    

    @Override
    public String toString() {
        return marcaVehiculo + modelo;
    }
    
}
