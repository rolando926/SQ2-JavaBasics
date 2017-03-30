package methods_encapsulation_conditionals.homework_week2;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class Utilities {

    public void printDivisibleBySeven(int start, int stop){
        for(int i = start; i <= stop; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }

    public int countNumbersDivisibleBySeven(int start, int stop){
        int z = 0;
        for(int i = start; i <= stop; i++){
            if(i%7==0){
                z++;
            }
        }
        return z;
    }

    public int findStringSize(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
        }
        return count;
    }

    public void countVowelsAndChars(String str){
        int size = str.length();
        int countVowels = 0;
        int countConsonants = 0;
        String str1 = "aeiouAEIOU";
        String str2 = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for(int i = 0; i < size; i++){
            if(str1.contains(Character.toString(str.charAt(i)))){
                countVowels++;
            }
            else{
                if(str2.contains(Character.toString(str.charAt(i)))){
                    countConsonants++;
                }
            }
        }
        System.out.println("Number of vowels: "+countVowels);
        System.out.println("Number of consonants: "+countConsonants);
    }

}
