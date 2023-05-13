package labact2;

 

import java.util.Scanner;
import static labact2.Area.in;

 


public class Main {

 


    public static void main(String[] args) {

        Scanner i = new Scanner (System.in);


        System.out.println("==================");
        System.out.println(" [1] = Triangle ");
        System.out.println(" [2] = Rectangle ");
        System.out.println(" [3] = Circle ");
        System.out.println(" [4] = Trapezoid ");

        System.out.println(" Input Shape to FInd the Area: ");
        String input = in.nextLine();

        Area t = new Triangle();
        Area r = new Rectangle();
        Area c = new Circle();
        Area tr = new Trapezoid();

        switch (input) {
            case "1":
                t.triangle();
                break;
            case "2":
                r.rectangle();
                break;
            case "3":
                c.circle();
                break;
            case "4":
                tr.trapezoid();
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

}
