import java.rmi.server.RemoteRef;

public class KamarKing extends Kamar{
    private String description;
    private int roomavailable;
    private int dayavailable;
    private int price;
    private int rating;

    public KamarKing(){

    }
    
    public void booking(){

    }

    public String getDescription(){
        return description;
    }

    public int roomAvailable(){
        return roomavailable;
    }

    public int dayAvailable(){
        return dayavailable;
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }
}
