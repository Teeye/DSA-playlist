import java.util.Arrays;

public class mergesort {

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int mergeSort(int a[],int si,int ei){
        if(si>=ei){
            return 0;
        }
        int mid=si+(ei-si)/2;
        int cmp=0;
        cmp+=mergeSort(a,si,mid);
        cmp+=mergeSort(a,mid+1,ei);
        cmp+=merge(a,si,mid,ei);
        return cmp;
    }
    public static int merge(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int cmp=0;
        while(i<=mid && j<=ei){
            cmp++;
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
        for(k=0,i=si;k< temp.length;k++,i++){
            a[i]=temp[k];
        }
        return cmp;
    }
    public static int mergeSort2(int a[],int si, int ei){
        if(si>=ei){
            return 0;
        }
        int inv=0;
        int mid=si+(ei-si)/2;
        inv+=mergeSort2(a,si,mid);
        inv+=mergeSort2(a,mid+1,ei);
        inv+=merge2(a,si,mid,ei);
        return inv;
    }
    public static int merge2(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int inv=0;
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
                inv=(mid-i+1);
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            a[i]=temp[k];
        }
        return inv;
    }


    public static int[] merge3(int a[],int b[]){
        int res[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k++]=a[i++];
            }
            else{
                res[k++]=b[j++];
            }
        }
        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length){
            res[k++]=b[j++];
        }
        return res;
    }
    public static void main(String []args){
        int arr[]={2,4,1,3,5};
        int a[]={1,3,5};
        int b[]={2,4,6};
        int res[]=merge3(a,b);

        System.out.println(Arrays.toString(res));

       // int inv=mergeSort2(arr,0,arr.length-1);
       // System.out.println(inv);
        //print(arr);
    }
}
