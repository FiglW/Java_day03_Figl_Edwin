import java.util.Scanner;

public class D3A7_E {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        Float num1, num2, num3;

        num1 = Float.parseFloat(sc.nextLine());
        num2 = Float.parseFloat(sc.nextLine());
        num3 = Float.parseFloat(sc.nextLine());

        System.out.println("Average = " + average(num1, num2, num3));

    }

    public static float average(float n1, float n2, float n3){

        return (n1 + n2 + n3) / 3.0f;

    }

}
