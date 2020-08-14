
import java.util.Scanner;

public abstract class MethodExercises {

    public static void main(String[] args){
//        System.out.println(add(2,5));
//        System.out.println(subtract(4,2));
//        System.out.println(multiply(3,4));
//        System.out.println(divide(36, 3));
//        System.out.println(mod(5,3));
//        System.out.println("Enter a number between 1 and 10: ");
//        System.out.println("You entered the correct number: " + getInteger(1,10));
//        System.out.println("Enter a number between 1 and 99999999: ");
//        System.out.println("You factorialresult is " + (getInteger(1,10)));



    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("You tried to divide by zero");
        } return a / b;
    }
    public static int mod(int a, int b){
        return a % b;
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        boolean doAgain = true;
        int num = 0;
        do {
            num = sc.nextInt();
            if (num < min || num > max){
                System.out.printf("\n This value is out of the range\n", num);
                System.out.printf("Enter an integer between %d and %d: ", min, max);
            } else {
                doAgain = false;
            }
        } while(doAgain);
        return num;
    }

    public static long factorial(int num) throws ArithmeticException{
        int factorial = 1;
        int previousFactorial = 1;
        for (int i = 1; i <= num; ++i){
            factorial *= i;
            if (previousFactorial > factorial){
                throw new ArithmeticException("The factorial of " + num + " is too large");
            }
        } return factorial;
    }

    private static Scanner scanner;
    public static void setScanner(Scanner s){
        scanner = s;
    }
    public static void diceGame(){
        System.out.print("How many sides will be on each dice? (1 to 20: ");
        int numSides = getInteger(1,20);

        while(true) {
            System.out.print("Hit enter the roll the dice, type 'exit' to exit.");
            String response = scanner.nextLine();

            if (response.length() != 0) {
                break;
            }
            int diceSum = 0;
            System.out.print("Dice: ");
            int diceValue1 = (int)(Math.random() * numSides) +1;
            int diceValue2 = (int)(Math.random() * numSides) +1;
            System.out.println("Dice 1: " + diceValue1);
            System.out.println("Dice 2: " + diceValue2);


        }
    }


//    public static void main(String[] args)
//    {
//        int num1, num2, sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("First number : ");
//        num1 = sc.nextInt();
//        System.out.println("Second number : ");
//        num2 = sc.nextInt();
//        sum = addTwo(num1, num2);
//        System.out.println("Sum : " + sum);
//        sc.close();
//    }
//    public static int addTwo(int a, int b)
//    {
//        int sum = a + b;
//        return sum;
//    }

//public static void main(String[] args)
//{
//    int num1, num2, difference;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("First number : ");
//    num1 = sc.nextInt();
//    System.out.println("Second number : ");
//    num2 = sc.nextInt();
//    difference = subTwo(num1, num2);
//    System.out.println("Difference : " + difference);
//    sc.close();
//}
//    public static int subTwo(int a, int b)
//    {
//        int difference = a - b;
//        return difference;
//    }

//public static void main(String[] args)
//{
//    int num1, num2, product;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("First number : ");
//    num1 = sc.nextInt();
//    System.out.println("Second number : ");
//    num2 = sc.nextInt();
//    product = multiplyTwo(num1, num2);
//    System.out.println("Sum : " + product);
//    sc.close();
//}
//    public static int multiplyTwo(int a, int b)
//    {
//        int product = a * b;
//        return product;
//    }
//public static void main(String[] args)
//{
//    int num1, num2, mod;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("First number : ");
//    num1 = sc.nextInt();
//    System.out.println("Second number : ");
//    num2 = sc.nextInt();
//    mod = modTwo(num1, num2);
//    System.out.println("Sum : " + mod);
//    sc.close();
//}
//    public static int modTwo(int a, int b)
//    {
//        int mod = a % b;
//        return mod;
//    }
//public static void main(String[] args)
//{
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter a number between 1 and 10: ");
//    String num = sc.nextLine();
//    int num0 = Integer.parseInt(num);
//    if (num0 >= 1 && num0 <= 10 ) {
//        System.out.println("Your number is within the range");
//    }
//}
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter and integer from 1 to 10: ");
//    int num = sc.nextInt();
//    System.out.print("Do you wish to continue? [y/N] ");
//    String ans = sc.nextLine();
//    if (ans == "y"){
//        if(num <= 10 && num >= 10){
//            for(int i = num; i <= num; i++)
//        }
//    }
//
//}

}
