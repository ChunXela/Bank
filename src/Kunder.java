import java.util.*;
import java.io.*;
import com.opencsv.*;
public class Kunder{
    
    public String name;
    public String lastname;
    public String personnumber;
    public double balance;
    public int accountNumber;
    File file = new File("./customerInfo/customerInfo.csv");
    Scanner sc = new Scanner(System.in);
    
         


    


    public Kunder(){
    }

    public String getName(){

        System.out.println("What is your first name?");
        name = sc.nextLine();
        return name;
    } 

    public String getNameGui(String name){
        
        name = this.name;

        return name;
    }

    public String getLastname(){
         System.out.println("What is your last name?");
        lastname = sc.nextLine();
        return lastname;
    }

    
    public String getLastnameGui(String lastname){
        
        lastname = this.lastname;

        return lastname;
    }

    public String getPersonNumber(){
        System.out.println("What is your personal identity number?");
        personnumber = sc.nextLine();
        return personnumber;
    }

    
    public String getPersonnumberGui(String personnumber){
        
        personnumber = this.personnumber;

        return personnumber;
    }

    public int getAccountNumber(){

        accountNumber = (int)((Math.random() + 1 ) * 100);
        return accountNumber;
    }

    public void storeInFile(String namn, String lastname, String personnumber, int accountNumber){

        
             
        
        try{

            BufferedWriter outputfile = new BufferedWriter(new FileWriter(file, true));
    CSVWriter writer = new CSVWriter(outputfile);
    List<String[]> data = new ArrayList<String[]>();
            String accountNumberS = Integer.toString(accountNumber);
            data.add(new String[] { name, lastname, personnumber, accountNumberS});
            writer.writeAll(data);  
            // closing writer connection
            writer.close();

        }

        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }




}
