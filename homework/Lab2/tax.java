package Lab2;
import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double price,vat,total; 
        
        System.out.print("Input price : ");
        price = kb.nextDouble();
        vat = price *7 / 100;
        total = price + vat;
        System.out.println("=== Calculate VAT ===");
        System.out.printf("Total (price + vat) : %.2f" , total);
    }

}
