package InterfaceInheritance;


public class Honda implements Car{

    @Override
    public void HondaStart() {
        System.out.println("Your Honda Civic Car is Starting");
    }

    @Override
    public void HondaDrive() {
        System.out.println("Your Honda Civic Car is ready to drive");
    }    

    @Override
    public void wiper() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
