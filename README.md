# Tugas 1: Merancang Antarmuka (UI/UX) Dasar Aplikasi Mobile

## 📌 Deskripsi Aplikasi
**Nama Aplikasi**: Mengenal Negara dan Bendera ASEAN  
**Package / Namespace**: `com.example.dewi.negaradanbendera`  
Aplikasi ini adalah aplikasi mobile berbasis Android yang dirancang menggunakan **Jetpack Compose** (Material 3). Aplikasi ini berfungsi untuk mengenalkan 10 negara anggota ASEAN beserta detail informasi benderanya kepada pengguna melalui antarmuka yang interaktif, bersih, dan mudah digunakan.

---

## ✨ Fitur dan Layar Aplikasi
Aplikasi ini terdiri dari 2 layar/halaman utama yang dihubungkan melalui *Bottom Navigation Bar*:

1. **Layar Daftar Negara ASEAN (`Tab Negara`)**:
   * Menampilkan judul halaman "Negara-Negara ASEAN" beserta salam menyapa pengguna.
   * Menampilkan daftar 10 negara anggota ASEAN dalam bentuk *Card* interaktif (Indonesia, Malaysia, Singapura, Thailand, Filipina, Vietnam, Brunei Darussalam, Laos, Myanmar, Kamboja).
   * Dilengkapi emoji bendera untuk memperjelas visual setiap negara.

2. **Layar Detail Bendera Negara (`Tab Bendera`)**:
   * Menampilkan judul "Bendera Negara ASEAN".
   * Menampilkan daftar deskripsi/sebutan bendera khas untuk masing-masing negara (contoh: *Indonesia — Merah Putih*, *Malaysia — Jalur Gemilang*, *Singapura — Bulan Bintang*, dll).

---

## 🧩 Komponen UI Dasar yang Digunakan

Aplikasi ini dibangun mengimplementasikan komponen-komponen antarmuka dasar Jetpack Compose & Material 3 sebagai berikut:

* **`Scaffold`**: Menyusun tata letak dasar aplikasi (layout utama) yang menampung *Bottom Navigation Bar* dan area konten.
* **`NavigationBar` & `NavigationBarItem`**: Menyediakan batang navigasi di bagian bawah layar untuk berpindah antara layar "Negara" dan "Bendera".
* **`LazyColumn`**: Menampilkan daftar item negara dan bendera secara efisien dengan kemampuan *scrolling* vertikal.
* **`Card`**: Mengemas setiap item negara/bendera dalam bentuk kartu berwarna putih dengan sudut melengkung (*rounded corners*) agar tampilan rapi.
* **`Text`**: Menampilkan judul, salam pembuka, nama negara, serta deskripsi bendera dengan berbagai ukuran font dan ketebalan (*font weight*).
* **`Icon` / `Image`**: Menampilkan ikon navigasi bumi/globe dan bendera di bagian bawah.
* **`Column` & `Row`**: Mengatur posisi elemen UI secara vertikal dan horizontal.

---

## 🛠️ Spesifikasi Teknis & Cara Menjalankan Aplikasi

### Konfigurasi Project (`build.gradle.kts`):
* **Compile SDK**: `35`
* **Target SDK**: `34`
* **Min SDK**: `26` (Android 8.0 Oreo)
* **UI Framework**: Jetpack Compose (Material 3)

### Cara Menjalankan Project:
1. Clone repositori ini:
   ```bash
   git clone [https://github.com/dewistfatiha-max/latihandewi1.git](https://github.com/dewistfatiha-max/latihandewi1.git)
