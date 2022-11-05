public class Checking {

    public Checking(){

    }
    
    public void IsThereAC(boolean AC){
        if (AC == true){
            System.out.println("Kamar memiliki AC");;
        }
        else{
            System.out.println("Kamar tidak memiliki AC");
        }
    }

    public void IsTherePool(boolean pool){
        if (pool == true){
            System.out.println("Kamar menyediakan kolam");
        }
        else{
            System.out.println("Kamar tidak menyediakan kolam");
        }
    }

    public void IsThereBreakfast(boolean sarapan){
        if (sarapan == true){
            System.out.println("Hotel menyediakan kolam");
        }
        else{
            System.out.println("Kamar tidak menyediakan kolam");
        }
    }

    public void IsThereDinner(boolean dinner){
        if (dinner == true){
            System.out.println("Menyediakan Makan Malam");
        }
        else{
            System.out.println("Tidak Menyediakan Makan Malam");
        }
    }

    public void IsThereWifi(boolean wifi){
        if(wifi == true){
            System.out.println("Tersedia wi-fi");
        }
        else{
            System.out.println("Tidak Tersedia Wi-fi");
        }
    }

    public void IsThereLunch(boolean lunch){
        if(lunch == true){
            System.out.println("Menyediakan Makan Siang");
        }
        else{
            System.out.println("Tidak Menyediakan Makan Siang");
        }
    }

    public void CheckBedType(boolean bedtype){
        if(bedtype == true){
            System.out.println("Tersedia Dua tempat tidur");
        }
        else{
            System.out.println("Hanya terdapat satu tempat tidur");
        }
    }
}
