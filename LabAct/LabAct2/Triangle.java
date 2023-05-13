package labact2;

 


public class Triangle implements Area {

 

    @Override
    public void triangle() {

        System.out.println("Base: ");
        double b = in.nextDouble();
        System.out.println("Height: ");
        double h = in.nextDouble();

        double area= (b*h)/2;
        System.out.println("Triangle Area: "+ area);
    }

 

    @Override
    public void rectangle() {

    }

 

    @Override
    public void circle() {

    }

 

    @Override
    public void trapezoid() {

    }

}
