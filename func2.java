import java.util.Scanner;

public class func2 {

    public static int sqr(int a){
        return a*a;
    }
    public static int base(int a,int b){
        int res=1;
        for(int i=1;i<=b;i++){
            res=res*a;
        }
        return res;
    }
    public static int celtofahr(int cel){
        int fahr=(cel*9/5)+32;
        return fahr;
    }
    public static int fahrtocel(int fahr){
        int cel=(fahr-32)*5/9;
        return cel;
    }
    public static int factorial(int n){
        int fact=1;
        if(n<0){
           return -1;
        }else{
            for(int i=n;i>0;i--){
                fact*=i;
            }
        }
        return fact;
    }
    public static int binocoeff(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nmr=factorial(n-r);
        int res=nfact/(rfact*nmr);
        return res;
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primerange(int n){
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // System.out.println(sqr(3));
      //  System.out.println(base(3,3));
       // System.out.println(celtofahr(25));
        //System.out.println(fahrtocel(77));
        primerange(20);

        int res=binocoeff(5,2);
        if(res==-1){
            System.out.println("negative");
        }
        else{
            System.out.println(res);
        }
    }
}






/*public class func2 {

    public static int avg(int a,int b,int c){   //average of 3 numbers;
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }

    public static boolean isEven(int n){
        boolean isEven=false;
       if(n%2==0){
           return true;
       }
       return false;
    }
    public static void test(int n){
        if(isEven(n)){
            System.out.println(n +"is even");
        }
        else {
            System.out.println(n+" is odd");
        }
    }

    //check palindrome
    public static boolean palindrome(int n){
        int ori=n;int rev=0;
        while(n>0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(rev==ori){
            return true;
        }
        return false;
    }
    public static void meth(int n,int m){
        System.out.println( Math.min(n,m));
        System.out.println(Math.max(n,m));
        System.out.println( Math.sqrt(n));
        System.out.println(Math.abs(n));
        System.out.println( Math.pow(n,m));

    }
    public static void sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }

public static int calcthediv(int a,int b){
    if(b==0){
        return -1;
    }
       return a/b;
}
public static int checkoddeven(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return -1;
        }
}

    public static void main(String[]args){

        int res1=checkoddeven(10);
        if(res1==1){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //Scanner sc=new Scanner(System.in);
        int res=calcthediv(10,5);
        if(res==-1){
            System.out.println("cannot be divided by zero");
        }
        else{
            System.out.println(res);
        }
       // sum(123);
        //meth(3,3);
       // System.out.println( palindrome(1221));

       // System.out.println(isEven(3));
        //test(3);

        //System.out.print("enter range: ");
        //int n=sc.nextInt();
       // primeRange(n);
       // decToBin(5);

    }
}


     /*
        //simple method
      public static boolean isPrime(int n){
        boolean isPrime=true;

        if(n==2){
           return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPrime(int n){   //optimized method
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){   //prime n0. in range
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int n){     //convert binary to decimal
        int num=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int ld=n%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal of "+ num+ " = "+ dec);
    }

    public static void decToBin(int n){ //convert decimal to binary
        int num=n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("decimal of "+ num+ " = "+ bin);
    }

    */


