import java.util.HashSet;
import java.util.Set;

public class Intersection {
    Node_1 head_1;
    Node_2 head_2;

    class Node_1 {
        int value;
        Node_1 next;

        Node_1(int data) {
            value = data;
            next = null;
        }
    }

    class Node_2 {
        int value;
        Node_2 next;

        Node_2(int data) {
            value = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Intersection lList_1 = new Intersection();
        Intersection lList_2 = new Intersection();
        Set<Integer> linkedListSet_1 = new HashSet<>();
        Set<Integer> linkedListSet_2 = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        lList_1.push1(11);
        lList_1.push1(12);
        lList_1.push1(13);
        lList_1.push1(14);
        lList_1.push1(15);
        System.out.println("Linked List 1 is : ");
        lList_1.printLList_1();
        lList_2.push2(14);
        lList_2.push2(15);
        lList_2.push2(12);
        System.out.println("\nLinked list 2 is : ");
        lList_2.printLList_2();
        //calling method to convert llist to set
        lList_1.toSet_1(linkedListSet_1);
        lList_1.toSet_2(linkedListSet_2);
        lList_2.interSection(linkedListSet_1, intersectionSet ,linkedListSet_2);
        System.out.println("\n intersection is \n" + intersectionSet);
    }

    private void interSection(Set<Integer> linkedListSet_1, Set<Integer> intersectionSet, Set<Integer> linkedListSet_2) {
        Node_2 n = head_2;
        while (n != null) {
            if (linkedListSet_1.contains(n.value)) {
                intersectionSet.add(n.value);
            }

            n = n.next;
        }

    }

    private void toSet_2(Set<Integer> linkedListSet_2) {
        Node_2 n = head_2;
        while (n != null) {
            linkedListSet_2.add(n.value);
            n = n.next;
        }
    }

    private void toSet_1(Set<Integer> linkedListSet_1) {
        Node_1 n = head_1;
        while (n != null) {
            linkedListSet_1.add(n.value);
            n = n.next;
        }

    }

    private void printLList_2() {
        Node_2 n = head_2;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }

    private void push2(int i) {
        Node_2 new_node = new Node_2(i);
        new_node.next = head_2;
        head_2 = new_node;

    }


    private void printLList_1() {
        Node_1 n = head_1;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }

    private void push1(int i) {
        Node_1 new_node = new Node_1(i);
        new_node.next = head_1;
        head_1 = new_node;
    }
}
