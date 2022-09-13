import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input A = ");
        int A = sc.nextInt();
        System.out.print("Input B = ");
        int B = sc.nextInt();

        int jumlah = A + B;
        int kurang = A - B;
        int kali = A * B;
        int bagi = A / B;

        System.out.println("Hasil penjumlahan variable a dan b = " + jumlah);
        System.out.println("Hasil pengurangan variable a dan b = " + kurang);
        System.out.println("Hasil perkalian variable a dan b = " + kali);
        System.out.println("Hasil pembagian variable a dan b = " + bagi);
    }
}
