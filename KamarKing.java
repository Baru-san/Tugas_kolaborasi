import java.rmi.server.RemoteRef;

public class KamarKing extends Kamar{
    private String description;
    private int price;
    private int rating;
    private Facility facility;

    public KamarKing(){

    }
    
    public void booking(){

    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }

}
