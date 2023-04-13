package inheritance;
//class

public class Main {

    public static void main(String[] args) {
        
        //create object
        ParentFruits pf = new ParentFruits();
        ChildApple ca = new ChildApple();
        Grapes g = new Grapes();
        
        //declared
        pf.color ="Red";
        pf.taste = "Sweet";
        pf.NumPcs = 20;
        
        ca.color ="Green";
        ca.taste = "Sour";
        ca.NumPcs = 5;
        
        g.color = "Dark Violet";
  
        //call the method (galing kay parent)
        pf.checkFruit();
        ca.checkFruit();
        g.checkFruit();
        
        //method galing kay child
        ca.drinks();
    }
}
