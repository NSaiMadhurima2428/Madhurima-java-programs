import java.util.regex.*;
class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = ("The quick brown FOX jumps over the lazy dog");
        String needle = ("donkey");
        System.out.println("1. Using contains():");
        if (haystack.contains(needle)) {
            System.out.println("Needle found using contains()");
        } else {
            System.out.println("Needle NOT found using contains()");

        }
    }
}