package lyl.code.offer;

/**
 * Created by lyl on 2015/8/17.
 */

/**
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Oddeven {
    public void reOrderArray(int [] array) {
        int len =array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-1; j++) {
                if((array[j]&1)== 0 && (array[j+1]&1) ==1 ){
                    int t =array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
    public void reArray(int[] array){
        int len = array.length;
        boolean flag =true;
        int t =0;
        for (int i = 0; i <len; i++) {
            if((array[i]&1)==0 && flag){
                flag = false;
                t =i;
            }
            if(!flag && (array[i]&1)==1){
                int aa = array[i];
                for(int k=i-1;k>=t;k--){
                    array[k+1]=array[k];
                }
                array[t]=aa;
                t++;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Oddeven oddeven = new Oddeven();
        int[] aa = {1,2,3,4,5,6,7};
        oddeven.reArray(aa);
    }
}
