import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Enter year: ");
        year = inp.nextInt();

        if (!(year%400 == 0)){
            if (!(year%100 == 0)){
                if(year%4 == 0){
                    System.out.println(year+" bir artık yıldır !");
                }
                else
                    System.out.println(year+" bir artık yıldır değildir !");
            }
            else
                System.out.println(year+" bir artık yıldır değildir !");
        }
        else
            System.out.println(year+" bir artık yıldır !");

    }
}