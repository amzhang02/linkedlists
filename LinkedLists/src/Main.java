public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleLinkedList<String> myList = new SimpleLinkedList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(String.valueOf(i));
        }
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.clear();
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());

        //////////////////////////////////////

        myList.add("this is the second element");
        myList.addFirst("this is the first element");
        myList.addLast("this is the third element");

        myList.removeFirst();


        System.out.println();
        System.out.println("//////////////////////////////////");
        System.out.println();
        System.out.println(myList.indexOf("this is the third element"));

        for (int i = 0; i < myList.size(); i ++) {
            System.out.println(myList.get(i));
        }

        System.out.println();
        System.out.println("//////////////////////////////////");
        System.out.println(myList.add("yeet"));
        System.out.println(myList.contains("duck"));
    }
}
