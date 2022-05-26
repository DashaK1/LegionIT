package stringsLesson;

public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println( IsPalindrome("carrace"));
        System.out.println( IsPalindrome( "racecar"));
    }

    public static boolean IsPalindrome( String alltext) {
        String reverse = "";

        int length = alltext.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + alltext.charAt(i);

        return alltext.equals(reverse);
    }
}

