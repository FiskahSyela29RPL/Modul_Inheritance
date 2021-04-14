
package Latihan3;

public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The class method in Hewan");
    }
    @Override
    public void testInstanceMethod(){
        System.out.println("Ini instance method in Gajah");
    }
    
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        myHewan.testInstanceMethod();
        myHewan.testInstanceMethod();
    }
}