import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        System.out.print(number/3600 + " " + number/60);


        // closing the scanner object
        scanner.close();
    }
}