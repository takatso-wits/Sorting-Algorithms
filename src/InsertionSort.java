import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

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
        insertionSort(arr,size);
        printArray(arr);
    }

    private static void insertionSort(int[] arr, int size) {
        /**
         * This methog performs the Insertion Sorting Algorithm
         * */
        int x,j;
        for(int i = 1; i <= size -1; i++){
            x = arr[i];
            j = i - 1;
            while ((j >= 0 ) && (arr[j]>x)){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = x;
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
