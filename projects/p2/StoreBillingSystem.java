import java.util.Scanner;
public class Main {


    static void printwelcome(){
        System.out.println("Welcome to Zameer's Store!");
    }
    public static void main(String[] args)
    {
        Scanner zh = new Scanner(System.in);

        printwelcome();

       String customer;
       int productchoice= 0;
       int quantity=0;
       double price=0;
       double overallTotal = 0;


        String servenext = "yes";
        while (servenext.equals("yes"))
        {

               String[] products = {"book", "pen", "bag"};
               System.out.println("please select: 1/2/3?");
               System.out.println(products[0] + " "+ products[1] + " "+ products[2] );
               String selectedProduct = zh.nextLine();


               switch (selectedProduct)
               {
                   case"book":
                       price = 500;
                       break;
                   case"pen":
                       price = 100;
                       break;
                   case"bag":
                       price = 2000;
                       break;
                   default:
                       price = 0;
               }
                int qofproducts;
               System.out.println("How many do you want?");
                qofproducts = zh.nextInt();
                    zh.nextLine();

                double total = qofproducts * price;

                double discountprice = 0;
                if (total >= 3000)
                {
                    System.out.println("you availed 10% discount");
                    discountprice = 0.10;
                }
                else
                {
                    System.out.println("no discount");
                }


                double discountedp = total * discountprice;
                double finalamount = total - discountedp;

            overallTotal += finalamount;

            System.out.println("Do you want to buy another item?");
            servenext = zh.nextLine();
        }
        
        printFinalBill(overallTotal);

    }
    static void printFinalBill(double total)
    {
        System.out.println("Thank you for shopping! Your total bill is: " + total);

    }
}
