public class recursion1 {

    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        int sm1=getSum(n-1);
        int sum=n+sm1;
        return sum;
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int fibs=fib1+fib2;

        return fibs;
    }
    public static boolean isSorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return isSorted(a,i+1);
    }
    public static int firstOccur(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccur(a,key,i+1);
    }
    public static int lastOccur(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        int isFound=lastOccur(a,key,i+1);
        if(isFound==-1 && a[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
        //return x*power(x,n-1);
    }
    public static void main(String []args){
        int n=2;
        int a[]={3,3,2,5,5};
        printDec(3);
        printInc(3);
       // System.out.println(power(2,10));
        //System.out.println(firstOccur(a,5,0));
        //System.out.println(isSorted(a,0));
       // System.out.println(fact(n));
        //System.out.println(getSum(n));
       // System.out.println(fib(n));
    }
}
