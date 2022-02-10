package Tests;

import ExercisesList.IList;
import SolutionsList.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        IList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        while(!list.isEmpty()) System.out.println(list.removeFirst());
    }

}
