public class SpinWords {
    public String spinWords(String sentence) {

        String [] tokens = sentence.split("[\\W]");

        int x = 0;
        String newWord = "";

        String newSen = "";

        while(x < tokens.length) {
            char[] ch = tokens[x].toCharArray();
            for (char c : ch) {
                if(tokens[x].length() > 4 ) {
                    newWord = c + newWord;
                }
                if(tokens[x].length() < 5){
                    newWord = newWord + c;
                }
            }
            newSen = newSen + " " + newWord;
            x++;
            newWord = "";
        }

        newSen = newSen.trim();
        System.out.println(newSen);
        return newSen;

    }
}