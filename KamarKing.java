
public class KamarKing extends Kamar{
    
    private int price = 1100000;
    private int rating = 5;
    private Facility facility;

    public KamarKing()
    {
        System.out.println("\n\nDeskripsi kamar ini:");
        Description();
        System.out.println("Harga kamar ini " + getPrice());
        System.out.println("dengan rating " + getRating());
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
