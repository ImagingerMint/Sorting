import java.util.Random;

public class Main {
    public static int[] arrayGenerator(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10000);
        }

        return array;
    }

    public static void sortingMethod(int[] array, int method) {
        switch (method) {
            case 1:
                InsertionSort.main(array);
                break;
            case 2:
                SelectionSort.main(array);
                break;
            case 3:
                BubbleSort.main(array);
                break;
            case 4:
                RadixSort.main(array);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        sortingMethod(arrayGenerator(10), 1);
        sortingMethod(arrayGenerator(10), 2);
        sortingMethod(arrayGenerator(10), 3);
        sortingMethod(arrayGenerator(10), 4);
    }
}