package inheritance;

public class TestCase {
    public static void main(String [] srgs) {
        
        //create objects
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        
        //declared
        
        //parent
        p.attitude = "Jolly";
        p.hairColor = "Gray";
        p.bloodType = "A+";
        p.property = "BMW";
        
        //child1
        c1.attitude = "Moody";
        c1.hairColor = "Black";
        c1.bloodType = "AB+";
        c1.property = "BMW";
        
        c1.name = "Andrew";
        c1.age = 42;
        c1.bday = "July 12, 1980";
        
        //child2
        
        c2.attitude = "Jolly";
        c2.hairColor = "Gray";
        c2.bloodType = "O+";
        c2.property = "Toyota Trueno";
        
        c2.name = "Liza";
        c2.age = 23;
        c2.bday = "August 19, 2000";
        
        //call methods
        p.checkInfos();
        c1.checkInfos();
        c1.checkInfo();
        c2.checkInfos();
        c2.checkInfo();
        
    }
}
