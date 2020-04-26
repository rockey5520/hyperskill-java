// Posted from EduTools plugin
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<String>();
        List<String> finalgueslist = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            guestList.add(scanner.nextLine());
        }
        for (String s : guestList
        ) {
            if (s.split(" ").length > 1) {
                List<String> temp = new ArrayList<String>();
                temp = Arrays.asList(s.split(" "));
                for (String s1 : temp
                ) {
                    finalgueslist.add(s1);
                }
            } else {
                finalgueslist.add(s);
            }
        }


        for (int i = finalgueslist.size()-1 ; i >= 0 ; i--) {
            System.out.println(finalgueslist.get(i));
        }

    }
}