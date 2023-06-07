public class FindKthLargest {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 7, 1, 8, 5, 9, 10, 2, 4 };
        int k = 3; //3rd largest
        int ans = findKthLargest(arr, k);
        System.out.println(ans);
    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int ans = nums[0];
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            map[i] = nums[i];
        }
        //Ascending
        ArraySorting.sort(map);
        if (n > k-1) {
            ans = map[n - k];
        }
        return ans;
    }
}
