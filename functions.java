import java.util.Scanner;
public class functions {

    //swapping
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
    }

    //factorial
    public static int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        return f;
    }
    public static int bcoeff(int n, int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);

        int bincoeff=fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
    public static int reversenum(int n){
        //int rev=0;
        int sum=0;
        int count=0;
        while(n>0){
            int ld=n%10;
           // rev=(rev*10)+ld;
            //sum=sum+ld;
            count++;
            n=n/10;
        }
        return sum;
    }
    public static void palindrome(int n){
        int rev=0;
        int ori=n;
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        if(rev==ori){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    public static void armstrong(int n){
        int ori=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            int pow=(int)Math.pow(ld,3);
            sum=sum+pow;
            n=n/10;
        }
        if(sum==ori){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not an armstrong");
        }
    }

    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        //System.out.print("enter a: ");
       // System.out.println(bcoeff(5, 2));
        //System.out.println(reversenum(1124));
       // palindrome(101);
        armstrong(153);
    }
}


/*
    public static void greet(){
        System.out.println("hello world!!");
    }
    public static int calculate(int a,int b){
        int sum=a+b;
        return sum;
    }

     public  static void main (String []args){
        greet();
        greet();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x: ");
        int x=sc.nextInt();
        System.out.print("enter y: ");
        int y=sc.nextInt();
        int sum=calculate(x,y);
        System.out.print("sum is: "+sum);
    }

    //factorial and swapping
     int factorial=fact(a);
        System.out.print("factorial of "+ a +" is: "+ factorial);
        System.out.print("enter b: ");
        int b=sc.nextInt();
        swap(a,b);
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);

 */