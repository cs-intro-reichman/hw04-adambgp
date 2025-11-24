public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        for (int i = 0; i < sentences.length; i++) { 
            String sentence = sentences[i]; 
            String lowerCaseSentence = lowerCase(sentence);   
        for (int check = 0; check < keywords.length; check++) {
                
                String keyword = keywords[check];
                String lowerCaseKeyword = lowerCase(keyword);
                if (contains(lowerCaseSentence, lowerCaseKeyword)) {
                    System.out.println(sentence);
        }
       }
      }

}



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