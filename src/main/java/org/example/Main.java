import org.example.mahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine();
            // Membuang newline
            switch (choice) {
                case 1:
                    inputDataMahasiswa(input);
                    break;
                case 2:
                    System.out.println("Data Mahasiswa:" +
                            "Universitas Muhammadiyah Malang" +
                            "Nama: Muhammad Alfarizi Hardiansyah" +
                            "NIM: 202310370311290" +
                            "Jurusan: Informatika");
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                        default:
                            System.out.println("Menu tidak valid. Silakan pilih lagi.");
                    }
                } while (choice != 2);
            }

            public static void inputDataMahasiswa(Scanner input) {
                // Meminta input nama dan nim dari pengguna
                System.out.println("Masukkan nama mahasiswa:");
                String nama = input.nextLine();

                String nim;
                do {
                    System.out.println("Masukkan NIM mahasiswa (maksimal 15 angka):");
                    nim = input.nextLine();
                } while (nim.length() < 1 || nim.length() > 15);
                System.out.println("Masukkan Jurusan mahasiswa: ");
                String jurusan = input.nextLine();


                // Membuat objek mahasiswa
                mahasiswa mahasiswa = new mahasiswa(nama, nim, jurusan);

                // Menampilkan data mahasiswa
                System.out.println("Data Mahasiswa:");
                mahasiswa.tampilUniversitas();
                mahasiswa.tampilDataMahasiswa();
            }
        }