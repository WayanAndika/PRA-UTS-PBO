/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class AlatMusik {
    public String nama;
    public String jenis;
    public String warna;
    public String bahan;
    public int berat;
    public String nomorSeri;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        System.out.println("Nama Alat Musik ini adalah "+ nama);
        return "";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        System.out.println("Jenis Alat Musik ini adalah "+ jenis);
        return "";
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void mainkan(String nama) {
        System.out.println("Memainkan alat musik " + nama);
    }
}
