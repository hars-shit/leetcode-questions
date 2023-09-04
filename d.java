public class d {
    public static void main(String[] args) {
        int[] arr={3,5,2,8,9};
        System.out.println(reverse(arr,0));
    }
    static int reverse(int[] arr,int i){
        int n=arr.length;
        if(i >= n/2){
            return 0;
        }
        return swap(arr[i],arr[n-1-i]);
        

    }
    static int swap(int[] a1,int[] a2){
        int [] temp=a1;
        a1=a2;
        a1=temp;

    }
}
