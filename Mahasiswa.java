/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO_Kelompok1;

/**
 *
 * @ketua Farrel Risqullah Mahardika (25104410017)
 * @anggota Tegar Ludwinio Mahardhika (25104410001), Anjas Bagus Mussafa (25104410026), Panca Dasilva Prastia (25104410028), Fito Dwi Yogi Febriansyah (25104410081)
 * Kelas = Teknik Informatika 2A
 */
public class Mahasiswa {

    // =======================
    // ENCAPSULATION (private)
    // =======================
    private String nim;
    private String nama;
    private String jurusan;
    private int semester;
    private double ipk;
    
    // =========================
    // CONSTRUCTOR OVERLOADING
    // =========================
    
    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.jurusan = "";
        this.semester = 0;
        this.ipk = 0.0;
    }
    
    // Constructor dengan parameter nim & nama
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = "";
        this.semester = 0;
        this.ipk = 0.0;
    }
    
    // Constructor dengan semua parameter (nim, nama, jurusan, semester, ipk)
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }
    
    // ===================
    // METHOD OVERLOADING
    // ===================
    
    // Method tampilData
    void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);
        System.out.println("------------------------");
    }
    
    // Method tampilData dengan Header
    void tampilData(boolean denganHeader) {
        if (denganHeader == true) {
            System.out.println("===DATA MAHASISWA===");
            tampilData();
        }
    }
    
    // ================================================================
    // GETTER & SETTER semua atribut dan mencentang encapsulate fields
    // ================================================================

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    // ================
    // METHOD TAMBAHAN
    // ================
    
    // Method lulus jika ipk di atas 3.00
    boolean isLulus() {
        return this.ipk >= 3.0;
    }
    
    // Method naik semester
    void naikSemester() {
        if (semester < 8) {
            semester++;
        }
    }
}
