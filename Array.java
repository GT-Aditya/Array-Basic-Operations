

public class Array {
    public static void main(String[] args) {
        int nums[] = new int[10];
        //nums[index]=value;
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        //Insertion
        //1.At the beginning
        int ele = 6;
        for (int i = nums.length-1; i > 0; i--) {
            nums[i] = nums[i-1];
        }
        nums[0]=ele;
        //2. At the given position/index
        int pos = 3;
        int ele2 = 7;
        for (int i = nums.length-1; i > pos; i--) {
            nums[i] = nums[i-1];
        }
        nums[pos]=ele2;
        //3. At the end
        int ele3 = 8;
        nums[nums.length-1] = ele3;
        //Searching

        int searchEle = 4;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==searchEle){
                System.out.println("Index:"+i);
                break;
            }
        }
        //Traversing
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums["+i+"] = ["+nums[i]+"]");
        }
        //Deletion
        //1.  From the beginning
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            nums[i]=nums[i+1];
        }
        n=n-1;
        for (int i = 0; i < n; i++) {
            System.out.println("nums["+i+"] = ["+nums[i]+"]");
        }

        //2. From the given position/index
        System.out.println("+++++++++++++++++++++++");
        int position=5;
        for (int i = position; i < n-1; i++) {
            nums[i]=nums[i+1];
        }
        n=n-1;
        for (int i = 0; i < n; i++) {
            System.out.println("nums["+i+"] = ["+nums[i]+"]");
        }

        //3. From the end
        System.out.println("+++++++++++++++++++++++");
        n=n-1;
            for (int i = 0; i < n; i++) {
                System.out.println("nums["+i+"] = ["+nums[i]+"]");
            }

    }
}