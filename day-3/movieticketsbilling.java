import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner zh = new Scanner(System.in);

        String moname;
        System.out.println("Movie name: ");
        moname = zh.nextLine();

        int tickets;
        System.out.println("Number of tickets: ");
        tickets = zh.nextInt();

        double tprice;
        System.out.println("Ticket price: ");
        tprice = zh.nextDouble();

        double total = tprice * tickets;

        zh.nextLine();
        String customer;
        System.out.println("are you a vip or regular?");
        customer = zh.nextLine();

        double discountprice = 0;

        if (customer.equals("vip"))
        {
            discountprice = 0.20;
            System.out.println("you have availed 20% discount");
        }
        else if (customer.equals("regular"))
        {
            discountprice = 0.10;
            System.out.println("you have availed 10% discount");
        }
        else
        {
            System.out.println("unknown customer");
        }

        double fdiscount = total * discountprice;
        double finalamount = total - fdiscount;

        System.out.println("Movie: " + moname);
        System.out.println("Tickets: " + tickets);
        System.out.println("Total before discount: " + total);
        System.out.println("Discount applied: " + fdiscount);
        System.out.println("Final amount: " + finalamount);

    }

}
