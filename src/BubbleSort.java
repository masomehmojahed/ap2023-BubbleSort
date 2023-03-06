import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
          int arr[];
            int inputNumber;
              int i;

        System.out. println("Number of input numbers:");
          inputNumber = intput.nextInt();
        arr = new int[inputNumber];

           for (i = 0; i < inputNumber; i++) {
              System.out. println("Enter number :" + (i + 1));
                  arr[i] = intput.nextInt();
                 }

        for (i = 0; i < inputNumber; i++) {//algoritm Bubble Sort
            for (int j = 0; j < inputNumber - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < inputNumber; i++) {
            System.out. print (arr[i] + "\t");
        }
    }
}