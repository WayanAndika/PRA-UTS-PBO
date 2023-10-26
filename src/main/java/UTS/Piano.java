/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Piano extends AlatMusik{
    public int jumlahTuts;
    public Piano(String nama) {
        super(nama, "Piano");
    }
    public void tuning(){
        System.out.println(nama+" sudah ter-Tuning");
    }
    public void setJumlahTuts(int tuts){
        System.out.println("Jumlah Tuts = "+tuts);
    }
    public void mainkan(String nama, String suara) {
        System.out.println("Memainkan alat musik " + nama+" dengan suara "+suara);
    }
    public static void main(String[]args){
        Piano piano=new Piano("Piano Elektrik");
        piano.getJenis();
        piano.getNama();
        piano.tuning();
        piano.setJumlahTuts(88);
        piano.mainkan(piano.nama, "Tring Tring");
    }
}
