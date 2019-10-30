import java.util.Random;
import java.util.Scanner;

public class BubbleSort {


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
        bubbleSortAgain(arr,size);
        printArray(arr);
    }

    private static void bubbleSortAgain(int[] arr, int size) {

        int i = size - 1, temp;
        boolean sorted = true, swopped;
        while(i > 1 && sorted == true){
            swopped = false;
            for(int j = 0; j <= i-1;j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swopped = true;
                }

            }
            if(swopped == false){
                sorted = false;
            }else{
                i = i-1;
            }
        }

    }

    private static void bubbleSort(int[] arr) {

        int i = arr.length - 1;
        int temp;
        while(i > 1){
            for(int j =0; j <=i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            i--;

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
