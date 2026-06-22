public class recursion2 {
    public static int tilingProb(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingProb(n-1);
        int fnm2=tilingProb(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void removeDup(String str, int idx, StringBuilder sb, boolean map[]){
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }
        char cur = str.charAt(idx);
        if(map[cur - 'a']== true){
            removeDup(str, idx+1, sb, map);
        }
        else{
            map[cur - 'a']=true;
            removeDup(str, idx+1, sb.append(cur), map);
        }
    }
    public static int frnPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=frnPair(n-1);
        int fnm2=frnPair(n-2);
        int pairways=(n-1)*fnm2;
        int total=fnm1+pairways;
        return total;
    }
    public static void binary(int n, int last ,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binary(n-1,0,str+"0");
        if(last==0){
            binary(n-1,1,str+"1");
        }
    }
    public static void findIdx(int a[],int key, int idx){
        if(idx==a.length){
            return;
        }
        if(a[idx]==key){
            System.out.print(idx +" ");
        }
        findIdx(a,key,idx+1);
    }
    public static void printDigit(int n){
        String digits[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        int lastDigit=n%10;
        printDigit(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void strLen(String str, int idx){
        if(idx == str.length()){
            System.out.println(idx);
            return;
        }
        strLen(str,idx+1);
    }
    public static boolean powerThree(int n) {
        if(n==1){
            return true;
        }
        if(n<=0 || n%3!=0){
            return false;
        }
        return powerThree(n/3);
    }
    public static int fib(int n){
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        return fnm1+fnm2;
    }

    public static void main(String[]args){
        int n=27;
        System.out.println(powerThree(n));
        String str="apna";
        //strLen(str,0);
        int a[]={3,2,4,5,6,2,7,2,2};

        //printDigit(n);
       // findIdx(a,2,0);
       // binary(3,0,"");
       // System.out.println(frnPair(n));
       // removeDup(str,0,new StringBuilder(""),new boolean[26]);
       // System.out.println(tilingProb(n));
    }
}
