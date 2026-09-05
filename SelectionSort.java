public class SelectionSort {
    void sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    void print(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(int array[]) {
        SelectionSort method = new SelectionSort();

        System.out.println("SelectionSort");
        System.out.print("Unsorted: ");
        method.print(array);
        method.sort(array);
        System.out.print("Sorted: ");
        method.print(array);
        System.out.println("");
    }
}