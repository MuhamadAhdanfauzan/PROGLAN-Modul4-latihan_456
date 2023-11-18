PENJELASAN TENTANG LATIHAN 1 456

1) import java.util.Scanner;

pernyataan ini bertujuan untuk mengimpor kelas "Scanner" dari paket 
"java.util". Kelas "Scanner" digunakan untuk membaca input dari 
pengguna.

2) class Latihan1 {

method untuk mendeklarasikan kelas utama dengan nama "Latihan1"

3) while (true) {

sebuah loop tak terbatas akan menjalankan program terus menerus

4) System.out.println("=== Calculator ===");
   System.out.println("1. Akar Kuadrat");
   System.out.println("2. Pangkat");
   System.out.println("3. Logaritma");
   System.out.println("4. Faktorial");
   System.out.println("5. Keluar");

fungsi untuk menampilkan menu kalkulator

5) System.out.print("Pilih operasi (1/2/3/4/5): ");

int choice = scanner.nextInt();
method untuk meminta pengguna memasukkan pilihan operasi

6) if (choice == 5) {
   System.out.println("Terima kasih telah menggunakan kalkulator ini.");
   break;
   }

kondisi dimana Jika pengguna memilih opsi keluar (pilihan 5), program 
mencetak pesan "terima kasih dan keluar dari loop menggunakan pernyataan break"

7) System.out.print("Masukkan angka: ");

double num = scanner.nextDouble();
method untuk Meminta pengguna untuk memasukkan angka yang akan digunakan
dalam operasi matematika.

8) switch (choice) {

pernyataan untuk menentukan operasi mana yang dipilih pengguna

9) double hasilakarkuadrat = Math.sqrt(num);
   System.out.println("Hasil akar kuadrat dari " + num + " adalah " +

hasilakarkuadrat);
program untuk menghitung akar kuadrat yang mana saat si pengguna
memasukkan angka untuk menghitung akar kuadrat lalu dimasukkan ke 
Math.sqrt API di variabel "hasilakarkuadrat" untuk menghitung akar 
karena sudah terdapat rumus didalamnya kemudian ditampilkan.

10)  System.out.print("Masukkan pangkat: ");
     double angka = scanner.nextDouble();
     double hasilangka = Math.pow(num, angka);
     System.out.println(num + " pangkat " + angka + " adalah " + hasilangka);

Menggunakan API Math.pow() karena sudah terdapat rumusnya lalu program akan
menghitung hasil pangkat dari angka yang telah dimasukkan pada "num" dengan 
pangkat yang dimasukkan oleh pengguna pada "angka", dan hasilnya disimpan
dalam variabel "hasilangka" kemudian 
ditampilkan

11) double hasilLog = Math.log(num);
    System.out.println("Logaritma natural dari " + num + " adalah " + hasilLog);

Program menggunakan API Math.log(num) untuk menghitung logaritma natural dari
nilai yang dimasukkan oleh pengguna pada "num".
Hasil perhitungan disimpan dalam variabel "hasilLog" kemudian ditampilkan.

12) long hasilFaktorial = factorial((int) num);
    System.out.println("Faktorial dari " + (int) num + " adalah " + hasilFaktorial);

Untuk menghitung faktorial dari num menggunakan metode rekursif factorial dan 
mencetak hasilnya.

13) private static long factorial(int n) {
    if (n == 0 || n == 1) {
    return 1;
    } else {
    return n * factorial(n - 1);
    }
    }

method rekursif untuk menghitung faktorial suatu bilangan bulat. Cara kerjanya adalah 
program memanggil method faktorial untuk menghitung angka dari nilai "num" lalu method 
factorial dijalankan dengan nilai "n" dari num tadi. Dalam methode factorial dilakukan 
pengujian kondisi jika "n" adalah 0 atau 1, method mengembalikan nilai 1. Jika "n" 
bukan 0 atau 1 maka dihitung pada rumus return n * factorial(n-1) nilai n dikalikan
dengan faktorial dari "(n-1)" n dikurang 1 dan akan berlanjut hingga kondisi dasar. 