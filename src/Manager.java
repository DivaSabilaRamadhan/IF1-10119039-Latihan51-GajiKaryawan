/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deksripsi Program : berisi class dari Manager
 */
public class Manager extends Karyawan {
    private int Kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran(){
        return Kehadiran;
    }
    
    public void setKehadiran(int Kehadiran){
        this.Kehadiran = Kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        return hadir = Kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if(jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        } else if(jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        if(golongan == 1) {
            tunjanganGolongan = 500000;
        } else if(golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if(golongan == 3) {
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan(jabatan) + tunjanganGolongan(golongan);
    }
    
}
