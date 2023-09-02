package lab7p2_lloydcooperr;

public class Venta {
    private String vendedor;
    private String cliente;
    private int costoTransaccion;
    private String carroVendido;
    private int idCarro;

    public Venta(String vendedor, String cliente, int costoTransaccion, String carroVendido, int idCarro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costoTransaccion = costoTransaccion;
        this.carroVendido = carroVendido;
        this.idCarro = idCarro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCostoTransaccion() {
        return costoTransaccion;
    }

    public void setCostoTransaccion(int costoTransaccion) {
        this.costoTransaccion = costoTransaccion;
    }

    public String getCarroVendido() {
        return carroVendido;
    }

    public void setCarroVendido(String carroVendido) {
        this.carroVendido = carroVendido;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

   

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", costoTransaccion=" + costoTransaccion + ", carroVendido=" + carroVendido + '}';
    }
}
