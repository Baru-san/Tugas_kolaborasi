import java.rmi.server.RemoteRef;

public class KamarKing extends Kamar{
    
    private int price;
    private int rating;
    private Facility facility;

    public KamarKing(){
        Description();
    }
    
    // public void booking(){

    // }

    public void Description(){
        facility = new Facility(true, true, true, true, true,true);
        Checking check = new Checking();

        check.IsThereAC(facility.getAC());
        check.IsTherePool(facility.getPool());
        check.IsThereBreakfast(facility.getBreakfast());
        check.IsThereLunch(facility.getLunch());
        check.IsThereDinner(facility.getDinner());
        check.IsThereWifi(facility.getWifi());
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }
}
