package lyl.code.offer;

/**
 * Created by lyl on 2015/8/16.
 */
public class Fibo {
    public static int calu_fibo(int n){
        int sum =0;
        if(n < 0){
            System.out.println("n输入不正确");
            System.exit(1);
        }
        if(n ==0 )
            return 0;
        if(n==1)
            return  1;
        int f0=1;
        int f1=0;
        for(int i=2;i<=n;i++){
            sum = f1+f0;
            f1= sum;
            f1=f0;
        }
        return sum;
    }
    public static void main(String[] args){
        int n =3;
        System.out.println(calu_fibo(n));
    }
}
