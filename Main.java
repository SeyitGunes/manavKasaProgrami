import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates =1.11, muz = 0.95, patlican = 5.0, toplamtutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç kilo? ");
        armut *= input.nextDouble();
        System.out.println("Elma Kaç kilo? ");
        elma *= input.nextDouble();
        System.out.println("Domates Kaç kilo? ");
        domates *= input.nextDouble();
        System.out.println("Muz Kaç kilo? ");
        muz *= input.nextDouble();
        System.out.println("Patlıcan Kaç kilo? ");
        patlican *= input.nextDouble();

        toplamtutar = armut + elma + domates + muz + patlican;
        System.out.println("Ödemeniz gereken tutar: " +toplamtutar);


        }
    }