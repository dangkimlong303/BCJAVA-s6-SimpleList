public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        System.out.println("element 1: " + myList.get(1));
        System.out.println("element 3: " + myList.get(3));
        System.out.println("element 5: " + myList.get(5));
        System.out.println("element 2: " + myList.get(2));
        System.out.println("element 0: " + myList.get(0));

        myList.get(-1);
        System.out.println("element -1: " + myList.get(-1));

    }
}
