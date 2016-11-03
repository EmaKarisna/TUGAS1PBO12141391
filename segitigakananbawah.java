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
public class segitigakananbawah { //untuk membuat judul pada class 
   public static void main(String[] args) { 
            int x=6;
            for (int i=1; i<=6; i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for (int j=1; j<=6; j++){//untuk mengatur spasi antar bintang pada setiap barisnya
                if(i<j)//digunakan untuk menentukan simbol yang muncul
                System.out.print("*");
                else
                System.out.print(" ");   
            }
            for(int k=6;k>=i;k--){//digunakan untuk melakukan perulangan yang menghasilkan (*) dalam pembuatan pola 
            }
            System.out.println();//Mencetak hasil
      }
   }
}
