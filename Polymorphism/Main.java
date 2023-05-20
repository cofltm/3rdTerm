package Polymorphism;

 

public class Main {

 

    public static void main(String[] args)
    {
        /* eto pang inheritance
        Male M = new Male();
        Female F = new Female();

        M.voiceSound();
        F.voiceSound();
        */

        // eto naman para sa polymorphism
        Person A = new Male();
        Person B = new Female();

        A.voiceSound();
        B.voiceSound();


    }

}
