import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sr = new Scanner(System.in);
        int min=0,max;
        System.out.println("Enter number");
        max = sr.nextInt();
        System.out.println(rand.nextInt(max - min + 1) + min);
    }
}