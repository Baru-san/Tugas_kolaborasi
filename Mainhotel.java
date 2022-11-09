import java.util.InputMismatchException;
import java.util.Scanner;
public class Mainhotel {

    static void Menu()
    {
        System.out.println("Selamat datang di hotel\nSilahkan pilih kamar yang tersedia");
        System.out.println("1. Kamar Reguler\n2. Kamar Intermediate");
        System.out.println("3. Kamar Single Deluxe \n4. Kamar Double Deluxe");
        System.out.println("5. Kamar King");
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        Menu();
        int pilihan = 0;
        try {
            pilihan = In.nextInt(); 
        } 
        catch (InputMismatchException e) 
        {
            System.err.println("Tolong masukkan input yang sesuai.");
        }
        switch(pilihan){
            case 1:
            kamarReguler reg = new kamarReguler();
            break;

            case 2:
            kamarIntermediate inter = new kamarIntermediate();
            break;

            case 3:
            KamarDeluxe KD = new KamarDeluxe();
            break;

            case 4:
            KamarDeluxeDouble KDdouble = new KamarDeluxeDouble();
            break;

            case 5:
            KamarKing king = new KamarKing();
            break;
        }
    In.close();
    }
}
