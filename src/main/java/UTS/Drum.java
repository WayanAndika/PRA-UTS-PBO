/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Drum extends AlatMusik {
    public int jumlahSenar;
    public int jumlahPedal;
    public Drum(String nama) {
        super(nama, "Drum");
    }
    public void stimel(){
        System.out.println("Nada pada Drum sudah di Atur");
    }
    public void setTinggiHiHat(int tinggi){
        System.out.println("Tinggi Hi Hat = "+ tinggi+"mm");
    }
    public void setJumlahSenar(int senar){
        System.out.println("Jumlah Senar Drum = "+ senar);
    }
    public void mainkan(String nama, String suara) {
        System.out.println("Memainkan alat musik " + nama+" dengan suara "+suara);
    }
    public static void main(String[]args){
        Drum drum=new Drum("Drum Akustik");
        drum.getJenis();
        drum.getNama();
        drum.setTinggiHiHat(20);
        drum.setJumlahSenar(5);
        drum.mainkan(drum.nama, "Gedebuk");
    }
}