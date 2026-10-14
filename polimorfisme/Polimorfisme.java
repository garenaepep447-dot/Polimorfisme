/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfisme;

/**
 *
 * @author RPL-
 */
public class Polimorfisme {

    public static void main(String[] args) {
       Pegawai p = new Pegawai();
       p = new Programmer();//polimorfisme
       p= new Manajer();//polimorfisme
       
       Manajer m = new Manajer();
       m.gajiPokok = 10000;
       m.nama = "Sai";
       m.tunjangan = 500;
       p= m;
       p.tampilData();
       
       m.tampilData();
    }
}
