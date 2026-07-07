/*package Day_12.Class_Task;

import java.util.Arrays;
public class Anagram {
        public static void main(String[] args) {
            //isAnagram("pot", "top");
            System.out.print(isAnagram("pot", "top"));
        }
    }
//    class anagram {
//        public void isAnagram (String s1);
//        public void num2 (String s2);

        public static boolean isAnagram(String s1, String s2) {
            //input 2 strings arguments
            //o/p: true or false
            //Steps: 1. check and compare the length of both strings
            //2. if length not same return false, else check further
            if (s1.length() == s2.length()) {//further check // s2=top //s1=pot
                for (int j = 0; j < s2.length(); j++) { //pot
                    for (int i = 0; i < s2.length(); i++) { //top
                        if (s1.charAt(j) == s1.charAt(i)) {
                            char[] arr1 = s1.toCharArray(); //['p',ó','t']
                            char[] arr2 = s2.toCharArray(); //['t',
                            Arrays.sort(arr1);
                            Arrays.sort(arr2);
                            if (arr1.equals(arr2) == true) {
                                return true;//System.out.println(s2.charAt(i));//return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }//return false;
            }
            return false;
        }
//    }



//void main() {*/