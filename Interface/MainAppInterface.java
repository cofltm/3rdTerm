package InterfaceInheritance;


public class MainAppInterface {

    public static void main(String[] args) {
       
        //avoid:
        //Car c = new Car();
        
        Car c = new Toyota();
        Car h = new Honda();
        
        c.wiper();
        c.pass();
        
        h.HondaStart();
        h.HondaDrive();
    }
}
