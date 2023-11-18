PENJELASAN TENTANG LATIHAN 2 456

1) import java.util.Scanner;

pernyataan ini bertujuan untuk mengimpor kelas "Scanner" dari paket "java.util". Kelas "Scanner" digunakan untuk membaca input dari pengguna.

2) class Latihan1 {

method untuk mendeklarasikan kelas utama dengan nama "Latihan1"

3) while (true) {

sebuah loop tak terbatas akan menjalankan program terus menerus

4) private static String teks = "";
   pernyataan untuk deklarasi dan inisialisasi variabel. Variabel teks digunakan untuk menyimpan teks yang dimasukkan oleh pengguna saat program berjalan.

5) Scanner scanner = new Scanner(System.in);
int pilihan;

method yang digunakan untuk menginput pada pilihan

6) do while (pilihan != 5)
loop untuk mengulang kode sampai berhenti pada pilihan ke 5

7) switch
kondisi untuk memilih operasi yang akan digunakan

8) private static void masukkanTeks(Scanner scanner) {
System.out.print("Masukkan teks: ");
scanner.nextLine(); // Consume newline character
teks = scanner.nextLine();
System.out.println("Teks telah dimasukkan!\n");
}

method yang digunakan untuk menginput teks yang dimasukkan 
dan disimpan di variabel teks

9) private static void hitungJumlahKarakter() {
System.out.println("Jumlah karakter dalam teks: " + teks.length() + "\n");
}

method yang digunakan untuk menghitung jumlah karakter 
menggunakan API teks.Length

10) private static void hitungJumlahKata() {
if (!teks.isEmpty()) {
String[] words = teks.split("\\s+");
System.out.println("Jumlah kata dalam teks: " + words.length + "\n");
} else {
System.out.println("Teks belum dimasukkan. Silakan masukkan teks terlebih dahulu.\n");
}
}

method untuk menghitung jumlah kata menggunakan API teks.split dan teks.isEmpty. Kondisi if (!teks.isEmpty()) jika teks tidak kosong maka dilakukan proses pemisahan pada teks.split teks menjadi array kata. Pemisahan dilakukan berdasarkan spasi (\\s+), yang berarti setiap kali ada satu atau lebih spasi, teks akan dipisahkan menjadi elemen-elemen array. Setelah pemisahan, program mencetak jumlah kata dalam teks. words.length memberikan panjang array words, yang sesuai dengan jumlah kata dalam teks.
Hasilnya dicetak dengan menggunakan System.out.println.

11) private static void cariKata(Scanner scanner) {
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

System.out.println("Kata '" + kataCari + "' ditemukan sebanyak 
" + count + " kali dalam teks.\n");
} else {
System.out.println("Teks belum dimasukkan. Silakan masukkan teks
terlebih dahulu.\n");
}
    }

method mencari kata. Pertama memeriksa teks kosong atau tidak 
lalu program meminta kata yang dicari ke variabel kataCari.
Membuat variabel count yang akan digunakan untuk menghitung berapa
kali kata yang dicari muncul dalam teks.

* String[] words = teks.split("\\s+");:

Memisahkan teks menjadi array kata menggunakan spasi sebagai pemisah.

* for (String word : words) { if (word.equalsIgnoreCase(kataCari)){ count++; } }:

Melakukan iterasi melalui setiap kata dalam array words. Memeriksa apakah 
kata saat ini sama dengan kata yang dicari (kataCari), mengabaikan perbedaan
huruf besar-kecil dengan menggunakan equalsIgnoreCase. Jika sama, increment 
variabel count.