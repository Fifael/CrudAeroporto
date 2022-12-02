import java.util.ArrayList;

public class Voo implements GetId {

    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idAeronave;
    private Aeronave aeronave;
    private int idPista;
    private Pista pista;

    public static ArrayList<Voo> voos = new ArrayList<>();

    public Voo(int id, String numero, String data, String hora, String origem,  String destino,  String piloto,  String copiloto,  String observacao, Aeronave aeronave, Pista pista){
    this.id = GetId.getNextId(voos);
    this.numero     = numero;
    this.data       = data;
    this.hora       = hora;
    this.origem     = origem;
    this.destino    = destino;
    this.piloto     = piloto;
    this.copiloto   = copiloto;
    this.observacao = observacao;
    this.idAeronave = aeronave.getId();
    this.aeronave   = aeronave;
    this.idPista    = pista.getId();
    this.pista      = pista;
    aeronave.setVoos(this);
    pista.setVoos(this);
    voos.add(this);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
        this.idAeronave = aeronave.getId();
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
        this.idPista     = pista.getId();
    }

    public static ArrayList<Voo> getVoos() {
        return voos;
    }

    public static Voo getVoo(int id) throws Exception {
        for (Voo voo : voos) {
            if (voo.getId() == id) {
                return voo;
            }
        }
        throw new Exception("Voo não econtrada");

    }

    public static void removeVoo(int id) throws Exception {
        Voo voo = getVoo(id);
        voos.remove(voo);
    }

    @Override
    public String toString() {
        return "\nid = " + id
        + "\numero = " + numero
        + "\ndata = " + data
        + "\nhora = " + hora
        + "\norigem = " + origem
        + "\ndestino = " + destino
        + "\npiloto = "  + piloto
        + "\ncopiloto = " + copiloto
        + "\nobservacao = " + observacao
        + "\nAeronave = " + aeronave.getMarca() 
        + "\nPista = " + pista.getNumero();
    }
}