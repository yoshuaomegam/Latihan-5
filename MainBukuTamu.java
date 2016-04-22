package bukutamu;
import java.util.Scanner;
public class MainBukuTamu {
    public static void main(String[] args) { 
        System.out.println("Program buku tamu PKKMABA FILKOM");
        Scanner input=new Scanner(System.in);
        System.out.println("Jumlah Kuota Maksimal :");
        int kuota=input.nextInt();
        BukuTamu buku[] = new BukuTamu[kuota];
        for (int i = 0; i <kuota; i++) {
            System.out.println("Nama :");
            String nama=input.nextLine();input.nextLine();
            System.out.println("Alamat :");
            String alamat=input.nextLine();
            System.out.println("No Hp :");
            String nohp=input.nextLine();
            System.out.println("Jurusan :");
            String jurusan=input.nextLine();
            BukuTamu buku1 = new BukuTamu(nama,alamat,nohp,jurusan);
            buku1.displayMessage();   
        }
    }
    }
