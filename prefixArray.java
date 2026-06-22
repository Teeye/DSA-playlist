public class prefixArray {
    public static void preArray(int a[]){   //Prefix Sum
        int sum=0;
        int max=Integer.MIN_VALUE;

        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=i==0? prefix[j] : prefix[j]-prefix[i-1];

                if(max<sum){
                    max=sum;
                }
            }
        }

        System.out.println("\nmax sum is: " +max);
    }

    public static void kadanes(int a[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<a.length;i++){
            cs=cs+a[i];
            System.out.println(cs);
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.print("max subarray is: "+ ms);
    }
    public static void main(String []args){
        int a[]={2,4,6,8,10};
        int arr[]={1, -2, 6,-1,3};
        kadanes(arr);
       // preArray(a);
    }
}
