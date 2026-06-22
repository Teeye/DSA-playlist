public class array1 {

    public static int binarySearch(int arr[], int n){ //binary Search
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n){    //right
                low=mid+1;
            }
            else{                   //left
                high=mid-1;
            }
        }
        return -1;
    }
    public static int linearSearch(int a[], int n){ //linear Search
        for(int i=0;i<a.length;i++){
            if(a[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int largest(int a[]){ //largest value in array of all
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("smallest is: "+smallest);
        return largest;
    }
    public static void reverse(int arr[]){  //reverse an array
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[]){     //reverse an array by swapping
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i]; //2, 4, 6, 8, 10

            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ current+", "+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String []args){ //main function
        int marks[]= {97, 98, 99};
        update(marks);
        print(marks);
       // int arr[]={10,50,47, 23, 67,100,45};
        //int a[]={1,5,6,10,11,18,20,21};
       // int array[]={2,4,6,8,10};
        //int n=1;
       // pairs(array);


       /* for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);*/

       /* int index=binarySearch(a, n);
        if(index==-1){
            System.out.println("not found");
        }else {
            System.out.println("value is in: " + index);
        }*/

        //System.out.println("the largest is: "+ largest(arr));

        /*int index=linearSearch(arr, n);
        if(index==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("value found at index: "+ index);
        }*/
    }
}
