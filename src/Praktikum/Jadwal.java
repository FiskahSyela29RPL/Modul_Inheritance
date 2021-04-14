
package Praktikum;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Jadwal {
    private String[ ] hari;
    private int[ ] jam;
    private int [ ] waktu;
    
    public Jadwal() {
        this.hari = new String[2];
        this.hari[0] = "Monday";
        this.hari[1] = "Wednesday";
        this.jam = new int[2];
        this.jam[0] = 10;
        this.jam[1] = 10;
        this.waktu = new int[2];
        this.waktu[0] = 2;
        this.waktu[1] = 1;
    }
    
    public Jadwal (String[] hari, int[] jam , int waktu []) {
        this.hari = hari;
        this.jam= jam;
        this.waktu = waktu;
    }
    
    public void Data(FileWriter writer) throws IOException {
        if (hari != null && hari.length > 0) {
            for (int i = 0; i < hari.length; i++) {
                writer.write(hari[i]);
                writer.write(new Integer(jam[i]).toString());
                writer.write("\n");
                writer.write(new Integer(waktu[i]).toString());
                writer.write("\n");
            }
        }
    }
    
    public static Jadwal DaftarJadwal(Scanner input) {
        System.out.println("Masukkan Jadwal Anda: ");
        System.out.println("Hari: ");
        String jadwal1 = input.next();
        System.out.println("Jam: ");
        int  jam1= input.nextInt();
        System.out.println("Lama Mengajar: ");
        int  waktu1 = input.nextInt();

        System.out.println("Masukkan Jadwal Anda: ");
        System.out.println("Hari: ");
        String jadwal2 = input.next();
        System.out.println("Jam: ");
        int  jam2 = input.nextInt();
        System.out.println("Lama Mengajar: ");
        int  waktu2 = input.nextInt();
        
        String[ ] hari = new String[ ]{jadwal1, jadwal2};
        int[ ]  jam = new int[] {jam1, jam2};
        int[] waktu = new int[ ] {waktu1, waktu2};
        Jadwal jadwal = new Jadwal (hari, jam, waktu);
        return jadwal;
    }
    
    
    public String jadwalHarian() {
        String jadwal = "";
        for (int i =0; i < this.hari.length; i++) {
            jadwal = jadwal.concat(this.hari[i] + " at " + this.jam[i] + " for " + this.waktu[i] + " hrs\n");
        }
        return jadwal;
    }

    void saveTheData(FileWriter writer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    






