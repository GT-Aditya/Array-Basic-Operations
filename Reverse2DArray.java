public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = reverseEachRow(arr);
        printArray(arr2);
    }
    public static int[][] reverseEachRow(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            arr2[i] = ArrayReverse.reverse(arr[i]);
        }
        return arr2;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
