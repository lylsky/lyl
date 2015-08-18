package lyl.code.String;

/**
 * Created by lyl on 2015/8/17.
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(iniString.charAt(i) != ' '){
                str.append(iniString.charAt(i));
            }else
                str.append("%20");
        }
        return str.toString();
    }
    public static void main(String[] args){
        String s = "china afdaf fadf";
        System.out.println(new Replacement().replaceSpace(s,s.length()));
    }
}
