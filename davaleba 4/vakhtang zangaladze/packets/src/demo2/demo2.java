package demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrL=new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        System.out.println();

        BitSet integers;
        int sum= integers.stream().map(Integer::intValue()).sum();
        System.out.print("მიღებული შედეგი" + sum);


            }
        }






