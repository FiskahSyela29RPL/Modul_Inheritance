
package Latihan2;

public class Employ  extends Person{
    private String noKaryawan;
    
    public Employ (String noKaryawan, String nama, int usia){
        super (nama, usia);
        this.noKaryawan = noKaryawan;
    }
    
    @Override
    public void info (){
        System.out.println("No. Karyawan :" +this.noKaryawan);
        super.info();
    }

}
