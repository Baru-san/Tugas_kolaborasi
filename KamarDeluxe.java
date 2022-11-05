public class KamarDeluxe extends Kamar{

private int price;
private int rating;
private Facility facility;

public KamarDeluxe(){
    Description();
}

public void Description(){
    facility = new Facility(true, false, true, false, true,true,false);
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