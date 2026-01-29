package Opes;

public class Reverse{
    public static void main(String... args){

        String word ="word";
        char letter = 'w';
        System.out.println(reverseWord(word,letter));
    }
    
    public static String reverseWord(String word,char letter){
        String reversedWord = "";
        for(int count=0;count<word.length();count++){
            if( word.charAt(count) == letter){
                        reversedWord += word.charAt(count);
                for(int counter = word.length()-1;counter>=0;counter--){
                    if(counter == count){
                            break;
                        }
                    reversedWord += word.charAt(counter);
                    }
                    break;
            }else{
                reversedWord+=word.charAt(count);
            
            }
        }
            return reversedWord;
    }
}