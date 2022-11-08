public class KamarDeluxeDouble {
private int price = 900000;
private int rating = 5;
private Facility facility;

public KamarDeluxeDouble(){
    Description();
    getPrice();
    getRating();
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
