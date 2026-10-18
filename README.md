# 🌏 Mengenal Negara dan Bendera ASEAN

Aplikasi Android berbasis **Jetpack Compose** modern yang dirancang untuk memperkenalkan daftar 10 negara anggota ASEAN beserta detail informasi benderanya secara interaktif.

---

## 📱 Tampilan Aplikasi (UI Screenshots)

| Tab Negara ASEAN | Tab Bendera Negara |
| :---: | :---: |
| ![Daftar Negara](https://raw.githubusercontent.com/dewistfatiha-max/latihandewi1/main/screenshots/negara.jpg) | ![Daftar Bendera](https://raw.githubusercontent.com/dewistfatiha-max/latihandewi1/main/screenshots/bendera.jpg) |

---

## ✨ Fitur Utama

* **🌏 Tab Daftar Negara ASEAN**: Menampilkan daftar 10 negara anggota ASEAN lengkap dengan emoji bendera dan nama negaranya.
* **🚩 Tab Informasi Bendera**: Menampilkan detail deskripsi/sebutan bendera khas untuk setiap negara ASEAN.
* **🧭 Navigasi Bottom Navigation Bar**: Berpindah antar halaman (*Negara* & *Bendera*) dengan mudah dan intuitif.
* **🎨 UI Modern dengan Jetpack Compose**: Menggunakan komponen Material 3 (`Card`, `NavigationBar`, `Scaffold`, `LazyColumn`).

---

## 🛠️ Spesifikasi & Konfigurasi Teknis

Project ini dikonfigurasi menggunakan **Gradle Kotlin DSL (`build.gradle.kts`)** dengan detail SDK sebagai berikut:

* **Language**: Kotlin
* **UI Framework**: Jetpack Compose (Material 3)
* **Namespace**: `com.example.dewi.negaradanbendera`
* **Compile SDK**: `35`
* **Target SDK**: `34`
* **Min SDK**: `26` (Android 8.0 Oreo - menjamin kompatibilitas perangkat)

---

## 📂 Struktur Project

```text
app/
 └── src/
      └── main/
           └── java/
                └── com/example/dewi/negaradanbendera/
                     └── MainActivity.kt
