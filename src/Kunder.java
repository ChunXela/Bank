import java.util.*;
public class Kunder {
    
    public String name;
    public String lastname;
    public String personnumber;
    public float balance;
    public int accountNumber;
    HashMap<String, Integer> account = new HashMap<String, Integer>();

    Scanner sc = new Scanner(System.in);



    public Kunder(){
        getName();
        getLastname();
        getPersonNumber();
        getAccountNumber();
        storeInHashmap(personnumber, accountNumber);

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

    private void storeInHashmap(String personnumber, int accountNumber){
        account.put(personnumber, accountNumber);
    }

    private void checkInHashmap(){

    }




}
