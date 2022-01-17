public class Main {
    public static void main(String[] args) {
        // create a new instance of the LinkedList
        LinkedList<String> myList = new LinkedList<>();
        // add and print items
        System.out.println(myList.size() + " " + myList);
        myList.add("test1");
        System.out.println(myList.size() + " " + myList);
        myList.add("test2");
        System.out.println(myList.size() + " " + myList);
        myList.add("test3");
        System.out.println(myList.size() + " " + myList);
        myList.add("test4");
        System.out.println(myList.size() + " " + myList);
    }
}