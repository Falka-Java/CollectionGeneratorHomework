import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rn = new Random();
    public static void main(String[] args) {
        System.out.print("Enter collection size: ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.print("Enter start range: ");
        int minNum = Integer.parseInt(sc.nextLine());

        System.out.print("Enter end range: ");
        int maxNum = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rn.nextInt(minNum,maxNum);
        }
        for (int i: numbers) {
            System.out.print(i + " ");
        }
    }
}