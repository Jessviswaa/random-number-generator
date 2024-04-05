import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
                long currentTime = System.currentTimeMillis();
                int min =1, max ;
                System.out.println("Enter the range");
                max = sr.nextInt();
                int random = (int) (currentTime % (max - min + 1)) + min;

                System.out.println("Random number: " + random);
            }
        }