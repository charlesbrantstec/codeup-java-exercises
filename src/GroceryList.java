import java.util.Scanner;

public class GroceryList {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to create a grocery list?: [y/N]");
        String wishToContinue = scanner.next();
        if (wishToContinue == "y"){
            System.out.print("Enter a new item: /n" +
                    "");
        }

    }
}
