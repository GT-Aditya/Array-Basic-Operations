public class ArrayReverse{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = reverse(arr);
        printArray(arr2);
        }
        public static int[] reverse(int[] arr){
            int n = arr.length;
            int[] arr2 = new int[n];
            for(int i = 0; i < n; i++){
                arr2[i] = arr[n - 1 - i];
            }
            return arr2;
        }
        public static void printArray(int[] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

}