package stringsLesson;

public class M4String {

    public String expecteda= "Category";
    public String expectedb ="Cat";


    public static void main(String[] args) {



        M4String m4string = new M4String();
        m4string.compareStrings("Category", "Cat");

    }


    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.equals(b)) {
            System.out.println("The Strings are the same");
        } else if (a.contains(b)) {
            System.out.println(b + " is the part of " + a);
        }
        else if (!a.equalsIgnoreCase(expecteda) || !b.equalsIgnoreCase(expectedb)) {

            System.out.println("The a or b does not match the expected values ");
    }
}}

