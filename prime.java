//import java.util.Scanner.*;
import java.util.*;
public class prime {
    public static void main(String[] args){
        int n,i=2,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1){
            System.out.println("Neither a prime nor a composite number");
        }
        else{
            while(i*i<=n){
                if(n%i==0){
                    System.out.println("not a prime");
                    flag=1;
                }
                i=i+1;
            }
        }
        if(flag==0){
            System.out.println("it is a prime number");
        }
    }
}
