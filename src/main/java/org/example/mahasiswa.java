package org.example;

public class mahasiswa {
        private String nama;
        private String nim;
        private String jurusan;

        // Constructor
        public mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }

        // Method untuk menampilkan data mahasiswa
        public void tampilDataMahasiswa() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jurusan: " + jurusan);
        }

        // Static method untuk menampilkan informasi universitas
        public static void tampilUniversitas() {
            System.out.println("Universitas Muhammadiyah Malang");
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }
        public  String getJurusan(){
            return jurusan;
        }
        public void setJurusan(String jurusan){
            this.jurusan = jurusan;
        }
    }