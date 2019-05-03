public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int nCounter = 0;
        int sCounter = 0;
        int eCounter = 0;
        int wCounter = 0;
        int walkTime = 0;

        int total = walk.length;

        for(int i = 0; i < total; i++){
            switch(walk[i]){
                case 'n': nCounter = nCounter + 1;
                break;
                case 's': sCounter = sCounter + 1;
                break;
                case 'e': eCounter = eCounter + 1;
                break;
                case 'w': wCounter = wCounter + 1;
                break;
            }
        }

        walkTime = nCounter + sCounter + eCounter + wCounter;

        if(walkTime != 10){
            return false;
        }

        if(nCounter != sCounter || eCounter != wCounter) {
            return false;
        }

        return true;
    }
}