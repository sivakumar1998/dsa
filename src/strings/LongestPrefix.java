package strings;

public class LongestPrefix {
    public static void main(String[] args) {
        String prefix="";
    String s1="moonday";
    String s2="mon";
    String[] words={"monday","moon","monkey"};

//    for(char c1:c){
//        if(s2.startsWith(String.valueOf(c1)) && prefix.equals("")){
//            prefix+=c1;
//        } else if (s2.startsWith(prefix)) {
//            prefix+=c1;
//        }
//    }
//        int i=0;
//        for(char c2:s1.toCharArray()){
//            if(i==0){
//                prefix+=c2;
//            }
//
//            if(s2.startsWith(prefix) && i!=0){
//               prefix+=c2;
//               i++;
//            }
//        }
        int j=0;
        for (int i=1;i<s1.length();i++){
            if(i<s2.length()&&s1.startsWith(s2.substring(j,i))&& s1.startsWith(prefix)){
                prefix=s2.substring(j,i);


            }
        }
        System.out.println(prefix);
    }
//public String getLongestCommonPrefix(String[] array){
//        String longestCommonPrefix="";
//        String
//}
}
