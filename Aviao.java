import java.util.ArrayList;

public class Aviao extends Aeronave {

    private String prefixo;
    private int capacidade;
    private Campanhia campanhia;

    private static ArrayList<Aviao> aviaos = new ArrayList<>();

    private Aviao(String marca, String modelo, String prefixo, int capacidade) {
        super(GetId.getNextId(aviaos), marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        //this.campanhia= new ArrayList<>();

    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Campanhia getCampanhia() {
        return campanhia;
    }

    public void setCampanhia(Campanhia campanhia) {
        this.campanhia = campanhia;
    }

    public static ArrayList<Aviao> getAviao() {
        return aviaos;
    }

    public static void setAviao(Aviao aviao) {
        aviaos.add(aviao);

    }

    @Override
    public String toString() {
        return super.toString()
                + "\nprefixo=" + prefixo
                + "\ncapacidade=" + capacidade
                + "\ncampanhia=" + campanhia; 
            }
            

    public static Aviao getAviaoById(int id) throws Exception {
        for (Aviao aviao : aviaos) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Aviao não encontrado");
    }

    public static void excluir(int id) throws Exception {
        Aviao aviao = getAviaoById(id);
        aviaos.remove(aviao);
    }

}
