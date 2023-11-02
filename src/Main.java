import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("=======================================");
            System.out.println("     Program Menghitung Luas Keliling  ");
            System.out.println("=======================================");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Lingkaran");
            System.out.println("0. Keluar");
            System.out.println("=======================================");
            System.out.print("Masukkan Pilihan : ");
            pilihan = input.nextInt();

            if(pilihan == 1){
                Persegi persegi = new Persegi(0,0);
                System.out.print("Masukkan Lebar : ");
                persegi.setL(input.nextDouble());
                System.out.print("Masukkan Panjang : ");
                persegi.setP(input.nextDouble());
                System.out.print("Luas : " + persegi.Luas());
                System.out.println();
                System.out.println("Keliling : " + persegi.Keliling());
            }
            if(pilihan == 2) {
                Lingkaran lingkaran = new Lingkaran(0, 0);
                System.out.print("Masukkan Jari Jari : ");
                lingkaran.setL(input.nextDouble());
                System.out.print("Luas : " + lingkaran.Luas());
                System.out.println();
                System.out.println("Keliling : " + lingkaran.Keliling());
            }
        }while (pilihan != 0);
        System.out.println("=========== selesai ===========");


    }
}