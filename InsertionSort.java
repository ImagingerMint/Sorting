public class InsertionSort {
    void sort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }

    void print(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(int array[]) {
        InsertionSort method = new InsertionSort();

        System.out.println("InsertionSort");
        System.out.print("Unsorted: ");
        method.print(array);
        method.sort(array);
        System.out.print("Sorted: ");
        method.print(array);
        System.out.println("");
    }
}