class BinarySearch{
    public static int BinarySearch(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                left=mid+1;
            }else if(arr[mid]<target){
                right=mid-1;

            }
        }
        return-1;
    }
    public static void main(String[]args){
        int[] SortedArray={12,22,23,24,25,26};
        int target=23;
        int result=BinarySearch(SortedArray,target);
        if(result==-1){
            System.out.println("Element Not Found:");

        }else{
            System.out.println("Element Found at index"+result);
        }
    }
}