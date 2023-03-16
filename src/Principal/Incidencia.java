package Principal;

public class Incidencia {
    private int Codigo;

    private int puesto;
    private String descripcion;
    private String estado;

    public Incidencia(int codigo) {
        Codigo = codigo;
    }

    public Incidencia(int codigo, int puesto, String descripcion, String estado) {
        Codigo = codigo;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
