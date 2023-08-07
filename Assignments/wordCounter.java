import java.util.Scanner;
class wordCounter {
    public static void main (String [] args){

        Scanner uI = new Scanner( System.in);

        String s = null;

        System.out.print("Please enter a sentence: ");
        s = uI.nextLine();

        int wordCount = countWords(s);

        System.out.printf("There are %d words in the sentence you entered.", wordCount);

    }

    public static int countWords(String s){

        if (s == null || s.isEmpty()) {
            return 0;
        }

        String trimmedSentence = s.trim();//removes trailing spaces at front and end of code
        
        String [] words = trimmedSentence.split("\\s+");
        return words.length;

    }
    
}
