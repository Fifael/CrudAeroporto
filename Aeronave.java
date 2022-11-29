import java.util.ArrayList;

public abstract class Aeronave implements GetId  {

    private int id;
    private String marca;
    private String modelo;
    private Arraylist<Voo> voos;

    protected Aeronave(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.voos = new ArrayList<Voo>();
    }

    public int getId() {
        return id;
    }

    

}
