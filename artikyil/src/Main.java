import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Yıl giriniz : ");
        Scanner scanner=new Scanner(System.in);
        int yil=scanner.nextInt();
        int bol=yil%100;
        if(bol%4==0 && yil%4==0)
            System.out.println(yil+" bir artik yildir");
        else
            System.out.println(yil+" bir artik bir yil değildir.");
    }
}
