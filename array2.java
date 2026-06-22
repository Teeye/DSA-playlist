public class array2 {
    public static void print(int arr[]){
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int counteven(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void sumsubarray(int a[]){
        int sum=0;
        int max=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+a[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }

        }
        System.out.println("max sum subarray is: "+max);
    }
    public static void prefixarray(int a[]){
        int max=a[0];
        int sum=0;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("max sum subarray is: "+max);
    }
    public static void kadane(int a[]){
        int sum=0;
        int max=a[0];
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        System.out.println("max sum subarray is: "+max);
    }

    public static void main(String[]args){
        int array[]={1,2,3,4,9,16};
        int arr[]={1, -2, 6, -1,3};
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(a);

       // System.out.println(sum(array));

       // System.out.println(max(array));
        //System.out.println(min(array));
       // System.out.println(counteven(array));
    }
}
