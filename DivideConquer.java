public class DivideConquer {
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void mergeSort(int a[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(a,si,mid);
        mergeSort(a,mid+1,ei);
        merge(a,si,mid,ei);
    }
    public static void merge(int a[],int si,int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(a[i]< a[j]){
                temp[k]=a[i];
                i++;k++;
            }
            else{
                temp[k]=a[j];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
        for(k=0, i=si;k<temp.length;k++, i++){ //swapping
            a[i]=temp[k];
        }
    }
    public static void quickSort(int a[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=partition(a,si,ei);
        quickSort(a,si,mid-1);
        quickSort(a,mid+1,ei);
    }
    public static int partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;
    }
    public static int search(int a[],int tar,int si,int ei){
        if(si>ei){
            return -1; //index don't exist
        }
        int mid=(si+ei)/2;
        if(a[mid]==tar){
            return mid;
        }
        if(a[si]<a[mid]){
            if(a[si]<=tar && tar<=a[mid]){
                return search(a,tar,si,mid-1);
            }
            else{
                return search(a,tar,mid+1,ei);
            }
        }
        else{
            if(a[mid]<=tar && tar<=a[ei]){
                return search(a,tar,mid+1,ei);
            }
            else{
                return search(a,tar,si,mid-1);
            }
        }
    }
    public static void main(String []args){
        int a[]={4,5,6,7,0,1,2};
        int a1[]={6,3,9,5,2,8,-5};
        quickSort(a1,0,a1.length-1);

        //mergeSort(a1,0,a1.length-1);
        print(a1);
        int target=0;
        int idx=search(a,target,0,a.length-1);
       // System.out.println(idx);
    }
}
