public class kamarIntermediate {
    private int price;
    private int rating;
    private Facility facility;

    public kamarIntermediate()
    {
        
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
