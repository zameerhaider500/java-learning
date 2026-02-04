
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     /*   Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your age is " + age);       */

        Scanner sc = new Scanner(System.in);
        String custype;

        System.out.println("are you a vip or a regular customer? ");
        custype = sc.next();
        System.out.println("your item price?");
        double itemprice = sc.nextDouble();
        System.out.println("your item quantity?");
        int itemquantity = sc.nextInt();

        double totalb = itemprice * itemquantity;
        double discountPercentage = 0;

        if (custype.equals("vip")){
            discountPercentage = 0.20;
            System.out.println("you availed 20% discount.");
        }
        else if (custype.equals("regular")){
            discountPercentage = 0.10;
            System.out.println("you availed 10% discount.");
        }
        else {
            System.out.println("no discount" + " Unknown customer type");
        }

        double discountamount = totalb * discountPercentage;
        double finalBill = totalb - discountamount;

        System.out.println("Customer type: " + custype);
        System.out.println("Price per item: " + itemprice);
        System.out.println("Quantity: " + itemquantity);
        System.out.println("Total before discount: " + totalb);
        System.out.println("Discount applied: " + discountamount);
        System.out.println("Final amount to pay: " + finalBill);

    }
}

