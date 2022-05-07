import java.util.Scanner;

public class Problem9 {

//1. JAVA Program to Check whether an alphabet is Vowel or Consonant

  public static void main(String [] args){
   boolean vowel=false;
   Scanner alphabet = new Scanner(System.in);
   System.out.println("Enter an Alphabet=");
   char letter=alphabet.next().charAt(0);                  //To intake an alphabet from user
            switch (letter){                               //To check using switch-case statement
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel = true;
            }
            if(vowel==true){
                System.out.println("The given alphabet is a Vowel");
            }
            else if ((letter>='a'&& letter<='z')||(letter>='A'&& letter<='Z'))
            {
                System.out.println("The given alphabet is a Consonent");

            }
            else {
                System.out.println("The given input is not an alphabet");
            }
  }
}

