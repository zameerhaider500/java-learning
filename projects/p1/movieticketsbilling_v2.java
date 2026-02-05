import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner zh = new Scanner(System.in);

        int customers;
        System.out.println("Do you want to serve a customer? ");
        customers = zh.nextInt();
        zh.nextLine();

        for (int i=1; i<=customers; i++) {

            String moname;
            System.out.println("Movie name: ");         //movie name
            moname = zh.nextLine();

            int age;
            System.out.println("please eneter your age? ");      //age
            age = zh.nextInt();

            int tickets;
            System.out.println("Number of tickets: ");    ///no. of tickets
            tickets = zh.nextInt();

            double tprice = 0;

            if (age <= 12) {
                tprice = 500;
                System.out.println("you are a child");
            } else if (age < 18) {
                tprice = 700;
                System.out.println("you are an teen");
            } else {
                tprice = 1000;
                System.out.println("you are an adult");
            }


            double total = tprice * tickets;             //total formula

            zh.nextLine();
            String customert;
            System.out.println("are you a vip or regular?");      //regular or vip check
            customert = zh.nextLine();

            double discountprice = 0;             // dicount before

            switch (customert) {
                case "vip":
                    discountprice = 0.20;
                    break;

                case "regular":
                    discountprice = 0.10;
                    break;
                default:
                    discountprice = 0;
            }


            double fdiscount = total * discountprice;
            double finalamount = total - fdiscount;

            if (finalamount > 3000) {
                System.out.println("you get free porpcorns");
            } else {
                System.out.println("you get nothing for free");
            }

            System.out.println("Movie: " + moname);
            System.out.println("Age: " + age);
            System.out.println("Tickets counts: " + tickets);
            System.out.println("Total before discount: " + total);
            System.out.println("Discount applied: " + fdiscount);
            System.out.println("Final amount: " + finalamount);

        }

    }

}
