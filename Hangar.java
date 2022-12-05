import java.util.ArrayList;

public class Hangar implements GetId{

    

    private int id;
    private String local;
    private Aviao aviao;
    private int idAviao;


    public static ArrayList<Hangar> hangares = new ArrayList<Hangar>();

    public Hangar(int id, String local, Aviao aviao) {
        this.id = id;
        this.local = local;
        this.aviao = aviao;
        this.idAviao = aviao.getId();
        aviao.setHangar(this);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
        this.idAviao = aviao.getId();
    }

    public static ArrayList<Hangar> getHangares() {
        return hangares;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nid=" + id
                + "\nlocal=" + local
                + "\naviao=" + aviao.getMarca(); 
            }
        

    public static Hangar getHangarById(int id) throws Exception {
        for (Hangar hangar : hangares) {
            if (hangar.getId() == id) {
                return hangar;
            }
        }
        throw new Exception("Hangar não encontrado");
    }

    public static void removeHangar(int id) throws Exception {
        Hangar hangar = getHangarById(id);
        hangares.remove(hangar);
    }
}

