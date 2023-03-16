public class Incidencia {

    private int codigo;
    private int numPuesto;
    private String descripcion;
    private String solucion;
    private String estado;

    public Incidencia(int codigo, int numPuesto, String descripcion) {
        this.codigo = codigo;
        this.numPuesto = numPuesto;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSolucion() {
        return solucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public void resolver(String solucion) {
        setSolucion(solucion);
        this.estado = "Resuelta";
    }






}
