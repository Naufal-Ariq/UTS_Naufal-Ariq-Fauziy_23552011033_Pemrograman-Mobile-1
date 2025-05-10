# NAFStore - Aplikasi Clothing Brand

Aplikasi Android sederhana berbasis Kotlin untuk menampilkan galeri produk pakaian, dengan fitur registrasi dan login. Dibuat sebagai bagian dari tugas mata kuliah Pemrograman Mobile 1.

## 📚 Profile

- **Nama:** Naufal Ariq Fauziy
- **Kelas:** TIF RP 23 CNS C
- **NIM:** 23552011033
- **Mata Kuliah:** Pemrograman Mobile 1

## 📱 Tampilan Aplikasi

### 🟣 Splash Screen
Menampilkan logo NAFStore dengan animasi fade-in selama 2,5 detik.


![Splash Screen](https://github.com/user-attachments/assets/65171f9b-ebed-4934-867f-90a934bbb15b)

### 🔐 Login
Pengguna dapat login menggunakan username dan password. Tersedia link ke halaman registrasi.

![Login Screen](screenshots/login.png)

### 📝 Register
Form registrasi sederhana (Username, Email, Password) yang akan menyimpan data secara lokal (sementara).

![Register Screen](screenshots/register.png)

### 🛍️ Galeri Produk
Menampilkan daftar produk fashion dalam bentuk grid (2 kolom), lengkap dengan gambar dan nama produk. Tersedia tombol **Back**.

![Gallery Screen](screenshots/gallery.png)

## 🔧 Fitur Utama

- Splash screen animasi
- Form login dan validasi sederhana
- Form registrasi
- Galeri produk menggunakan `GridView` dan custom adapter
- Navigasi antar activity
- Tampilan gelap (dark theme)
