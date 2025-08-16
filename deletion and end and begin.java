import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("End1");
        list.addLast("End2");
        list.addFirst("Begin1");
        list.addFirst("Begin2");
        System.out.println("List after adding at begin and end: " + list);
        String removedBegin = list.removeFirst();
        System.out.println("Removed from beginning: " + removedBegin);
        String removedEnd = list.removeLast();
        System.out.println("Removed from end: " + removedEnd);
        System.out.println("List after deletions: " + list);
    }
}
