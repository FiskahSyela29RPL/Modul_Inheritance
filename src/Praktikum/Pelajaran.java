
package Praktikum;

import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;


class Pelajaran {

    static Pelajaran createACourse(Scanner input) {
        Pelajaran pelajaran = null;
        System.out.println("Masukkan Nama Pelajaran: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Waktu Pelajaran: ");
        float waktu= input.nextFloat();
        System.out.println("Apakah Sudah dijadwal?: ");
        String in = input.next();
        
        if (in.equals("y")) {
            Jadwal jadwal = Jadwal.DaftarJadwal(input);
            pelajaran = new Pelajaran(nama, waktu, jadwal);
        } else {
            pelajaran = new Pelajaran(nama, waktu);
        }
        return pelajaran;
    }

    private String nama;
    private float waktu;
    private Jadwal jadwal;
    
    private Murid[ ] murid = new Murid[50];
    private int jumlahMurid = 0;
    private Guru guru;
    
    public Pelajaran(String nama, float waktu) {
        this.nama = nama;
        this.waktu = waktu;
    }
    
    public Pelajaran(String nama, float waktu, Jadwal jadwal) {
        this(nama, waktu);
        this.jadwal = jadwal;
    }

    public String DaftarPelajaran () {
        StringBuffer pelajaran = new StringBuffer("Daftar Pelajaran:");
        pelajaran.append("Nama: ");
        pelajaran.append(this.nama);
        pelajaran.append("Waktu: ");
        pelajaran.append(this.waktu);
        pelajaran.append("\n");
        if (this.jadwal != null) {
            pelajaran.append(this.jadwal.jadwalHarian());
        }
        pelajaran.append("-----------------");
        return pelajaran.toString();
    }
    
    public void saveTheData(FileWriter writer) throws IOException {
        writer.write(this.nama);
        writer.write("\n");
        writer.write(new Float(this.waktu).toString());
        writer.write("\n");
        if (this.jadwal != null) {
            writer.write("y\n");
            this.jadwal.saveTheData(writer);
        } else {
            writer.write("n\n");
        }
    }
    
    @Override
    public String toString() {
        return this.DaftarPelajaran();
    }
    
    public void addStudent(Murid murid) {
        this.murid[this.jumlahMurid++] = murid;
    }
    
    public String getName() {
        return nama;
    }
    
    public void setName(String nama) {
        this.nama = nama;
    }
    
    public float getCreditHours() {
        return waktu;
    }
    
    public void setCreditHours(float waktu) {
        this.waktu = waktu;
    }
    
    public Jadwal getSchedule() {
        return jadwal;
    }
    
    public void setSchedule(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    
    public Murid[ ] getStudents() {
        return murid;
    }
    
    public void setStudents(Murid[] murid) {
        this.murid = murid;
    }
    
    public Guru getTeacher() {
        return guru;
    }
    
    public void setTeacher(Guru guru) {
        this.guru = guru;
    
    }

}



