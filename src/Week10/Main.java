package Week10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Kris");
        list.add("Carmen");
        list.add("Sarah");
        list.add("Noam");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }



}
