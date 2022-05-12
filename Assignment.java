import java.util.Scanner;
import java.lang.Integer;


/*
Write a program that allows a student to enter up to 10 test quiz scores, computes the average score, and then displays the letter grade. Students will develop the Java program in six steps and each step will build off the code from the previous steps, which are listed in the prompt below.
Prompt
    - Create a Java project in IDE and begin the Project Program by developing a Java Method to print the programming specifications for the project.
    - Expand the Project Program and create Java code to input from the console (keyboard) the first quiz grade. Use a loop to allow the user to continue to enter grades as long as they don't enter 999 to quit.
    - Expand the Project Program and create Java code to populate the array of the student's quiz grades. The grade is added to a running total, and the count of grades entered is incremented. If the grade entered is the 10th grade, the grade is forced to 999 and the loop ends; otherwise, the user enters another quiz grade. When the loop ends count holds the number of grades entered.
    - Expand the Project Program and create Java code use another loop to print all grades in the array.
    - Expand the Project Program and create Java code to compute the average quiz grade.
    - Expand the Project Program and create Java code to use decision logic to find out the letter grade of the average based on the following grading scale and print to the console.
A = 90-100
B = 80-89
C = 70-79
D = 60-69
F = 0-59
*/
public class Assignment
{
   
     
   
     // This is to calculate the average and total
    public static double scoreCalculator(String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8,
            String q9, String q10)
    {
        int quiz_1 = Integer.parseInt(q1);
        int quiz_2 = Integer.parseInt(q2);
        int quiz_3 = Integer.parseInt(q3);
        int quiz_4 = Integer.parseInt(q4);
        int quiz_5 = Integer.parseInt(q5);
        int quiz_6 = Integer.parseInt(q6);
        int quiz_7 = Integer.parseInt(q7);
        int quiz_8 = Integer.parseInt(q8);
        int quiz_9 = Integer.parseInt(q9);
        int quiz_10 = Integer.parseInt(q10);
        int values[] = { quiz_1, quiz_2, quiz_3, quiz_4, quiz_5, quiz_6, quiz_7, quiz_8, quiz_9, quiz_10 };
        int sum = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i];
        double average = ((double) sum) / values.length;
        System.out.println("Your score is " + average);
        System.out.println("your total score is " + sum);

        return average;
    }
    
    // This is to calculate the grade to receive
    public static String grading(int avg)
    {
        
        int averg = avg/10;
        System.out.println("Average is here "+averg);
        switch (averg) {
            case 9:
                return "A";            
            case 8:
                return  "B";              
            case 7:
                return "C";            
            case 6:
                return "D";             
            default:
                return "F";
              
        }
    }

    public static void main(String[] args) {
        
        int[] scores = inputScores();
        printScores(scores);
        int[] gradeTotal = scoreCalc(scores);
        String gradeScore = grading(gradeTotal[1]);
        System.out.println("Your total grade is " + gradeScore);
        System.out.println("Total scores received is "+ gradeTotal[0]+"\nwhile your average score is "+gradeTotal[1]);
        
    }
    
     // Program to have them loop and enter test scores
    public static int[] inputScores()
    {
        int[] myArray = new int[10];
        Scanner myInput = new Scanner(System.in);
        System.out.println("Welcome to calculating your test scores");
        System.out.println("We will ask you to enter your 10 quiz scores and display your letter grade and average");
        System.out.println("Please enter between 1-99 only");
        System.out.println("Any number beyond that will result in the program terminating");
        System.out.println("Do not enter any text /n" +
                "or the program will be terminated");
       for (int i = 0; i < 10; i++)
       {
           System.out.println("Enter your " + (i + 1) + " quiz" + " test score");
           int data = Integer.parseInt(myInput.nextLine());
           if (data >= 999) {
               System.out.println("Sorry you enter greater than 999 or more");
               System.out.println("will be quitting the program");
               System.exit(0);
           }
           myArray[i] = data;

           
       }
       return myArray;
    }

    public static void printScores(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Your "+ i+" quiz score is "+ array[i]);
        }
    }

    // Calculating score total and average score
    public static int[] scoreCalc(int[] array) {
        int[] total= new int[2];
        total[0] = 0;
        for (int i = 0; i < array.length; i++) {
            total[0] = total[0] + array[i];
            
        }
    
        total[1] = total[0] / array.length;
        return total;
    }
    
    
    
}
