public class RadixSort {
    static int getMax(int array[], int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    void sortingAux(int array[], int exp) {
        int n = array.length;
        int out[] = new int[n];
        int i;
        int aux[] = new int[10];

        for (i = 0; i < aux.length; i++) {
            aux[i] = 0;
        }

        for (i = 0; i < n; i++)
            aux[(array[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            aux[i] += aux[i - 1];

        for (i = n - 1; i >= 0; i--) {
            out[aux[(array[i] / exp) % 10] - 1] = array[i];
            aux[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            array[i] = out[i];
    }

    void sort(int array[]) {
        int n = array.length;
        int m = getMax(array, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            sortingAux(array, exp);
    }

    void print(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(int array[]) {
        RadixSort method = new RadixSort();

        System.out.println("RadixSort");
        System.out.print("Unsorted: ");
        method.print(array);
        method.sort(array);
        System.out.print("Sorted: ");
        method.print(array);
        System.out.println("");
    }
}