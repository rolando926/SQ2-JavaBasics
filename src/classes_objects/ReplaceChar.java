package classes_objects;

import java.util.Arrays;

/**
 * Created by RXC8414 on 3/23/2017.
 */
public class ReplaceChar {

    private String strPhrase;

    public ReplaceChar(String str1){
        strPhrase = str1;
    }

    public void replaceCharString() {
        char[] arryChar = strPhrase.toCharArray();
        for(int i=0; i < arryChar.length; i++){
            if(arryChar[i] == 'a' ||
                    arryChar[i] == 'e' ||
                    arryChar[i] == 'i' ||
                    arryChar[i] == 'o' ||
                    arryChar[i] == 'u' ||
                    arryChar[i] == 'A' ||
                    arryChar[i] == 'E' ||
                    arryChar[i] == 'I' ||
                    arryChar[i] == 'O' ||
                    arryChar[i] == 'U'){
                arryChar[i] = '9';
            }
            System.out.print(arryChar[i]);
        }
    }
}