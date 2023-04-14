public class RecursionPermutaion {
//    Try is again


    String myNewStrgin;
    public static void permuation(String a, String b) {

        if(a.length() <0) {
            System.out.println(b);
        }

        for (int i=0; i<a.length(); i++) {
            char curChar = a.charAt(i);
            System.out.print(curChar);
            String newStr = a.substring(0, i) + a.substring(i+1);
            permuation(newStr, b+curChar);
//            String h =
        }
        System.out.println();



//        permuation(a, b-1);
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.substring(0+1
        ) + "This is");
//        System.out.println(str);
        permuation(str, "");
    }
}
