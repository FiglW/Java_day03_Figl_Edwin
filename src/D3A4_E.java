import java.util.Scanner;

public class D3A4_E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fullName;

        System.out.println("Enter your full name: ");
        fullName = sc.nextLine();

        fullName.trim();        // delete leading spaces

        System.out.print(fullName.charAt(0));


    }
}
