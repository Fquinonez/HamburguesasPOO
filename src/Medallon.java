public class Medallon {

    private String tipoMedallon;
    private double precio;

    public Medallon(double precio, String tipoMedallon) {
        this.precio = precio;
        this.tipoMedallon = tipoMedallon;
    }

    public String getTipoMedallon() {
        return tipoMedallon;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
