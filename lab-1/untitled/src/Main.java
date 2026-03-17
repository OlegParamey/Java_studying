//import java.util.Scanner;
//Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your name:")
//        String Name = scan.nextLine();
//
//        System.out.print("Enter your name:")
//
//        2)

//import java.util.Scanner;
//void main() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter range from: ");
//        int a = scanner.nextInt();
//
//        System.out.print("To: ");
//        int b = scanner.nextInt();
//
//        //  a <= b
//        if (a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        int numberOfNumbers_dividedByThree = 0;
//
//        System.out.println("Even numbers in range - [" + a + ", " + b + "]:");
//
//        for (int i = a; i <= b; i++) {
//            // Show even numbers
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            // Show numbers divided by 3
//            if (i % 3 == 0) {
//                numberOfNumbers_dividedByThree++;
//            }
//        }
//
//        System.out.println("\n\nNumber of numbers divided by 3 in range [" + a + ", " + b + "]: " + numberOfNumbers_dividedByThree);
//
//        scanner.close();
//    }
//

//3)
//import java.util.Scanner;
//
//void main() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter text: ");
//        String text = scanner.nextLine();
//        System.out.println(text.substring(text.indexOf(" "), text.lastIndexOf(" ")));
//        scanner.close();
//    }

//


//4)
//import java.util.Scanner;
//void main() {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter first chain of chars: ");
//    String firstChain = scanner.nextLine();
//
//
//    System.out.print("Enter second chain of chars: ");
//    String secondChain = scanner.nextLine();
//
//    boolean comparisonResult1 = firstChain.equals(secondChain);
//    boolean comparisonResult2 = firstChain == secondChain;
//
//    System.out.println("Comparison of two chains of chars using method equal gives: " + comparisonResult1);
//
//    System.out.println("Comparison of two chains of chars using == gives: " + comparisonResult2);
//
//
//    scanner.close();
//}

//5)

import java.util.Random;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter list size: ");
    int size = scanner.nextInt();

    double[] array = new double[size];

    for (int i = 0; i < size; i++) {
        array[i] = random.nextDouble() * 100;
    }

    double sum = 0;
    for (int i = 0; i < size; i++) {
        sum += array[i];
    }
    double average = sum / size;

    System.out.printf("%nAverage: %.2f%n", average);

    scanner.close();


}