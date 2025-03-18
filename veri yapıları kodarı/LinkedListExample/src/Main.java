import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList liste=new LinkedList();
        System.out.println("Bağlı listenin elemanlarını giriniz...");
        liste.ListeDoldur(10);
        liste.PrintList();

        int findex= input.nextInt();
        int lindex= input.nextInt();

       liste.turnList(findex-1,lindex-1);

       liste.PrintList();



    }
}