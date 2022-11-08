public class KamarDeluxeDouble {
private int price = 900000;
private int rating = 5;
private Facility facility;

public KamarDeluxeDouble()
{
    System.out.println("\n\nDeskripsi kamar ini:");
    Description();
    System.out.println("Harga kamar ini " + getPrice());
    System.out.println("dengan rating " + getRating());
}

public void Description(){
    facility = new Facility(true, false, true, false, true,true,true);
    Checking check = new Checking();

    check.IsThereAC(facility.getAC());
    check.IsTherePool(facility.getPool());
    check.IsThereBreakfast(facility.getBreakfast());
    check.IsThereLunch(facility.getLunch());
    check.IsThereDinner(facility.getDinner());
    check.IsThereWifi(facility.getWifi());
    check.CheckBedType(facility.getBedType());
}

public int getPrice(){
    return price;
}

public int getRating(){
    return rating;
}
}
