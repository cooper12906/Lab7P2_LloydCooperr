package lab7p2_lloydcooperr;

public class Cliente {
    private String nombreCliente;
    private int edadCliente;
    private String profesionCliente;
    private int cantCarrosComprados;
    private int sueldoDisponible;

    public Cliente(String nombreCliente, int edadCliente, String profesionCliente, int cantCarrosComprados, int sueldoDisponible) {
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.profesionCliente = profesionCliente;
        this.cantCarrosComprados = cantCarrosComprados;
        this.sueldoDisponible = sueldoDisponible;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getProfesionCliente() {
        return profesionCliente;
    }

    public void setProfesionCliente(String profesionCliente) {
        this.profesionCliente = profesionCliente;
    }

    public int getCantCarrosComprados() {
        return cantCarrosComprados;
    }

    public void setCantCarrosComprados(int cantCarrosComprados) {
        this.cantCarrosComprados = cantCarrosComprados;
    }

    public int getSueldoDisponible() {
        return sueldoDisponible;
    }

    public void setSueldoDisponible(int sueldoDisponible) {
        this.sueldoDisponible = sueldoDisponible;
    }

    @Override
    public String toString() {
        return nombreCliente;
    }
}
