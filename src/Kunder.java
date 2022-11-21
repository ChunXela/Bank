import java.util.*;
import java.io.*;
public class Kunder {
    
    public String name;
    public String lastname;
    public String personnumber;
    public float balance;
    public int accountNumber;
    File file = new File("./customerInfo/customerInfo.csv");
    Scanner sc = new Scanner(System.in);

    


    public Kunder(){
        getName();
        getLastname();
        getPersonNumber();
        getAccountNumber();
        storeInFile(name, lastname, personnumber, accountNumber);


        System.out.println("Welcome " + name + " " + lastname + " to the first NTI bank");

        System.out.println(account);
       
    }

    public String getName(){

        System.out.println("What is your first name?");
        name = sc.nextLine();
        return name;
    } 

    public String getLastname(){
         System.out.println("What is your last name?");
        lastname = sc.nextLine();
        return lastname;
    }

    public String getPersonNumber(){
        System.out.println("What is your personal identity number?");
        personnumber = sc.nextLine();
        return personnumber;
    }

    public int getAccountNumber(){

        accountNumber = (int)((Math.random() + 1 ) * 100);
        return accountNumber;
    }

    public void storeInFile(String namn, String lastname, String personnumber, int accountNumber){
         
        try{

            FileWriter outputfile = new FileWriter(file);

            CSVWriter writer = new CSVWriter(outputfile);

            List<String[]> data = new ArrayList<String[]>();

            data.add(new String[] { "Name", "Lastname", "Person number", "Account numbers" });
            data.add(new String[] { name, lastname, personnumber, accountNumber });
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
