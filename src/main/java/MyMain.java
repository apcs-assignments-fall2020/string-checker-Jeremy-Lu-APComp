import java.util.Scanner;
// public static void main(String[] args){
public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        //A CODE
        int length_char = str.length(); //length_char is the length of the inputted string
        int i_countA = 0; //initializes the counter for A freq count
        int i_countB = 0;
        int i_countC = 0;
        
        for (int i = 0; i < length_char; i++) {
            char char_checker = str.charAt(i);
                if (char_checker == 'a'){
                    i_countA += 1;
                    //System.out.println(char_checker); //debugging
                }
                else{
                    //System.out.println("CONFIRMED"); //debugging
                }
                }
        for (int i = 0; i < length_char; i++) {
            char char_checker = str.charAt(i);
                if (char_checker == 'b'){
                    i_countB += 1;
                    //System.out.println(char_checker); //debugging
                }
                else{
                    //System.out.println("CONFIRMED"); //debugging
                }
                }
        for (int i = 0; i < length_char; i++) {
            char char_checker = str.charAt(i);
                if (char_checker == 'c'){
                    i_countC += 1;
                    //System.out.println(char_checker); //debugging
                }
                else{
                    //System.out.println("CONFIRMED"); //debugging
                }
                }
            String A_string = Integer.toString(i_countA);
            String B_string = Integer.toString(i_countB);
            String C_string = Integer.toString(i_countC);
            // return ("A: " + A_string + " B: " + B_string + " C: " + C_string);
            return i_countA + i_countB + i_countC;
        //NOTE, I'm trying to figure out how to take SPACES into account - the code currently only works whenever no spaces are involved in the string.
        }
    // }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
      String str_CAP = str.toUpperCase();
      int check_the = str_CAP.indexOf("THE");
        if (check_the>=0){ //if positive;
        //   return("Contains the string the");
            return true;
        }
        else{
        //   return("Does not contain the string the");
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
      System.out.println("-------");
      System.out.println("1 = Palindrome; 2 = Not a palindrome");
      System.out.println("-------");
      int length_str_pal = str.length();
      String rev = "";
      for ( int i = length_str_pal - 1; i >= 0; i-- ){
         rev = rev + str.charAt(i);
      }
      if (str.equals(rev)){
        //  return(1);
        return true;
      }
      else{
        //  return(2);
        return false;
      }
      
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Please input a string ");
            String str = scan.next();
            System.out.println(countABC(str)); //countABC method
            System.out.println(isPalindrome(str)); //isPalindrome method
            System.out.println(containsThe(str)); //containsThe method
        // YOUR CODE HERE
    }
}

