public class Pan {

    private String tipoPan;
    private double precio;

    public Pan(String tipoPan, double precio) {
        this.tipoPan = tipoPan;
        this.precio = precio;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
