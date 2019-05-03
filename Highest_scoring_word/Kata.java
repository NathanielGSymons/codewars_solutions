import java.util.ArrayList;

public class Kata {

    public static String high(String s) {
        // Your code here...
        String sentence = "";
        String [] tokens = s.split("[\\W]");

        // number of words = tokens.length);
        ArrayList<Integer> Total = new ArrayList<Integer>();

        int x = 0;
        int wordTotal = 0;

        //      creates an array containing the total sum of the individual words
        while(x < tokens.length) {
            char[] ch = tokens[x].toCharArray();
            for (char c : ch) {
                int temp = (int) c;
                int temp_integer = 96; //for lower case
                if (temp <= 122 & temp >= 97) {
                    wordTotal = wordTotal + temp - temp_integer;
                }
            }
            Total.add(wordTotal);
            wordTotal = 0;
        x++;
        }

        //      finds max in the array
        int maxAt = 0;
        for (int i = 0; i < Total.size(); i++) {
            maxAt = Total.get(i) > Total.get(maxAt) ? i : maxAt;
        }

        String finalWord = tokens[maxAt];

        return finalWord;
    }
}