import java.util.ArrayList;

public class Helicoptero extends Aeronave {

    private String corH;
    private int capacidadeH;

    private static ArrayList<Helicoptero> helicopteros = new ArrayList<>();

    public Helicoptero(String marca, String modelo, String corH, int capacidadeH) {
        super(GetId.getNextId(helicopteros), marca, modelo);
        this.corH = corH;
        this.capacidadeH = capacidadeH;
    }

    public String getCorH() {
        return corH;
    }

    public void setCorH(String corH) {
        this.corH = corH;
    }

    public int getCapacidadeH() {
        return capacidadeH;
    }

    public void setCapacidadeH(int capacidadeH) {
        this.capacidadeH = capacidadeH;
    }

    public static ArrayList<Helicoptero> getHelicopteros() {
        return helicopteros;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCorH=" + corH
                + "\nCapacidadeH=" + capacidadeH;
    }

    public static Helicoptero getHelicoptero(int id) throws Exception {
        for (Helicoptero helicoptero : helicopteros) {
            if (helicoptero.getId() == id) {
                return helicoptero;
            }
        }
        throw new Exception("Helicoptero não encontrado");
    }


public static void excluirHeli(int id) throws Exception {
    Helicoptero helicoptero = getHelicoptero(id);
    helicopteros.remove(helicoptero);
}
}

