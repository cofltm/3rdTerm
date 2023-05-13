package labact2;

 


public class Rectangle implements Area {

 

    @Override
    public void triangle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    @Override
    public void rectangle() {

        System.out.println("Width: ");
        double w = in.nextDouble();
        System.out.println("Height: ");
        double h = in.nextDouble();

        double area= w*h;
        System.out.println("Rectangle Area: "+ area);
    }

 

    @Override
    public void circle() {

    }

 

    @Override
    public void trapezoid() {

    }

}
