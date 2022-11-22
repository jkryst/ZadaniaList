
public class zad1 {

    public static void main(String[] args) {

        LList list1 = new LList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);
        System.out.println(reverse(list1));
    }


    public static LList reverse(LList list) {

        LList.Node poprz = null;
        LList.Node akt = list.head;
        LList.Node nast = list.head.next;


        if(list == null) return list;

        else {

            while (nast != null) {

                akt.next = poprz;
                poprz = akt;
                akt = nast;
                nast = nast.next;
            }

            akt.next = poprz;
            return new LList(akt);
        }
    }
}
