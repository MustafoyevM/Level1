package FirstSection;

public class N118 {
    public static void main(String[] args) {

        System.out.println(strStr("Python","y"));
    }

    public static int strStr(String source,String target){
        if(source==null || target==null)
            return -1;
        if("".equals(target) || source.equals(target))
            return 0;
        int i=0, last=source.length()-target.length()+1;
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal=true;
                for (int j = 0; j < target.length()-1 &&equal; j++) {
                    equal=source.charAt(i+j)==target.charAt(j);
                }
                if (equal) {
                    return i;
                }
            }++i;
        }
        return -1;
    }
}
