package lyl.code.offer;

/**
 * Created by lyl on 2015/8/17.
 */

/**
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
