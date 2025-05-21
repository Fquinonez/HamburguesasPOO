public class Extra {

    private String tipoExtra;
    private double precio;

    public Extra(String tipoExtra, double precio) {
        this.tipoExtra = tipoExtra;
        this.precio = precio;
    }

    public String getTipoExtra() {
        return tipoExtra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
