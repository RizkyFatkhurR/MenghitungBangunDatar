/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitungbangundatar;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        MenghitungBangunDatar menghitungbangundatar = new MenghitungBangunDatar();
        
        Persegi persegi = new Persegi(8);
        
        Segitiga segitiga = new Segitiga(8, 6);
        
        Lingkaran lingkaran = new Lingkaran(30);
        
        menghitungbangundatar.luas();
        menghitungbangundatar.keliling();
        
        System.out.println("Luas Persegi"+ persegi.luas());
        System.out.println("Keliling Persegi"+ persegi.keliling());
        System.out.println("Luas Segitiga"+ segitiga.luas());
        System.out.println("Luas Lingkaran"+ lingkaran.luas());
        System.out.println("Luas Lingkaran"+ persegi.keliling());
    }
    }

