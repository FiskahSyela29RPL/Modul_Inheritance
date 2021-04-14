
package Latihan4;

public class A {
    private int a;
    
    public void setA (int nilai){
        a = nilai;
    }
    //apakah parameter iso digae ngeset nilai?
    public int getA(){
        return a;
    }
    //manggil method non void
    public void tampilkanNilai(){
        System.out.println("Nilai a :" +getA());
    }
}
