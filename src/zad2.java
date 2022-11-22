import java.util.LinkedList;
import java.util.List;

public class zad2 {

    public static void main(String[] args) {

        LList list1 = new LList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LList list2 = new LList();
        list1.add(2);
        list1.add(4);
        list1.add(6);

        System.out.println(list1);
        System.out.println(merge(list1, list2));
    }

    public static LList merge(LList list1, LList list2) {
        LList first = list1;
        LList second = list2;
        LList head = null;
        LList third = null;

        if(first.head.value<second.head.value) {
            head = first;
        } else {
            head = second;
        }

        third = head;
        while(first!=null && second!=null) {
            if (first.head.value <= second.head.value) {
                third.head.next = first.head;
                third.head = third.head.next;
                first.head = first.head.next;
            } else {

                if(first!=null) third.head.next = first.head;

                if(second!=null) third.head.next = second.head;

            }

        }

        return third;

    }
}
