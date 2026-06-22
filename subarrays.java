public class subarrays{
    public static void subarray(int a[]){
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void addSubarray(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                   sum+=a[k];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void maxSubarray(int a[]){
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.print("max sum: " + max);
    }
    public static void main(String [] args){
        int a[]={2,4,6,8,10};
        maxSubarray(a);
    }
}
