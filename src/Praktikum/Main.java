/*Program yang saya buat adalah membuat SIAKAD sederhana*/
package Praktikum;

public class Main {
    public static void main(String[] args) {
        
        Jadwal jadwall = new Jadwal();
        System.out.println(jadwall.jadwalHarian());
        
        
        Pelajaran maths = new Pelajaran("Maths", 3);
        Jadwal jadwal = new Jadwal(new String[]{"Monday", "Wednesday"}, new int[]{9, 13}, new int[] {2, 2});
        maths.setSchedule(jadwal);
        
        Pelajaran physics = new Pelajaran("Physics", 2);
        jadwal = new Jadwal(new String[]{"Monday", "Wednesday"}, new int[]{16, 16}, new int[] {2, 2});
        physics.setSchedule(jadwal);
        
        Pelajaran urdu = new Pelajaran("Urdu", 1);
        jadwal = new Jadwal(new String[]{"Tuesday", "Thursday"}, new int[]{9, 13}, new int[] {2, 2});
        urdu.setSchedule(jadwal);
        
        jadwal = new Jadwal(new String[]{"Monday", "Friday"}, new int[]{10, 20}, new int[] {2, 1});
        Guru t1 = new Guru("T1", maths, jadwal);
        
        jadwal = new Jadwal(new String[]{"Tuesday", "Friday"}, new int[]{12, 14}, new int[] {1, 1});
        Guru t2 = new Guru("T2", physics, jadwal);
        
        Murid s1 = new Murid("S1", 101, new Pelajaran[] {maths, physics});
        Murid s2 = new Murid("S2", 102, new Pelajaran[] {maths, physics, urdu});
        Murid s3 = new Murid("S3", 103, new Pelajaran[] {physics, urdu});
        
        Sekolah.addCourse(maths);
        Sekolah.addCourse(physics);
        Sekolah.addCourse(urdu);
        
        Sekolah.addTeacher(t1);
        Sekolah.addTeacher(t2);
        
        Sekolah.admitStudent(s1);
        Sekolah.admitStudent(s2);
        Sekolah.admitStudent(s3);
        
		System.out.println(s1.Biodata());
		System.out.println(s2.Biodata());
		System.out.println(s3.Biodata());
		
		System.out.println(t1.biodataGuru());
		System.out.println(t2.biodataGuru());

		System.out.println(physics.DaftarPelajaran());
		System.out.println(maths.DaftarPelajaran());
		System.out.println(urdu.DaftarPelajaran());
    }
}

