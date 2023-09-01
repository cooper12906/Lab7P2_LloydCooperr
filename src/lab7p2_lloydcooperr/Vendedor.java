package lab7p2_lloydcooperr;

public class Vendedor {
    private String nombreVendedor;
    private int cantCarrosVendidos;
    private int cantDineroGenerado;

    public Vendedor(String nombreVendedor, int cantCarrosVendidos, int cantDineroGenerado) {
        this.nombreVendedor = nombreVendedor;
        this.cantCarrosVendidos = cantCarrosVendidos;
        this.cantDineroGenerado = cantDineroGenerado;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getCantCarrosVendidos() {
        return cantCarrosVendidos;
    }

    public void setCantCarrosVendidos(int cantCarrosVendidos) {
        this.cantCarrosVendidos = cantCarrosVendidos;
    }

    public int getCantDineroGenerado() {
        return cantDineroGenerado;
    }

    public void setCantDineroGenerado(int cantDineroGenerado) {
        this.cantDineroGenerado = cantDineroGenerado;
    }

    @Override
    public String toString() {
        return nombreVendedor;
    }
}
