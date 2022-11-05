public class kamarReguler {
    private int price;
    private int rating;
    private Facility facility;

    public kamarReguler()
    {
        Description();
    }

    public void Description()
    {
        facility = new Facility(true, false, true, false, false, false);
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