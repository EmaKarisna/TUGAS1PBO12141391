/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author setyakarisna
 */
public class segitigakananatas {//untuk membuat judul pada class
   public static void main(String[] args) {
            int x =6;
            for (int i=1;i<=6;i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for(int j=6;j>=i;j--){//untuk mengatur spasi antar bintang pada setiap barisnya
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){//digunakan untuk melakukan perulangan yang menghasilkan (*) dalam pembuatan pola 
                System.out.print("*");//simbol yang digunakan untuk mengisi pola
            }
            System.out.println();//Mencetak hasil
      }
   }
}