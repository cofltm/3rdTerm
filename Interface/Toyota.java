
package InterfaceInheritance;

public class Toyota implements Car  {

    @Override
    public void wiper() {
        System.out.println("Mt Car is Starting turning On the Wiper");
    }

    @Override
    public void pass() {
        System.out.println("My Car is Doing a Pass Light SIgnal");
    }

    @Override
    public void HondaStart() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void HondaDrive() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
