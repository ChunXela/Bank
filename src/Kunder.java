import java.nio.file.Files;
import java.nio.file.Path;

public class Kunder {
    
    String namn;
    String personNummer;
    float saldo;
    String kundNummer;
    boolean civilstånd;

    void nyKund(String namn, String personNummer, float saldo, String kundNummer, boolean civilstånd){

        this.namn = namn;
        this.personNummer = personNummer;
        this.saldo = saldo;
        this.kundNummer = kundNummer;
        this.civilstånd = civilstånd;

        String personNummerString = this.personNummer;
        
       String fileName = 
        File personNummer = new File(personNummer);
        Path personNummer = Path.of("C:/Users/johansson.axel/Programming 2/Bank/bankInfo/");
    }


    void nyKundInfoLagring(){
        String personNummerString = this.personNummer;
        
       String fileName = 
        File personNummer = new File(personNummer);
        Path personNummer = Path.of("C:/Users/johansson.axel/Programming 2/Bank/bankInfo/");

    }
    

}
