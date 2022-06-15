import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        for (String s : arrayList) {
            System.out.println(s);
            System.out.println();
        }

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.remove("three");
        for (String s1 : arrayList) {
            System.out.println(s1);
            System.out.println();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("five");
        linkedList.add("six");
        linkedList.add("seven");
        linkedList.add("eight");
        for (String s2 : linkedList) {
            System.out.println(s2);
        }
        linkedList.add("five");
        linkedList.add("six");
        linkedList.add("seven");
        linkedList.add("eight");
        linkedList.remove("eight");
        for (String s3 : linkedList) {
            System.out.println(s3);
        System.out.println();
    }
}}
