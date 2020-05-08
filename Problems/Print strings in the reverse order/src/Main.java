//put imports you need here

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<String> input = new ArrayList<>();
        while (scanner.hasNext()){
            input.add(scanner.next());
        }

        Collections.reverse(input);
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}