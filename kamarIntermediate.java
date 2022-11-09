public class kamarIntermediate extends Kamar{
    private int price = 650000;
    private int rating = 4;
    private Facility facility;

    public kamarIntermediate()
    {
        System.out.println("\n\nDeskripsi kamar ini:");
        Description();
        System.out.println("Harga kamar ini " + getPrice());
        System.out.println("dengan rating " + getRating());
    }

    public void Description()
    {
        facility = new Facility(true, false, true, false, false, true);
        Checking check = new Checking();

        check.IsThereAC(facility.getAC());
        check.IsTherePool(facility.getPool());
        check.IsThereBreakfast(facility.getBreakfast());
        check.IsThereLunch(facility.getLunch());
        check.IsThereDinner(facility.getDinner());
        check.IsThereWifi(facility.getWifi());
    }

    public int getPrice()
    {
        return price;
    }

    public int getRating()
    {
        return rating;
    }
}
