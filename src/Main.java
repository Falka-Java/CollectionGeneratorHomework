import java.util.Arrays;
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
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rn.nextInt(minNum, maxNum);
        }

        //Sorting using default algorithm
        //Arrays.sort(numbers);

        //Sorting using Bubble sorting
         BubbleSort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    private static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean isSwapped = false;
            for (int x = 0; x < arr.length-1; x++){
                if(arr[x] > arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1]=temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
        }
    }

}