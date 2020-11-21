/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : untuk menampilkan gaji karyawan dengan pendekatan objek
 */
public class Test {

    public static int golongan,hadir;
    public static String jabatan, nik, nama;
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Perhtungan Gaji Karyawan");
        System.out.print("Masukkan NIK \t\t: ");nik = sc.nextLine();
        System.out.print("Masukkan Nama \t\t: ");nama = sc.nextLine();
        System.out.print("Masukkan Gologan (1/2/3) \t: ");golongan = sc.nextInt();
        System.out.print("Masukkan Jaatan (Manager/Kabag : ");jabatan = sc.next();
        System.out.print("Masukkan Jumlah Kehadiran \t : ");hadir = sc.nextInt();
        
        Manager objManager = new Manager();
        objManager.setNik(nik);
        objManager.setNama(nama);
        objManager.setGolongan(golongan);
        objManager.setJabatan(jabatan);
        objManager.setKehadiran(hadir);
        
        System.out.println();
        
        System.out.println("====Hasil Pehitungan====");
        System.out.println("NIK      : " + objManager.getNik());
        System.out.println("NAMA     : " + objManager.getNama());
        System.out.println("GOLONGAN : " + objManager.getGolongan());
        System.out.println("JABATAN  : " + objManager.getJabatan());
        
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN  : " + objManager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN   : " + objManager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : " + objManager.tunjanganKehadiran(hadir));
        
        System.out.println();
        
        System.out.println("GAJI TOTAL \t\t\t: " + objManager.gajiTotal());
    }
    
}
