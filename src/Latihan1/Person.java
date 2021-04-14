
package Latihan1;

public class Person {
    
    private String nama;
    private int usia;
    
    //kons
    public Person (String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }   
    public void info(){
        System.out.println("Nama : " +this.nama);
        System.out.println("usia : " +this.usia);
    }
        
    }


