/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TugasPBO;

/**
 *
 * @author HP
 */
// Kelas Induk (superclass) yang juga menjadi kelas utama
public class BangunDatar {
    // Method untuk luas dan keliling
    double luas() {
        return 0;
    }

    double keliling() {
        return 0;
    }

    // Metode main berada di sini
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);
        Segitiga s = new Segitiga(3, 4);

        System.out.println("Luas Persegi: " + p.luas());
        System.out.println("Keliling Persegi: " + p.keliling());

        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("Keliling Lingkaran: " + l.keliling());

        System.out.println("Luas Segitiga: " + s.luas());
        System.out.println("Keliling Segitiga: " + s.keliling());
    }
}

// Kelas Persegi
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}


