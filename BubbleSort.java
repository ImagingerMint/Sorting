public class BubbleSort {
    void sort(int array[]) {
        int i, j, temp, n = array.length;
        boolean swap;
        
        for (i = 0; i < n - 1; i++) {
            swap = false;
            
            for (j = 0; j < n - i - 1; j++) {
                
                if (array[j] > array[j + 1]) {
                    
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    void print(int array[]) {

        int n = array.length;
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(int array[]) {
        BubbleSort method = new BubbleSort();

        System.out.println("BubbleSort");
        System.out.print("Unsorted: ");
        method.print(array);
        method.sort(array);
        System.out.print("Sorted: ");
        method.print(array);
        System.out.println("");
    }
}