import java.util.ArrayList;

public class Hamburguesa {

    private Pan pan;
    private ArrayList<Medallon> medallones = new ArrayList<>();
    private ArrayList<Extra> extras = new ArrayList<>();

    public Hamburguesa() {
    }

    public void agregarPan(Pan pan){
        this.pan = pan;
    }

    public void agregarMedallon(Medallon medallon){
        medallones.add(medallon);
    }

    public void agregarExtra(Extra extra){
        extras.add(extra);
    }

    public void eliminarMedallon(Medallon medallon){
        medallones.remove(medallon);
    }

    public void eliminarExtra(Extra extra){
        extras.remove(extra);
    }

    public boolean esValida(){
        return this.getCantMedallones() >= this.getCantExtras() && this.pan != null;
    }

    private int getCantMedallones(){
        return medallones.size();
    }

    private int getCantExtras(){
        return extras.size();
    }

    public double calcularPrecio(){
        double precio = 0;
        precio = this.pan.getPrecio() + this.getPrecioMedallones() + this.getPrecioExtras();
        return precio;
    }


    private double getPrecioMedallones(){
        double precio = 0;
        for (Medallon medallon : medallones){
            precio += medallon.getPrecio();
        }
        return precio;
    }

    private double getPrecioExtras(){
        double precio = 0;
        for (Extra extra : extras){
            precio += extra.getPrecio();
        }
        return precio;
    }

    public boolean facturar(){
        return esValida();
    }

}
