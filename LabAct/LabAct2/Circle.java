package labact2;

 


public class Circle implements Area{

 

    @Override
    public void triangle() {

    }

 

    @Override
    public void rectangle() {

    }

 

    @Override
    public void circle() {
        System.out.println("Radius: ");
        double r = in.nextDouble();

        double area= Math.PI * Math.pow(r, 2);
        System.out.println("Circle Area: "+ area);
    }

 

    @Override
    public void trapezoid() {

    }

}
