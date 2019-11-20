import java.util.Scanner;

public class D3A8_E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] grades = {"F","F","F","F","F"};
        String subject[] = {"Physics ", "Chemistry", "Biology ", "Mathematics", "Computer"};

        System.out.println("Enter your points (0-100) for the following subjects:");

        for(int i=0; i<subject.length; i++){

            System.out.print(subject[i]+": ");

            grades[i] = calcGradePercentage(Integer.parseInt(sc.nextLine()));

        }

        System.out.println("-------------\nYour grades:");

        for(int i=0; i<subject.length; i++) {
            System.out.println(subject[i] + "\t ...   " + grades[i]);
        }
    }

    public static String calcGradePercentage(int points){

        float percentage = (float) points / 100 * 100;
        String grade = "F";

        if (percentage >=90) grade = "A";
        if (percentage >=80 && percentage <=89) grade = "B";
        if (percentage >=70 && percentage <=79) grade = "C";
        if (percentage >=60 && percentage <=69) grade = "D";
        if (percentage >=40 && percentage <=59) grade = "E";

        return grade;
    }
}