import  java.util.Scanner;



public class Vucutkitleendeksi {
    public static void main(String[] args) {
        double kilo, boy, vke;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu(kg cinsinden) Giriniz: ");
        kilo = inp.nextDouble();
        System.out.print("Lutfen boyunuzu:(m cinsinden) Giriniz: ");
        boy = inp.nextDouble();
        vke = kilo/(boy*boy);
        System.out.println("Vucut Kitlen Endeksiniz: "+vke);


    }
}
