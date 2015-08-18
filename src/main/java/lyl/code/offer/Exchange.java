package lyl.code.offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by lyl on 2015/8/17.
 */
public class Exchange {
    public int exchangeOddEven(int x) {
        // write code here
        int flag = 1;
        while(flag!=0){
            if(((x&flag)<<1^(x&(flag<<1))) ==0)
                flag = flag<<2;
            else{
                x = x^flag;
                flag = flag<<1;
                x = x^flag;
                flag  =flag<<1;
            }
        }
        return  x;
    }
    public void print(int x){
        System.out.println(1^1);
        int flag = 1;
        Stack  stack = new Stack();
        while(flag !=0){
            if((x&flag) !=0)
                stack.push('1');
            else
                stack.push('0');
            flag =flag << 1;
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }

    }
    public static void main(String[] args){
        Exchange aa = new Exchange();
        aa.print(11);
        System.out.println();
        aa.print(335896);
        System.out.println();
        System.out.println(aa.exchangeOddEven(711908));

    }
}
