import java.util.*;
public class sumNnumbers{
    public static int NnumbersSum(int N,int summ){
        //your code goes here
        if (N<0){
            return summ;
        }
        summ+=N;
        return NnumbersSum(N-1,summ);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int summ=0;
        System.out.println(NnumbersSum(N,summ));
        sc.close();
    }
}