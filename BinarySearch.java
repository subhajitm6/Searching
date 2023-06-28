public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9};
        int n=arr.length;
        int ele=90;
        if(binarysearch(arr, n, ele)){
            System.out.println(ele+" is present in the array");
        }else{
            System.out.println(ele+" is not present in the array");
        }
    }

    static boolean binarysearch(int arr[], int n, int ele){
        int l=0, h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==ele){
                return true;
            }else if(arr[mid]<ele){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}
