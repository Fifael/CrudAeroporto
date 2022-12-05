import java.util.ArrayList;

public class Campanhia implements GetId  {
    
    private int id;
    private String nome;
    private String cnpj;
    private ArrayList<Aviao> aviaos;

    private static ArrayList<Campanhia> campanhias = new ArrayList<Campanhia>();

    public Campanhia( String nome, String cnpj ){
        this.id = GetId.getNextId(campanhias);
        this.nome = nome;
        this.cnpj = cnpj;
        this.aviaos = new ArrayList<>();
        campanhias.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Aviao> getAviaos() {
        return aviaos;
    }

    public void setAviaos(ArrayList<Aviao> aviaos) {
        this.aviaos = aviaos;
    }

    public void setAviaos(Aviao aviao) {
        this.aviaos.add(aviao);
    }

    public static ArrayList<Campanhia> getCampanhias() {
        return campanhias;
    }

    public static Campanhia getCampanhia(int id) throws Exception {
        for (Campanhia campanhia : campanhias) {
            if (campanhia.getId() == id) {
                return campanhia;
            }
        }
        throw new Exception("Pista não econtrada");

    }

    public static void removeCampanhia(int id) throws Exception {
        Campanhia campanhia = getCampanhia(id);
        campanhias.remove(campanhia);
    }

    @Override
    public String toString() {
        return "\nId da Campanhia= " + id 
         + "\nNome da Campanhia= " + nome
         + "\nCnpj=" + cnpj ;
    }

}
