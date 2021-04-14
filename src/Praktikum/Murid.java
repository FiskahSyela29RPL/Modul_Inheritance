
package Praktikum;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Murid {

    static Murid InfoMurid(Scanner input) {
        System.out.println("Nama Anda :  ");
        String nama = input.nextLine();
        System.out.println("Absen Anda: ");
        int absen = input.nextInt();
        Murid murid = new Murid(nama, absen);
        return murid;
    }
    private String nama;
    private Pelajaran[ ] pelajaran = new Pelajaran[10];
    private int enroll = 0;
    private int absen;
    private int[ ] nilai;
    
    public Murid(String nama, int absen) {
        this.nama = nama;
        this.absen = absen;
    }
    
    public Murid(String nama, int absen, Pelajaran[ ] pelajaran) {
        this(nama, absen);
        if (pelajaran != null && pelajaran.length != 0 && pelajaran.length < 10) {
            for (int i = 0; i < pelajaran.length; i++ ) {
                this.pelajaran[i] = pelajaran[i];
            }
            this.enroll = pelajaran.length;
        }
    }
    
    public void addCourse(Pelajaran pelajaran) {
        if (pelajaran == null) {
            System.out.println("Error!" +"\n Masukkan Mata Pelajaran Anda");
        } else {
            if (this.enroll < 10) {
                this.pelajaran[this.enroll] = pelajaran;
                this.enroll++;
            } else {
                System.out.println("Error! " +"\n Masukkan 10 Mata Pelajaran Saja");
            }
        }
    }

    public void saveTheData(FileWriter writer) throws IOException {
        writer.write(this.nama);
        writer.write("\n");
        writer.write(new Integer(this.absen).toString());
        writer.write("\n");
        writer.write(new Integer(this.enroll).toString());
        writer.write("\n");
        for (int i = 0; i < enroll; i++) {
            writer.write(pelajaran[i].getName() + "\n");
        }
    }
    
    public String getName() {
        return nama;
    }
    
    public void setName(String nama) {
        this.nama = nama;
    }
    
    public Pelajaran[] getCourses() {
        return pelajaran;
    }
    
    public void setCourses(Pelajaran[] pelajaran) {
        this.pelajaran = pelajaran;
    }
    
    public int getNumber() {
        return absen;
    }
    
    public void setNumber(int absen) {
        this.absen = absen;
    }
    
    public int[] getGrades() {
        return nilai;
    }
    
    public void setGrades(int[] grades) {
        this.nilai = nilai;
    }
    public int getCourseEnrolled() {
        return enroll;
    }
    
    public void setCourseEnrolled(int enroll) {
        this.enroll = enroll;
    }

    String Biodata() {
        String sInfo = ("Biodata Siswa");
        sInfo = sInfo + "Name: " + this.nama + "\t";
        sInfo = sInfo + "Absen: " + this.absen + "\n";
        for (int i =0; i < this.enroll ; i++) {
            sInfo = sInfo + "Mapel " + (i+1) + ": " + this.pelajaran[i].getName() + "\n";
        }
        sInfo = sInfo + "------------------";
        return sInfo; 
    }
}

