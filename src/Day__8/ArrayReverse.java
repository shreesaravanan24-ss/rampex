package Day__8;

import Day_8.ClassTask.String;

import java.util.Arrays;
public class ArrayReverse {
    public static void main(Day_8.ClassTask.String[] args){
        Day_8.ClassTask.String[] menu = {"Veg", "Non-Veg", "Sweets", "Beverages"};
        Day_8.ClassTask.String[] m1 = new String[menu.length];
        for(int i=0 ;i<menu.length;i++){
            m1 [i]=menu[menu.length -1-i];
        }
        System.out.println(Arrays.toString(m1));
        for(int i=0 ;i<menu.length;i++){
            m1 [i]=menu[menu.length -1-i];
        }
        System.out.println(Arrays.toString(m1));
    }
}
