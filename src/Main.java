import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemprice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.2;
        String trash = "";


        System.out.println("enter the items price");
        if(in.hasNextDouble())
        {
            itemprice = in.nextDouble();
            in.nextLine();

            if(itemprice >= FREE_SHIP)
            {
                shipCost  = 0;
                totalCost = itemprice;
            }
            else
            {
                shipCost = FREE_SHIP * itemprice;
                totalCost = SHIP_RATE + itemprice;

            }
            System.out.println("shipping costs are " + shipCost);
            System.out.println("total cost is " + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.print(trash + "is not valid");
            System.out.println("run the program again");
        }
    }
}