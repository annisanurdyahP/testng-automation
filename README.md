# TestNG + Selenium WebDriver + Maven

## 📌 Pendahuluan
Proyek ini menggunakan **TestNG** dengan **Selenium WebDriver** dan **Maven** untuk melakukan automation testing pada aplikasi berbasis web.

## 📋 Prasyarat
Sebelum memulai, pastikan Anda telah menginstal:
1. **Java Development Kit (JDK 8+)**
   - Cek versi Java:
     ```sh
     java -version
     ```
   - Jika belum terinstal, download di [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) atau gunakan OpenJDK.
2. **Apache Maven**
   - Cek versi Maven:
     ```sh
     mvn -version
     ```
   - Jika belum terinstal, download di [Maven](https://maven.apache.org/download.cgi).
3. **Google Chrome dan ChromeDriver**
   - Pastikan Anda memiliki Chrome versi terbaru.
   - ChromeDriver akan diunduh otomatis menggunakan **WebDriverManager**.

## 🚀 Instalasi dan Setup
### 1️⃣ Clone Repository
```sh
git clone https://github.com/username/repository-name.git
cd repository-name
```

### 2️⃣ Tambahkan Dependency TestNG ke `pom.xml`
Pastikan di dalam file `pom.xml` terdapat dependency berikut:
```xml
<dependencies>
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.8.0</version>
    </dependency>

    <!-- WebDriverManager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.5.0</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### 3️⃣ Jalankan Instalasi Maven
Di terminal, jalankan perintah berikut untuk mengunduh semua dependency:
```sh
mvn clean install
```

## 🎯 Menjalankan Test
### 1️⃣ Menjalankan Semua Test
```sh
mvn test
```

### 2️⃣ Menjalankan Test Tertentu
Jika hanya ingin menjalankan satu test class, gunakan perintah berikut:
```sh
mvn -Dtest=LoginTest test
```

### 3️⃣ Menjalankan Test dengan Laporan XML
```sh
mvn surefire-report:report
```

## 📄 Struktur Proyek
```
project-folder/
│── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── model/
│   │   │   │   ├── User.java
│   │   │   │   ├── UserData.java
│   ├── test/
│   │   ├── java/com/example/
│   │   │   ├── LoginTest.java
│── pom.xml
│── README.md
```

## 🔥 Troubleshooting
Jika mengalami error, coba periksa:
- Pastikan **Java dan Maven** sudah terinstal dengan benar.
- Pastikan dependency **TestNG dan Selenium** sudah ada di `pom.xml`.
- Coba bersihkan proyek dengan:
  ```sh
  mvn clean
  ```

## 📌 Referensi
- [TestNG Documentation](https://testng.org/doc/)
- [Selenium WebDriver](https://www.selenium.dev/documentation/)
- [WebDriverManager](https://bonigarcia.dev/webdrivermanager/)

---
🚀 **Selamat menguji otomatisasi dengan TestNG!** 🎯

