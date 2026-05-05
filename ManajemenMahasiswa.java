/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO_Kelompok1;

import UTS_PBO_Kelompok1.Mahasiswa;
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/**
 *
 * @ketua Farrel Risqullah Mahardika (25104410017)
 * @anggota Tegar Ludwinio Mahardhika (25104410001), Anjas Bagus Mussafa (25104410026), Panca Dasilva Prastia (25104410028), Fito Dwi Yogi Febriansyah (25104410081)
 * Kelas = Teknik Informatika 2A
 */
public class ManajemenMahasiswa {
    
    public static void main(String[] args) {
        
        // Array of Object Mahasiswa dengan kapasistas maksimal 10
        Mahasiswa[] daftarMhs = new Mahasiswa[10];
        
        // Penghitung user tidak melebihi 10
        int counter = 0, pilihan;
        
        // Input user
        Scanner sc = new Scanner(System.in);
        
        // Untuk cek tanda berhasil ditemukan atau tidak
        boolean check = false;
        
        // Fitur Porgram (Menu)
        do {
            System.out.println("===MENU MANAJEMEN MAHASISWA===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Mahasiswa yang Lulus");
            System.out.println("5. Naikkan Semester Semua Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Masukkan menu pilihan: ");
            pilihan = sc.nextInt();
            
            // Enter tidak menjalankan kode berikutnya
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    
                    // Tambah mahasiswa
                    System.out.println("\n===TAMBAH MAHASISWA===");
                    
                    if (counter >= 10) {
                        System.out.println("~ Maaf, data sudah mencapai batas maksimal (10), tidak bisa input lagi\n");
                    } else {
                        
                        // Input data mahasiswa dengan memanggil setter (Encapsulation)
                        System.out.print("Masukkan NIM: ");
                        String setNim = sc.nextLine();
                        
                        if (setNim.isEmpty()) {
                            System.out.println("\nNIM tidak boleh kosong\n");
                        } else {
                            System.out.print("Masukkan Nama: ");
                            String setNama = sc.nextLine();
                            
                            System.out.print("Masukkan Jurusan: ");
                            String setJurusan = sc.nextLine();
                            
                            System.out.print("Masukkan Semester: ");
                            int setSemester = sc.nextInt();
                            sc.nextLine();
                            
                            if (setSemester < 1 || setSemester > 8) {
                                System.out.println("\nInvalid, Semester harus antara 1-8\n");
                            } else {
                                System.out.print("Masukkan IPK: ");
                                double setIPK = sc.nextDouble();
                                sc.nextLine();
                                
                                if (setIPK < 0.0 || setIPK > 4.0) {
                                    System.out.println("\nInvalid, IPK harus antara 0.0-4.0\n");
                                } else {
                                    
                                    // Objek baru lalu disimpan ke Array, membuat fungsi Counter, serta memanggil Constructor Overloading
                                    daftarMhs[counter] = new Mahasiswa (setNim, setNama, setJurusan, setSemester, setIPK);
                                    counter++;
                                    System.out.println("===DATA MAHASISWA BERHASIL DITAMBAHKAN===\n");
                                }
                            }  
                        }
                    }
                    break;
                    
                case 2:
                    
                    // Menanmpilkan data semua mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf, data belum tersedia\n");
                    } else {
                        
                    // Melihat data mahasiswa dengan for loop
                    for (Mahasiswa lihatMhs : daftarMhs) {
                        
                        // Validasi dilakukan agar tidak terjadi NullPointerException
                        if (lihatMhs !=null) {
                            System.out.println("");
                            lihatMhs.tampilData();
                            System.out.println("");
                            check = true;
                        }
                    }
                    if (!check) {
                            System.out.println("\n~ Maaf, data yang Anda cari tidak ditemukan\n");
                        }
                    }
                    break;
                    
                case 3:
                    
                    // Mencari data mahasiswa berdasarkan NIM
                    if (counter == 0) {
                        System.out.println("\nMaaf, data belum tersedia\n");
                    } else {
                        System.out.println("\n==Cari Mahasiswa Berdasarkan NIM==");
                        System.out.print("Masukkan NIM : ");
                        String nimTemp = sc.nextLine();
                    
                            for (int i = 0; i < counter; i++) {
                                
                                // Encapsulasi : mengakses atribut NIM melalui getNim()
                                if (daftarMhs[i].getNim().equals(nimTemp)) {
                                daftarMhs[i].tampilData();
                                check = true;
                                System.out.println("");
                            } 
                        }
                        if (!check) {
                            System.out.println("\n~ Maaf, data yang Anda cari tidak ditemukan\n");
                        }
                    }
                    break;
                    
                case 4:
                    
                    // Menampilkan mahasiswa yang lulus
                    if (counter == 0) {
                        System.out.println("\nMaaf, data belum tersedia\n");
                    } else {
                        for (int y = 0; y < counter; y++) {
                            
                            //memanggil method lulus
                            if (daftarMhs[y].isLulus()) {
                                daftarMhs[y].tampilData();
                                check = true;
                            } 
                        }
                        if (!check) {
                            System.out.println("\n~ Maaf, data yang Anda cari tidak ditemukan\n");
                        }
                    }
                    break;  
                    
                case 5:
                    
                    // Menaikkan semester semua mahasiswa
                    if (counter == 0) {
                        System.out.println("\nMaaf, data belum tersedia\n");
                    } else {
                        for (int j = 0; j < counter; j++) {
                            // memanggil method getSemester
                            if (daftarMhs[j].getSemester() < 8) {
                                daftarMhs[j].naikSemester();
                            }
                         }
                        System.out.println("\nSemester semua mahasiswa berhasil dinaikkan!\n");
                     }
                    break;
                    
                case 6:
                    
                    //keluar
                    System.out.println("Terima kasih atas penggunaan program ini");
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (pilihan !=6);
    }
}
