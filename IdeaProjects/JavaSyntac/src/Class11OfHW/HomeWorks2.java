package Class11OfHW;

import java.sql.SQLOutput;

//Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphabets(abd AZ) characters are there in the String.
public class HomeWorks2 {
    public static void main(String[] args) {
        String str = "Hello12345@#$%Great Job Guys";
        char [] charArray=str.toCharArray();
        int Uppercase=0;
        int Lowercase=0;
        for (char m:str.toCharArray()){
            if(Character.isUpperCase(m)) {
                Uppercase++;
            }else if(Character.isLowerCase(m)){
                Lowercase++;
            }
            }
        System.out.println("the max uppercase alphabets are "+Uppercase);
        System.out.println("the max lowercase alphabets are "+Lowercase);

        }
    }


