package lesson2;

public class Sum {
    public static void main(String[] args) {
       Sum sum = new Sum();
       sum.numbers(4,6) ;

    }

      public void numbers (int a, int b ) {

          int result = 0;
          for (int i = a;  i <=b; i++) {
              result = result + i;
          }
          System.out.println(result);
      }

}