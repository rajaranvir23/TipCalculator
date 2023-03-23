import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double bill, tipPercent, tip, totalBill;
        int people;
        //String isSplittingbill = "";

        
        System.out.println("Whats the bill?");
        bill = sc.nextDouble();

        System.out.println("Whats percentage do you wanna tip?");
        tipPercent = sc.nextDouble();

        tip = bill * (tipPercent/100);
        totalBill = tip + bill;

        System.out.println("Are you splitting the bill? Y/N");
        
            String isSplittingbill = sc.next();
            
            if(isSplittingbill.equalsIgnoreCase("y")){
                System.out.println("How many people are splitting the bill?");
                people = sc.nextInt();
                System.out.println("Your total bill is $" + totalBill/people);
                
            } 
            
            else {
                System.out.println("Your total bill is $" + totalBill);
                
            }
            
            
        
       
    }
}

