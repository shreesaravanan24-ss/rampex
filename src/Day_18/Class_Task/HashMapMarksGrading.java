package Day_18.Class_Task;
import java.util.HashMap;
import java.util.Arrays;
public class HashMapMarksGrading {
    public static void main(String[] args) {
        //Create a HashMap add Name, Mark values
//        HashMap<String, Integer> markList = new HashMap<String, Integer>();
//        markList.put("Shree", 97);
//        markList.put("Saravanan", 96);
//        markList.put("Deekchith", 94);
//        markList.put("Nilan", 92);
//        markList.put("Junior", 100);
//        System.out.print(markList);
//        System.out.println(markList.entrySet());
//        markList.entrySet();
//        int max = 0;
//        for(Integer mark : markList.values()){
//            if(mark > max){max = mark;}
//            System.out.print(hm);
//        }
//        System.out.println(max);
        String name = "saravanan";
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
//        HashMap hm = new HashMap<Character, Integer>();
        HashMap freq = new HashMap<Character, Integer>();
        for (Character c : ch) {
            freq.put(c, (Integer) freq.getOrDefault(c, 0) + 1);
        }
        System.out.print(freq);
//            if(hm.containsKey(c)){
//                hm.put(c,(Integer) (hm.get(c)) + 1);
//            }else{
//                hm.put(c,1);
//            }
//        System.out.print(hm);
    }
}
