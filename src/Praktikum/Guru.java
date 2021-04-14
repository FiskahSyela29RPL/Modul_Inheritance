/*Class yang berisi method identitas dan jadwal yang dilakukan guru*/
package Praktikum;

//menggunakan java handling Creates a new file. It gets file name in string.
import java.io.FileWriter;
import java.util.Scanner;

public class Guru {

    static Guru ATeacher(Scanner input) {
        
        Scanner Input = new Scanner (System.in);
        System.out.println("Masukkan nama guru : ");
        String nama = Input.nextLine();
        System.out.println("Masukkan Mata Pelajaran: ");
        String courseName = Input.nextLine();
        
        //IDK CARI TAHU DONGGG
        Pelajaran pelajaran = Sekolah.DaftarPelajaran(nama);//NUNGGU DULU SCHOOL SABAR
        Jadwal jadwal = Jadwal.DaftarJadwal(Input);
        //membuat objek dari class guru, dan menampilkannya
        Guru guru = new Guru(nama, pelajaran, jadwal);
        return guru;
    }
    private String nama;
    //membuat child class tanpa extends
    private Pelajaran pelajaran;
    private Jadwal jamKbm;
    
    //kons
    public Guru(String nama, Pelajaran pelajaran, Jadwal jamKbm) {
        this.nama = nama;
        this.pelajaran = pelajaran;
        this.jamKbm = jamKbm;
    }
    
    //method untuk menampilkan identitas guru
    public String biodataGuru() {
        //membuat objek biodata dengan class StringBuffer
        StringBuffer biodata = new StringBuffer("Informasi Guru:");
        biodata.append("Nama : ");
        biodata.append(this.nama);
        biodata.append("Mata Pelajaran: ");
        biodata.append(this.pelajaran.getName());
        biodata.append(this.jamKbm.jadwalHarian());
        return biodata.toString();
    }
    
    public void saveTheData(FileWriter writer) {
        
    }
    
    public Murid[] getStudents() {
        Murid[ ] murid = null;
        if (pelajaran != null) {
            murid = pelajaran.getStudents();
        }
        return murid;
    }
    
    public String getName() {
        return nama;
    }
    
    public void setName(String nama) {
        this.nama = nama;
	}
    public Pelajaran getCourse() {
        return pelajaran;
    }
    
    public void setCourse(Pelajaran pelajaran) {
        this.pelajaran = pelajaran;
    }
    public Jadwal getOfficeHours() {
        return jamKbm;
    }
    public void setOfficeHours(Jadwal waktu) {
        this.jamKbm = waktu;
    }
}
