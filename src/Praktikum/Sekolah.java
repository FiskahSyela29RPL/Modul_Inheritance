
package Praktikum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Sekolah {
    
    private static String nama = "- SMK TELKOM MALANG-";
    
    private static Murid[] murid = new Murid[50];
    private static int jumlahMurid= 0;
    private static Pelajaran[] pelajaran = new Pelajaran[10];
    private static int jumlahPelajaran = 0;
    private static Guru[] guru = new Guru[10];
    private static int jumlahGuru = 0;
    private static String fileStore = "school-mgmt-sys-data.txt";
    
    public static void JumlahMurid() {
        for (int i = 0; i < jumlahMurid; i++) {
            System.out.println(murid[i].Biodata());
        }
    }
    
    public static void JumlahPelajaran() {
        for (int i = 0; i < jumlahPelajaran; i++) {
            System.out.println(pelajaran[i].DaftarPelajaran ());
        }
    }
    
    public static void JumlahGuru() {
        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println(guru[i]. biodataGuru());
        }
    }
    
    public static Pelajaran DaftarPelajaran(String nama) {
        Pelajaran result = null;
        if (nama != null && !nama.equals("")) {
            for (int i = 0; i < jumlahPelajaran; i++) {
                Pelajaran currentCourse = pelajaran[i];
                if (nama.equals(currentCourse.getName())) {
                    result = currentCourse;
                }
            }
        }
        return result;
    }
    
    public static void admitStudent(Murid total) {
        if (jumlahMurid < 50) {
            murid[jumlahMurid++] = total;
        } else {
            System.out.println("Error! Masukkan 50 Murid Saja");
        }
    }
    
    public static void addCourse(Pelajaran total) {
        if (jumlahPelajaran < 10) {
            pelajaran[jumlahPelajaran++] = total;
        } else {
            System.out.println("Error! Hanya Ada Sepuluh Mata Pelajaran Disekolah Ini");
        }
    }
    
    public static void addTeacher(Guru total) {
        if (jumlahGuru < 10) {
            guru[jumlahGuru++] = total;
        } else {
            System.out.println("Error! Hanya Ada Sepuluh Guru Disekolah Ini");
        }
    }
    
    public static void enrollCourse(Murid murid, Pelajaran pelajaran) {
        if (murid != null && pelajaran != null) {
            if (murid.getCourseEnrolled()< 10) {
                murid.addCourse(pelajaran) ;
                pelajaran.addStudent(murid);
            }
        } else {
            System.out.println("Isi Pelajaran dan Nama Anda");
        }
    }
    
    public static void saveTheData() {
        try {
            File file = new File(Sekolah.fileStore);
            FileWriter writer = new FileWriter(file);
            writer.write(Sekolah.nama);
            writer.write("\n");
            writer.write(new Integer(Sekolah.jumlahMurid).toString()); // FIXME
            writer.write("\n");
            for (int i = 0; i < jumlahMurid; i++) {
                murid[i].saveTheData(writer);
            }
            
            writer.write(new Integer(Sekolah.jumlahPelajaran).toString());
            writer.write("\n");
            for (int i = 0; i < jumlahPelajaran; i++) {
                pelajaran[i].saveTheData(writer);
            }
            writer.write(Sekolah.jumlahGuru);
            writer.write("\n");
            for (int i = 0; i < jumlahGuru; i++) {
                guru[i].saveTheData(writer);
            }
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
