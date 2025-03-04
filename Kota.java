/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO;

/**
 *
 * @author HP
 */
// Kelas Induk (Superclass)
public class Kota {
    // Method yang akan dioverride
    String deskripsi() {
        return "Pulau di Indonesia";
    }

    // Metode main untuk menampilkan informasi pulau
    public static void main(String[] args) {
        Kota[] kotaIndonesia = {
            new Denpasar(),
            new Medan(),
            new Jember()
        };

        for (Kota p : kotaIndonesia) {
            System.out.println(p.deskripsi());
            System.out.println("----------------------");
        }
    }
}

// Kelas Bali (Subclass)
class Denpasar extends Kota {
    @Override
    String deskripsi() {
        return "Denpasar: Bearada Di Pulau Dewata yang memiliki pantai yang indah dan budayanya yang kaya.";
    }
}

// Kelas Medan (Subclass)
class Medan extends Kota {
    @Override
    String deskripsi() {
        return "Madan: Berada di pulau terbesar keenam di dunia, terkenal juga dengan Danau Toba dan kopi.";
    }
}

// Kelas Jember (Subclass)
class Jember extends Kota {
    @Override
    String deskripsi() {
        return "Jember: Kota yang di penuhi banyaknya hutan hujan tropis.";
    }
}

