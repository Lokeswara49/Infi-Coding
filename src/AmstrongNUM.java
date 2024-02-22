import java.util.Scanner;

public class AmstrongNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>=0;i--){
            if(isAmstrong(i)){
                System.out.println(i);
                break;
            }
        }

    }
    static boolean isAmstrong(int n){
        int sum=0;
        int temp=n;
        int pow=(int)(Math.log(n)/Math.log(10))+1;
        while(temp>0){
            int rem=temp%10;
            sum=sum+(int)Math.pow(rem,pow);
            temp/=10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}
