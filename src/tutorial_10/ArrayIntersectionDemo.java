package tutorial_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayIntersectionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of elements for set A: ");
        Set<Integer> setA = new HashSet<>();
        int setASize = scanner.nextInt();
        for (int i = 1; i <= setASize; i++) {
            System.out.print("Add a number: ");
            int addedNumber = scanner.nextInt();
            setA.add(addedNumber);
        }
        System.out.println("Set A: " + setA);

        System.out.println(" ");

        System.out.print("Enter a number of elements for set B: ");
        Set<Integer> setB = new HashSet<>();
        int setBSize = scanner.nextInt();
        for (int i = 1; i <= setBSize; i++) {
            System.out.print("Add a number: ");
            int addedNumber = scanner.nextInt();
            setB.add(addedNumber);
        }
        System.out.println("Set B: " + setB);

        System.out.println("==================================");
        System.out.println("Set C: " + intersects(setA, setB));
    }

    public static Set<Integer> intersects(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> setC = new HashSet<>();

        if (setA.size() > setB.size()) {
            Set<Integer> temp = setA;
            setA = setB;
            setB = temp;
        }

        for (int x : setA) {
            if (setB.contains(x))
                setC.add(x);
        }
        return setC;
    }

}
