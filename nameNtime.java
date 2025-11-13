
import java.util.*;
public class nameNtime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int n = sc.nextInt();
        ntimes(name,n);
        sc.close();
    }
    public static void ntimes(String name, int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        ntimes(name,n-1);
    }
}
