import java.util.HashMap;
import java.util.Scanner;
public class Kunder {
    
    public String namn;
    public String personNummer;
    public float saldo;
    public String kundNummer;
    public boolean civilstånd;

public Kunder(){
    nyKund();
}

    public void nyKund(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej Kära nya kund. För att göra en bankkonto i NTI banken så måste ställa dig några frågor.\nVad heter du?");
        String namn = sc.nextLine();
        System.out.println("Vad är ditt personNummer? ange I formattet 123456xxxx.");
        String personNummer = sc.nextLine();
        System.out.println("Hur mycket pengar kommer du lägga in till ditt konto nu? Ange I kroner.");
        float saldo = sc.nextFloat();
        System.out.println("Är du gift? Skriv True elle False");
        boolean civilstånd = sc.nextBoolean();
        sc.close();
        this.namn = namn;
        this.personNummer = personNummer;
        this.saldo = saldo;
        this.civilstånd = civilstånd;
    }

}
