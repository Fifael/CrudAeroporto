import java.util.ArrayList;

public class Jato extends Aeronave {

    private String cor;
    private int velocidade;
    private static ArrayList<Jato> jatos = new ArrayList<>();

    public Jato(int id, String marca, String modelo, String cor, int velocidade) {
        super(GetId.getNextId(jatos), marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
        jatos.add(this);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getvelocidade() {
        return velocidade;
    }

    public void setvelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public static ArrayList<Jato> getJatos() {
        return jatos;
    }


    @Override
    public String toString() {
        return super.toString()
                + "\nCor=" + cor
                + "\nvelocidade=" + velocidade;
    }

    public static Jato getJato(int id) throws Exception {
        for (Jato jato : jatos) {
            if (jato.getId() == id) {
                return jato;
            }
        }
        throw new Exception("Jato não encontrada");   
}

    public static void removeJato(int id) throws Exception {
        Jato jato = getJato(id);
        jatos.remove(jato);
    }
}
