package chapter_09;


import java.util.ArrayList;
import java.util.List;

public class HW4_2 implements Priority{
    public static void main(String[] args) {
        List<HW4_2> list = new ArrayList<HW4_2>();
        list.add(new HW4_2(1));
        list.add(new HW4_2(2));
        list.add(new HW4_2(4));
        list.add(new HW4_2(3));
        list.add(new HW4_2(5));
        list.add(new HW4_2(6));



        for (HW4_2 x : list)
            System.out.println(x);

    }
}