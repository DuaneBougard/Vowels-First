/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Pattern;

/**
 *
 * @author Duane Bougard 3566258
 */
public class VowelsFirst {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String wrd="ab*ucdefi";//length=7
        String wrd2="abcdefghijkl";
        System.out.println(classifier(wrd));
        System.out.println(classifier(wrd2));
    }
    public static String classifier(String s){return classifierAux(s,0);}
    
    public static String classifierAux(String s,int k){
        while((k>=0) && (k<=s.length()-1)){
            if (s.equals("")){return "";}
            else{
                char chr = s.charAt(k);
                if (isVowel(chr)){return "" + chr +"," + classifierAux(s,k+1);}
                else if (isConsonant(chr)){return "" + classifierAux(s,k+1)+ chr+",";}
                else{
                    return ""+classifierAux(s, k+1);}
                }
        }
        return "";
    }
    // isConsonant: true if the letter passed in is a consonant, false otherwise
	public static boolean isConsonant(char c) {return !isVowel(c);}

	// isVowel: true if the letter passed in is a vowel, false otherwise
        public static boolean isVowel(char letter){
            if (letter=='a' || letter=='e'|| letter=='i'|| letter=='o'|| letter=='u'){
                return true;
            }
            else{return false;}
        }

}