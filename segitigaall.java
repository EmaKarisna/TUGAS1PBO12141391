/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitigabin;

/**
 *
 * @author setyakarisna
 */
public class segitigaall { 
    public static void main(String [] args){
         
        System.out.println("\nSEGITIGA KIRI ATAS");
        int x=6;
        for (int i=1; i<=6; i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for(int j=1; j<=i; j++){//untuk mengatur spasi antar bintang pada setiap barisnya
                System.out.print("*");//simbol yang digunakan untuk mengisi pola
            }
            System.out.println();//Mencetak hasil
        }
        
        System.out.println("\nSEGITIGA KIRI BAWAH");
            for (int i=1; i<=x; i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for(int j=6; j>=i; j--){//untuk mengatur spasi antar bintang pada setiap barisnya
                System.out.print("*");//simbol yang digunakan untuk mengisi pola
            }
            System.out.println();//Mencetak hasil
        }
        
        System.out.println("\nSEGITIGA KANAN ATAS");
            for (int i=1;i<=6;i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for(int j=6;j>=i;j--){//untuk mengatur spasi antar bintang pada setiap barisnya
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){//digunakan untuk melakukan perulangan yang menghasilkan (*) dalam pembuatan pola 
                System.out.print("*");//simbol yang digunakan untuk mengisi pola
            }
            System.out.println();//Mencetak hasil
        }
            
        System.out.println("\nSEGITIGA KANAN BAWAH");
            for (int i=1; i<=7; i++){//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for (int j=1; j<=7; j++){//untuk mengatur spasi antar bintang pada setiap barisnya
                if(i<j)//digunakan untuk menentukan simbol yang muncul
                System.out.print("*");
                else
                System.out.print(" ");   
            }
            for(int k=7;k>=i;k--){//digunakan untuk melakukan perulangan yang menghasilkan (*) dalam pembuatan pola 
            }
            System.out.println();//Mencetak hasil
        }
            
        System.out.println("\nSEGITIGA SAMA SISI");
            for(int i=1; i<=x; i++) {//digunakan untuk melakukan perulangan yang menghasilkan baris dari pola tersebut dimana perulangan dimulai dari sampai masukan yang telah di masukkan sebelumnya.
            for(int j=x; j>i; j--) {//untuk mengatur spasi antar bintang pada setiap barisnya
              System.out.print(" ");
        }
            for(int k=1; k<=i; k++) {//digunakan untuk melakukan perulangan yang menghasilkan (*) dalam pembuatan pola 
              System.out.print("* ");//simbol yang digunakan untuk mengisi pola
        }
             System.out.println();//Mencetak hasil
        }
            System.out.println();
            System.out.print("baris = " + x);
    }
}
