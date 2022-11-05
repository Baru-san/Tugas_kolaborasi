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
}
