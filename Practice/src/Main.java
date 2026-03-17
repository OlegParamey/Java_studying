import java.util.Scanner;
Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:")
        String Name = scan.nextLine();

        System.out.print("Enter your name:")

        2)
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range from: ");
        int a = scanner.nextInt();

        System.out.print("To: ");
        int b = scanner.nextInt();

        //  a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int numberOfNumbersdividedByThree = 0;

        System.out.println("\nEven numbers in range - [" + a + ", " + b + "]:");

        for (int i = a; i <= b; i++) {
            // Show even numbers
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // Show numbers divided by 3
            if (i % 3 == 0) {
                numberOfNumbersdividedByThree++;
            }
        }

        System.out.println("\n\nNumber of numbers divided by 3 in range [" + a + ", " + b + "]: " + numberOfNumbersdividedByThree);

        scanner.close();
    }
}

3)
        import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println(text.substring(text.indexOf(" "), text.lastIndexOf(" ")));

        scanner.close();
    }
}

4)
        import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first chain of chars: ");
        String firstChain = scanner.nextLine();


        System.out.print("Enter second chain of chars: ");
        String secondChain = scanner.nextLine();

        boolean comparrisionResult1 = firstChain.equals(secondChain);
        boolean comparrisionResult2 = firstChain==secondChain;

        System.out.println("Comparrision of two chains of chars using method equal gives: " + comparrisionResult1);

        System.out.println("Comparrision of two chains of chars using == gives: " + comparrisionResult2);


        scanner.close();
    }
}