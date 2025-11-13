import java.util.*;
public class basic {
    public static void printNumbers(int n,int start) {
        // Your code goes here
        if(start>n){
            return;
        }
        System.out.println(start);
        printNumbers(n,start+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start=1;
        printNumbers(n,start);
        sc.close();
    }
}