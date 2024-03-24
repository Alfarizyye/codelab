package org.example;
import java.util.Scanner;

public class LoginSystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin290";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Library Login System");
        System.out.println("Pilih tipe pengguna (admin/mahasiswa): ");
        String userType = scanner.nextLine().toLowerCase();

        if (userType.equals("admin")) {
            adminLogin(scanner);
        } else if (userType.equals("mahasiswa")) {
            mahasiswaLogin(scanner);
        } else {
            System.out.println("Tipe pengguna tidak valid. Silakan coba lagi.");
        }
    }

    static void adminLogin(Scanner scanner) {
        System.out.print("Masukkan username admin: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password admin: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login berhasil sebagai admin.");
        } else {
            System.out.println("Username atau password admin tidak valid.");
        }
    }

    static void mahasiswaLogin(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        if (isValidNIM(nim)) {
            System.out.println("Login berhasil sebagai mahasiswa.");
        } else {
            System.out.println("NIM tidak valid. Pastikan NIM memiliki panjang 15 karakter.");
        }
    }

    static boolean isValidNIM(String nim) {
        return nim.length() == 15;
    }
}