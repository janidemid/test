public class Alphabet {
    public boolean isAlphabet(String string){
        String alphabeth = "abcdefghijklmnopqrstuvwxyz";
        boolean isEqual=true;
        for (int i = 0; i < string.length(); i++) {
            if(string.toCharArray()[i]!=alphabeth.toCharArray()[i]){
                isEqual=false;
            }
        }
        return isEqual;
    }
}
