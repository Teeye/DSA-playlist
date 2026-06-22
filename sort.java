public class sort {
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(

                    a[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int a[]) {
        for(int i=0;i<a.length-1;i++){
            int swap=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
                System.out.print(swap+" ");
            }
        }
    }
    public static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
           int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
        public static void main (String[]args){
        int arr[]={2,3,5,1,0};
        //bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
        }
}
