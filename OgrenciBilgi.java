/*
 * AD SOYAD: MUHAMMED EREN YAPRAKCI 
 * ÖĞRENCİ NO: 250542006
 * TARİH: 06.11.2025
 * AÇIKLAMA: 1- ÖĞRENCİ BİLGİ SİSTEMİ
 * 
 * Bu program, kullanıcıdan öğrenci bilgilerini alır ve
 * girilen bilgileri formatlı bir şekilde ekrana yazdırır.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencinin Adı: ");
        String ad = scanner.nextLine();

        System.out.print("Öğrencinin Soyadı: ");
        String soyad = scanner.nextLine();

        System.out.print("Öğrenci Numarası: ");
        int ogrenciNo = scanner.nextInt();

        System.out.print("Öğrencinin Yaşı: ");
        int yas = scanner.nextInt();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("\n=== ÖĞRENCİ BİLGİ SİSTEMİ ===");
        System.out.println("Adı Soyadı : " + ad + " " + soyad);
        System.out.println("Öğrenci No : " + ogrenciNo);
        System.out.println("Yaşı      : " + yas);
        System.out.printf("GPA       : %.2f%n", gpa);

        if(gpa >= 2.0) {
            System.out.println("Durum     : Başarılı Öğrenci");
        } else {
            System.out.println("Durum     : Başarısız Öğrenci");
        }
    }
}
