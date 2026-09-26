import java.util.Scanner;

public class IT26101907Lab9Q4 {

    
    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = (assignment * 0.30) + (exam * 0.70);
        return finalMark;
    }

    
    public static char findGrades(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        }
        else if (finalMark >= 60) {
            return 'B';
        }
        else if (finalMark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double assignment;
        double exam;
        double finalMark;
        char grade;

        
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Name of Student " + i + ": ");
            name = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + name + ": ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + name + ": ");
            exam = input.nextDouble();

            input.nextLine();

            finalMark = calcFinalMark(assignment, exam);

            grade = findGrades(finalMark);

            
            System.out.println();
        }

        System.out.println("Name           Final Mark      Grade");

        
        printDetails("AAA", calcFinalMark(74, 75),
                findGrades(calcFinalMark(74, 75)));

        printDetails("BBB", calcFinalMark(59, 60),
                findGrades(calcFinalMark(59, 60)));

        printDetails("CCC", calcFinalMark(49, 50),
                findGrades(calcFinalMark(49, 50)));

        printDetails("DDD", calcFinalMark(35, 85),
                findGrades(calcFinalMark(35, 85)));

        printDetails("EEE", calcFinalMark(25, 30),
                findGrades(calcFinalMark(25, 30)));

        input.close();
    }
}