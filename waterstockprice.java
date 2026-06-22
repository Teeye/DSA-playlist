public class waterstockprice {
    public static int watertrap(int a[]){
        int left[]=new int[a.length];
        left[0]=a[0];
        for(int i=1;i<a.length;i++){
            left[i]=Math.max(a[i],left[i-1]);
        }
        int right[]=new int[a.length];
        right[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            right[i]=Math.max(a[i],right[i+1]);
        }
        int trapped=0;
        for(int i=0;i<a.length;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trapped+=waterlevel-a[i];
        }
        return trapped;
    }
    public static int stocks(int a[]){
        int maxprofit=0;
        int buy=a[0];
        for(int i=0;i<a.length;i++){
            if(buy<a[i]){
                int profit=a[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buy=a[i];
            }
        }
        return maxprofit;
    }
    public static int majority(int a[]){
        int count;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>a.length/2){
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String []args){
        int a[]={3,2,3,2,2};
        System.out.println(majority(a));
        int height[]={4,2,0,6,3,2,5};
        int prices[]={7,1,5,3,6,4};
        //System.out.println(watertrap(height));
        //System.out.println(stocks(prices));
    }
}
