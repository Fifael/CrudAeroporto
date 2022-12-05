import java.util.ArrayList;

public class Pista implements GetId{
    private int id;
    private String numero;
    private ArrayList<Voo> voos;

    public static ArrayList<Pista> pistas = new ArrayList<Pista>();

    public Pista(String numero) {
        this.id = GetId.getNextId(pistas);
        this.voos = new ArrayList<>();
        this.numero = numero;
        pistas.add(this);
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

    public static ArrayList<Pista> getPistas() {
        return pistas;
    }

    public void setVoos(Voo voo) {
        this.voos.add(voo);
    }
    
    public static Pista getPista(int id) throws Exception {
        for (Pista pista : pistas) {
            if (pista.getId() == id) {
                return pista;
            }
        }
        throw new Exception("Pista não econtrada");

    }

    public static void removePista(int id) throws Exception {
        Pista pista = getPista(id);
        pistas.remove(pista);
    }

    @Override
    public String toString() {
        return "\nId da Pista= " + id 
         + "\nNumero da Pista= " + numero ; 
        
    }

}
    
