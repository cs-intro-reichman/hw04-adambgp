public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCase="";
        for (int idx = 0; idx < str.length(); idx++) {
          char i= str.charAt(idx);  
          
            if('Z'>=i&&i>='A'){
                char big = (char) (i+32);
              lowerCase= lowerCase+ big;
          }else{
            lowerCase= lowerCase+i;
          }
        }
        return lowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
          int n1 = str1.length();
          int n2 = str2.length();
          int t=0;
        for(int i=0 ; i<=(n1-n2); i++){
            
            for( t=0; t<n2; t++){
                char start= str1.charAt(i+t);
                if (start!=str2.charAt(t)){
                    break;
                }

            }
            if(t==n2){
                return true;
            }
           }
        return false;
    }
}
