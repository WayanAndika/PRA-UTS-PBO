/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Gitar extends AlatMusik {
    public int jumlahSenar;
    public Gitar(String nama) {
        super(nama, "Gitar");
    }
    public void gantiSenar(){
        System.out.println("Senar "+nama+" sudah terganti");
    }
    public String getSuara(){
        System.out.println("Genjreng adalah bunyi dari "+nama);
        return "";
    }
    public void setJumlahSenar(int senar){
        jumlahSenar = senar;
    }
    public void mainkan(String nama, String suara) {
        System.out.println("Memainkan alat musik " + nama+" dengan suara "+suara);
    }
    public static void main(String[]args){
        Gitar gitar=new Gitar("Gitar Akustik");
        gitar.getJenis();
        gitar.getNama();
        gitar.gantiSenar();
        gitar.getSuara();
        gitar.setJumlahSenar(6);
        System.out.println("Jumlah Senar = "+ gitar.jumlahSenar);
        gitar.mainkan(gitar.nama, "Genjreng");
    }
}
