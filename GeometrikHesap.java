/*
 * AD SOYAD: MUHAMMED EREN YAPRAKCI
 * ÖĞRENCİ NO: 250542006
 * TARİH: 06.11.2025
 * AÇIKLAMA: 2- Geometrik Hesaplayıcı
 * 
 * Bu program, kullanıcıdan bir dairenin yarıçapını alır ve
 * dairenin alanını, çevresini, çapını, kürenin hacmini ve yüzey alanını hesaplar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        final double pi = 3.14159;
        
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");

        Scanner yariCapInput = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");

        double yariCap = yariCapInput.nextDouble();
        double alan = pi * yariCap * yariCap;
        double cevre = 2 * pi * yariCap;
        double cap = 2 * yariCap;
        double kureHacim = (4/3) * pi * yariCap * yariCap * yariCap;
        double kureYuzeyAlan = 4 * pi * yariCap * yariCap;
        
        System.out.println("\nSONUÇLAR: ");
        System.out.println("--------------");
        System.out.printf("Dairenin Alanı: %.2f cm²", alan);
        System.out.printf("\nDairenin Çevresi: %.2f cm", cevre);
        System.out.printf("\nDairenin Çapı: %.2f cm", cap);
        System.out.printf("\nKürenin Hacmi: %.2f cm³", kureHacim);
        System.out.printf("\nKürenin Yüzey Alanı: %.2f cm²", kureYuzeyAlan);
    }
}
