package Modul4.Tugas.Latihan1;

import java.util.Scanner;

class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            }

            System.out.print("Masukkan angka: ");
            double num = scanner.nextDouble();

            switch (choice) {
                case 1:
                    double hasilakarkuadrat = Math.sqrt(num);
                    System.out.println("Hasil akar kuadrat dari " + num + " adalah " + hasilakarkuadrat);
                    break;
                case 2:
                    System.out.print("Masukkan pangkat: ");
                    double angka = scanner.nextDouble();
                    double hasilangka = Math.pow(num, angka);
                    System.out.println(num + " pangkat " + angka + " adalah " + hasilangka);
                    break;
                case 3:
                    double hasilLog = Math.log(num);
                    System.out.println("Logaritma natural dari " + num + " adalah " + hasilLog);
                    break;
                case 4:
                    long hasilFaktorial = factorial((int) num);
                    System.out.println("Faktorial dari " + (int) num + " adalah " + hasilFaktorial);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih operasi yang benar.");
            }
        }
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}