package lyl.code.offer;

/**
 * Created by lyl on 2015/8/17.
 */
public class ROL {
    public String LeftRotateString(String str,int n) {
        if(str==null)
            return "";
        int len = str.length();
        if(len == 0)
            return "";
        int t = n %len;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(t,len));
        stringBuilder.append(str.substring(0,t));

        return  stringBuilder.toString();
    }
    public static void main(String[] args){
        int len =5;
        int n =3;
        System.out.println(n % len);
        System.out.println(n & len);
        String aa = "abcdefg";
        System.out.println(aa.substring(0,2));
/*        ROL rol = new ROL();
        System.out.println(rol.LeftRotateString(null, 2));*/
    }
}
