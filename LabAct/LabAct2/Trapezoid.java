package labact2;

 


public class Trapezoid implements Area{

 

    @Override
    public void triangle() {
        
    }

 

    @Override
    public void rectangle() {
        
    }

 

    @Override
    public void circle() {
        
    }

 

    @Override
    public void trapezoid() {
        System.out.println("Base 1: ");
        double b1 = in.nextDouble();
        System.out.println("Base 2: ");
        double b2 = in.nextDouble();
        System.out.println("Height: ");
        double h = in.nextDouble();

        double area= (b1 + b2)*h;
        System.out.println("Trapezoid Area: "+ area);
    }

}
