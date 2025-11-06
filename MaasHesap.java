/*
 * AD SOYAD: MUHAMMED EREN YAPRAKCI
 * ÖĞRENCİ NO: 250542006
 * TARİH: 06.11.2025
 * AÇIKLAMA: 3- Maaş Hesaplayıcı
 * 
 * Bu program, kullanıcıdan çalışan bilgilerini alır ve
 * brüt maaş, mesai ücretleri, kesintiler ve net maaşı hesaplar.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nÇalışanın Adı Soyadı: ");
        String adSoyad = scanner.nextLine();
        System.out.print("Brüt Maaş (TL): ");
        double brutMaasTL = scanner.nextDouble();
        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikCalismaSaati = scanner.nextInt();
        System.out.print("Mesai Saati: ");
        int mesaiSaati = scanner.nextInt();

        System.out.println("\n====================================");
        System.out.println("           MAAŞ BORDROSU");
        System.out.println("====================================");

        System.out.println("Çalışan: " + adSoyad);
        System.out.println("Tarih: " + java.time.LocalDate.now());

        // Gelirler
        double mesaiUcreti = (brutMaasTL / (haftalikCalismaSaati * 4)) * mesaiSaati * 1.5;
        double toplamGelir = brutMaasTL + mesaiUcreti;

        // Giderler
        final double sgkKesintiOran = 0.14;
        final double gelirVergisiOran = 0.15;   
        final double damgaVergisiOran = 0.00759;

        double sgkKesintisi = toplamGelir * sgkKesintiOran;
        double gelirVergisi = toplamGelir * gelirVergisiOran;
        double damgaVergisi = toplamGelir * damgaVergisiOran;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        // Net Maaş
        double netMaasTL = brutMaasTL + mesaiUcreti - toplamKesinti;

        // İstatistikler
        double toplamKesintiOrani = sgkKesintiOran + gelirVergisiOran + damgaVergisiOran;
        double saatlikNetKazanc = netMaasTL  / (haftalikCalismaSaati * 4 + mesaiSaati);
        double gunlukNetKazanc = netMaasTL / 30;

        System.out.println("\nGELİRLER:");
        System.out.printf(" - Brüt Maaş: %.2f TL%n", brutMaasTL);
        System.out.printf(" - Mesai Ücreti: %.2f TL%n", mesaiUcreti);
        System.out.println("------------------------------------");
        System.out.printf("Toplam Gelir: %.2f TL%n", toplamGelir);

        System.out.println("\nKESİNTİLER:");
        System.out.printf(" - SGK Kesintisi (%%14): %.2f TL%n", sgkKesintisi);
        System.out.printf(" - Gelir Vergisi (%%15): %.2f TL%n", gelirVergisi);
        System.out.printf(" - Damga Vergisi (%%0.759): %.2f TL%n", damgaVergisi);
        System.out.println("------------------------------------");
        System.out.printf("Toplam Kesinti: %.2f TL%n", toplamKesinti);

        System.out.printf("\nNET MAAŞ: %.2f TL%n", netMaasTL);

        System.out.println("\nİSTATİSTİKLER:");   
        System.out.printf(" - Toplam Kesinti Oranı: %.2f%%%n", toplamKesintiOrani * 100);   
        System.out.printf(" - Saatlik Net Kazanç: %.2f TL%n", saatlikNetKazanc);    
        System.out.printf(" - Günlük Net Kazanç: %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");
    }
}
