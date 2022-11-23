public class StringUtils {
    public static boolean included(String word, String searched){
        word = word.trim();
        searched = searched.trim();
        word = word.toLowerCase();
        searched = searched.toLowerCase();
        if(word.contains(searched)){
            return true;
        }
        else{
            return false;
        }
    }
}
