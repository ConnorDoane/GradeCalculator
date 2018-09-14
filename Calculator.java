import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
    int count = 0;
    double highest = 0;
    double lowest = 100;
    double total = 0;
    double average = 0;
    boolean prompt = true;
    String stringInput;
    double doubleInput = 0;
    char letterGrade;

    System.out.println("Welcome to the Automatic Average Grading System.");
    System.out.println(" Please input any number of test scores, one at a time, and when you're done simply hit enter on an empty line.");

    stringInput = scan.nextLine();

    while (!(stringInput.isEmpty())) {
      //convert to double
      doubleInput = Double.parseDouble(stringInput);

      //increase counter and add value
      count = count + 1;
      total = total + doubleInput;

      //test for highest/lowest value
      if (doubleInput > highest) {
        highest = doubleInput;
      }
      if (doubleInput < lowest) {
        lowest = doubleInput;
      }

      //take next input
      stringInput = scan.nextLine();
    }

    //AFTER INPUTS

    //subtract highest/lowest
    total = total - highest;
    total = total - lowest;
    count = count - 2;

    average = total / count;

    if (average >= 90) {
      letterGrade = 'A';
    } else if (average >= 80) {
      letterGrade = 'B';
    } else if (average >= 70) {
      letterGrade = 'C';
    } else if (average >= 60) {
      letterGrade = 'D';
    } else {
      letterGrade = 'F';
    }

    System.out.println("The average grade, minus the highest and lowest grade, is " + average + ". This means the letter grade is " + letterGrade);


  }
}
