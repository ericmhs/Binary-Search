

public class binarySearch{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 9;

        int result = binarySearch(nums, 0, nums.length - 1, key);

        if (result != -1) {
            System.out.println("Index:" + result);
        } else {
            System.out.println("Not found");
        }
    }
    
    
    public static int binarySearch(int[] nums, int start, int end, int key) {
        if(start <= end){
            int middle = start + (end - start)/2;

            if(nums[middle] == key) 
            return middle;
            if(key < nums[middle]) 
            return binarySearch(nums, start, middle -1, key);
            
            return binarySearch(nums, middle + 1, end, key);
        }
        return -1;
    }       
}
