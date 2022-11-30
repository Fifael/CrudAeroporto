import java.util.ArrayList;

public class Helicoptero extends Aeronave {

    private String cor;
    private int capacidade;

    private static ArrayList<Helicoptero> helicopteros = new ArrayList<>();

    public Helicoptero(String marca, String modelo, String cor, int capacidade) {
        super(GetId.getNextId(helicopteros), marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public static ArrayList<Helicoptero> getHelicoptero() {
        return helicopteros;
    }

    public static void setHelicopteros(Helicoptero helicoptero) {
        helicopteros.add(helicoptero);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCor=" + cor
                + "\nCapacidade=" + capacidade;
    }

    public static Helicoptero getHelicopteroById(int id) throws Exception {
        for (Helicoptero helicoptero : helicopteros) {
            if (helicoptero.getId() == id) {
                return helicoptero;
            }
        }
        throw new Exception("Helicoptero não encontrado");
    }


public static void excluir(int id) throws Exception {
    Helicoptero helicoptero = getHelicopteroById(id);
    helicopteros.remove(helicoptero);
}
}

