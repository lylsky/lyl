package lyl.code.offer;

/**
 * Created by lyl on 2015/8/16.
 */
public class Number1 {
    public static void number1(int n){
        int t =1;
        int count =0;
        while (t !=0){
            if((n&t)!=0){
                count++;
            }
            t = t << 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int n =-1;
        number1(n);
    }
}
