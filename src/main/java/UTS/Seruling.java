/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Seruling extends AlatMusik {
    public int jumlahHole=8;
    public Seruling(String nama) {
        super(nama, "Seruling");
    }
    public void klep(){
        System.out.println("Kelp "+nama+" sudah terbuka");
    }
    public void mainkan(String nama, String suara) {
        System.out.println("Memainkan alat musik " + nama+" dengan suara "+suara);
    }
    public static void main(String[]args){
        Seruling seruling=new Seruling("Seruling Pan");
        seruling.getJenis();
        seruling.getNama();
        System.out.println("Jumlah Hole Pada Seruling = "+ seruling.jumlahHole);
        seruling.mainkan(seruling.nama, "Ti...Luuu...Li...Lu....Li.....");
    }
}
