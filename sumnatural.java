import java.util.Scanner;

public class sumnatural {
   public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        //avg of 25 exam scores
       int sum=0;
        for(int i=0;i<25;i++){
            System.out.print("enter exam score: ");
        int s=sc.nextInt();
        sum=sum+s;
        }
        int avg=sum/25;
        System.out.println(avg);
    }
}





/*import java.util.Scanner;
public class chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sum of natural numbers;;;
         int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //area of circle
        double pie=3.14;
        System.out.print("enter r value:");
        int r=sc.nextInt();
        double areaOfCircle=pie*r*2;
        System.out.println(areaOfCircle);

         //print even numbers
        int n=100;
        for(int i=9;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
*/