package tutorial_06.activity4;

public class ListDemo {
    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

