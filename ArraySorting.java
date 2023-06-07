public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 1, 8, 5, 9, 10, 2, 4};
        System.out.println("Before Sorting:");
        printArray(arr);
        sort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }

    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
