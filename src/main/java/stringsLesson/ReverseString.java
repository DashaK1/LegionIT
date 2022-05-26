package stringsLesson;

public class ReverseString {

    //dog--god
    //get the last letter (length -1) add it as first letter of the new world


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("");

    }

    public void reverseString(String txtToReverse) {
        if (txtToReverse == null || txtToReverse.isEmpty() || txtToReverse.isBlank()) {
            System.out.println("the String is null or empty");
        } else {

            System.out.println(String.format("The input string is %s ", txtToReverse));


            String result = "";
            int lastLetter = txtToReverse.length()-1;
            for(int i=lastLetter; i>=0; i--){
                result = result + txtToReverse.charAt(i);
            }

            System.out.println(result);

        }
    }

}

