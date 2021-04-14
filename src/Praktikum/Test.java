
package Praktikum;
import java.util.Scanner;

public class Test {
    
    public static int menu() {
        int menu = 0;
        System.out.println("Masukkan Pilihan Anda\n");
        System.out.println("Menambahkan Murid: 1\n");
        System.out.println("Menambahkan Pelajaran:  2\n");
        System.out.println("Menambahkan Guru:  3\n");
        System.out.println("Menampilkan Murid: 1\n");
        System.out.println("Menampilkan Pelajaran:  2\n");
        System.out.println("Menampilkan Guru:  3\n");
        System.out.println("Exit:  0\n");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        return menu;
    }
    
    public static void addAStudent() {
        Scanner input = new Scanner(System.in);
        Murid murid = Murid.InfoMurid(input); 
        Sekolah.admitStudent(murid);    
    }
    
    public static void addACourse() {
        Scanner input = new Scanner(System.in);
        Pelajaran pelajaran = Pelajaran.createACourse(input);
        Sekolah.addCourse(pelajaran);
    }
    
    public static void addATeacher() {
        Scanner input = new Scanner(System.in);
        Guru guru = Guru.ATeacher(input) ;
        Sekolah.addTeacher(guru);
    }
    
    public static void main(String[] args) {
        int menu = menu();
        while (menu != 0) {
            if (menu == 1) {
                addAStudent();
            } else if (menu == 2) {
                addACourse();
            } else if (menu == 3) {
                addATeacher();
            } else if (menu == 4) {
                Sekolah.JumlahMurid();
            } else if (menu == 5) {
                Sekolah.JumlahPelajaran();
            } else if (menu == 6) {
                Sekolah.JumlahGuru();
            }menu = menu();
        }
        Sekolah.saveTheData();
    }

}


