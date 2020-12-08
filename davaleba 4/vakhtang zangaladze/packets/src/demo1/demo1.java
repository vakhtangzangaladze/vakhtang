package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
