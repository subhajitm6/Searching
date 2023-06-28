public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={8,5,1,3,4};
        int n=arr.length;
        int ele=6;
        linearsearch(arr, n, ele);
    }
    static void linearsearch(int arr[], int n, int ele){
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                System.out.println(ele+" is present in the array");
                return;
            }
        }
        System.out.println(ele+" is not present in the array");
    }
}