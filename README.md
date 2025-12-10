Reflection Question
https://docs.google.com/document/d/1mkF0EViP1VazYcuAPyNygfKXwaeEYBcaSjkQ7-ztDfQ/edit?usp=sharing

Web UI Automation – SauceDemo (Selenium + Page Object Model)

Project ini berisi implementasi Web UI Automation pada website SauceDemo menggunakan Selenium WebDriver dengan arsitektur Page Object Model (POM). Pengujian berfokus pada skenario checkout berhasil, dan test dijalankan secara parallel.

Website yang diuji:
https://www.saucedemo.com/

🚀 Overview

Automation ini dibuat untuk menguji alur checkout di SauceDemo mulai dari login, memilih produk, melakukan checkout, hingga memverifikasi pesan keberhasilan. Dengan menggunakan Page Object Model, setiap halaman dipisahkan menjadi class terstruktur sehingga kode lebih mudah dipelihara dan scalable.
Pengujian dijalankan secara parallel untuk meningkatkan efisiensi waktu eksekusi.

1. Tools & Teknologi
- Java
- Selenium WebDriver
- TestNG (untuk parallel execution & assertions)
-Page Object Model (POM)

Maven

WebDriver Manager

IntelliJ IDEA

2. Test Scenario – Successful Checkout

Berikut flow lengkap skenario pengujian:
- Membuka website: https://www.saucedemo.com
- Login menggunakan:
Username: standard_user
Password: secret_sauce
- Memilih produk Sauce Labs Backpack
- Klik Add to Cart
- Klik icon Cart di kanan atas
- Klik tombol Checkout
- Mengisi form Your Information
- Klik Continue
- Klik Finish
- Verifikasi bahwa pesan berikut muncul:
“Thank you for your order!”

3. Project Structure (Page Object Model)

Struktur berikut bisa kamu gunakan atau sesuaikan dengan projectmu:
src
 └── test
     ├── java
     │    ├── pages
     │    │     ├── LoginPage.java
     │    │     ├── ProductPage.java
     │    │     ├── CartPage.java
     │    │     ├── CheckoutInfoPage.java
     │    │     ├── OverviewPage.java
     │    │     └── CompletePage.java
     │    ├── tests
     │    │     └── CheckoutTest.java
     │    └── utils
     │          └── BaseTest.java
     └── resources
           └── testng.xml  (parallel execution)

4. Parallel Execution

Parallel test dijalankan menggunakan konfigurasi TestNG (testng.xml)

5. Assertions

Pada akhir flow checkout, automation memverifikasi pesan:
Thank you for your order!
Assertion dilakukan di class CompletePage.java atau pada CheckoutTest.java sesuai struktur yang digunakan.

✨ Hasil Pengujian

- Alur checkout berhasil dijalankan tanpa error
- Semua langkah (login → pilih produk → checkout → verifikasi) berjalan sesuai ekspektasi
- Pesan final berhasil muncul dan tervalidasi

