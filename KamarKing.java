import java.rmi.server.RemoteRef;

public class KamarKing extends Kamar{
    private String description;
    private int price;
    private int rating;
    private Facility facility;

    public KamarKing(){
        getDescription();
    }
    
    // public void booking(){

    // }

    public void getDescription(){
        facility = new Facility(false, true, true, true, true);
        Checking check = new Checking();

        check.IsThereAC(facility.getAC());
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }

    public static void main(String[] args) {
        KamarKing kk = new KamarKing();

    }

}
