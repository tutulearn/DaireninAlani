import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14,r,aci,daireninAlani;

        System.out.println("Dairenin yarıçapını giriniz: ");
        r=input.nextDouble();

        System.out.println("Açıyı Giriniz: ");
        aci=input.nextDouble();

        daireninAlani=(pi*(r*r)*aci)/360;
        System.out.println("Dairenin Alanı: "+daireninAlani);
    }
}
