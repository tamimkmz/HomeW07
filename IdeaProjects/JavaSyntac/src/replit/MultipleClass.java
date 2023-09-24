package replit;
class A{
public void print(){
    System.out.println("Class A");
}
}
class B extends A{// we don't need to write anything because it is extended from class A

}
public class MultipleClass {
    public static void main(String[] args) {
        B b=new B();// Create an object of class B
// Call the print method from class A using the object of class B
        b.print();
    }
    A a=new A();

}
