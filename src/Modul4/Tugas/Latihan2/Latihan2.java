package Modul4.Tugas.Latihan2;

import java.util.Scanner;

public class Latihan2 {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    masukkanTeks(scanner);
                    break;
                case 2:
                    hitungJumlahKarakter();
                    break;
                case 3:
                    hitungJumlahKata();
                    break;
                case 4:
                    cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }

        } while (pilihan != 5);
    }

    private static void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        scanner.nextLine(); // Consume newline character
        teks = scanner.nextLine();
        System.out.println("Teks telah dimasukkan!\n");
    }

    private static void hitungJumlahKarakter() {
        System.out.println("Jumlah karakter dalam teks: " + teks.length() + "\n");
    }

    private static void hitungJumlahKata() {
        if (!teks.isEmpty()) {
            String[] words = teks.split("\\s+");
            System.out.println("Jumlah kata dalam teks: " + words.length + "\n");
        } else {
            System.out.println("Teks belum dimasukkan. Silakan masukkan teks terlebih dahulu.\n");
        }
    }

    private static void cariKata(Scanner scanner) {
        if (!teks.isEmpty()) {
            System.out.print("Masukkan kata yang ingin dicari: ");
            String kataCari = scanner.next();

            int count = 0;
            String[] words = teks.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(kataCari)) {
                    count++;
                }
            }

            System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + count + " kali dalam teks.\n");
        } else {
            System.out.println("Teks belum dimasukkan. Silakan masukkan teks terlebih dahulu.\n");
        }
    }
}