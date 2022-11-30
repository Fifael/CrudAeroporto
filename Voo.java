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
    private Jato   jato;
    private Helicoptero helicoptero;
    private Aviao       aviao;
    private Aeronave    aeronave;
    private Pista       pista;

    public static Arraylist<Voo> voos = new Arraylist<>();

    public Voo(int id, String numero, String data, String hora, String origem,  String destino,  String piloto,  String copiloto,  String observacao,  Jato jato,  Helicoptero helicoptero,  Aviao aviao,  Aeronave aeronave, Pista pista){
    this.id = GetId.getNextId(voos);
    this.numero      = numero;
    this.data        = data;
    this.hora        = hora;
    this.origem      = origem;
    this.destino     = destino;
    this.piloto      = piloto;
    this.copiloto    = copiloto;
    this.observacao  = observacao;
    this.jato        = jato;
    this.helicoptero = helicoptero;
    this.aviao       = aviao;
    this.aeronave    = aeronave;
    this.pista       = pista;

    jato.setVoo(this);
    helicoptero.setVoo(this);
    aviao.setVoo(this);
    aeronave.setVoo(this);
    pista.setVoo(this);
    
    
    
    

    }



    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return 0;
    }


}