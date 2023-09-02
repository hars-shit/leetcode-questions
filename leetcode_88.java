import java.util.Arrays;

public class leetcode_88 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        merge(arr1, 3, arr2, 3);

    }

    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int k = m;
        for (int i = 0; i < arr1.length; i++) {
            if (i == m - 1) {
                for (int j = 0; j < arr2.length; j++) {

                    
                    arr1[k] = arr2[j];
                    if(arr1[i]>arr1[k]){
                        int temp=arr1[i];
                        arr1[i]=arr1[k];
                        arr1[k]=temp;
                    }
                    k++;

                }
                System.out.println(Arrays.toString(arr1));
            }
        }
    }
}