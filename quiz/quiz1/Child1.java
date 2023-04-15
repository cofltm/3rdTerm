package inheritance;

public class Child1 extends Parent {
    String name, bday;
    int age;
    
    void checkInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Birthday: "+ bday);
        System.out.println(" ");
    } 
}
