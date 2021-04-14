
package Latihan4;

public class B extends A{
    private int b;
    
    public  void setB (int nilai) {
       b =nilai;
    }
    public int getB (){
        return b;     
    }
    
    @Override
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b :" +getB());
    }

}

class DemoOverride2{
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        obj.tampilkanNilai();
    }
}