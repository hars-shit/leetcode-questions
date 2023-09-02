

public class leetcode_162{
    public static void main(String[] args) {
     int[] nums=   {1,2,1,3,5,6,4};
     System.out.println(peak(nums));

    }
    static int peak(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            // This is done because start and end might be big numbers, so it might exceed the
            // integer limit.
            int mid = start + ((end - start) / 2);
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
        

    }
