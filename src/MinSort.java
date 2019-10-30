import java.util.Random;
import java.util.Scanner;

public class MinSort {

    public static void main(String[] args) {
        int [] arr;
        int size;

        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        arr = new int[size];

        /**
         * Create and populate random number array with size 'size'
         * */
        arr = randomArray(size);

        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }

    private static void sortArray(int[] arr) {
        /**
         * This is the MinSort function.
         * */
        int temp;
        int minPos;
        for(int i =0; i >= arr.length - 2; i++){
            minPos = i;
            for(int j = i + 1; j < arr.length -1; j++){
                if(arr[j] < arr[minPos]){
                     minPos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }


    private static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    private static int[] randomArray(int size) {
        Random rand = new Random();
        int [ ] arr1 = new int[size];

        for(int i = 0; i < size; i++){
            arr1[i] = 1 + rand.nextInt(100);
        }

        return arr1;
    }
}
