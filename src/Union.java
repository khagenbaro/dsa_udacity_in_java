

import java.util.HashSet;
import java.util.Set;

/**
 * create two linked list
 * then insert those nodes in the sets
 * then perform intersection on the sets
 */

public class Union {
    static Node1 head1;
    static  Node2 head2;

    class Node1 {
        int data;
        Node1 next;

        Node1(int value) {
            data = value;
            next = null;
        }
    }
    class Node2 {
        int data;
        Node2 next;

        Node2(int value) {
            data = value;
            next = null;
        }
    }

    public static void main(String[] args) {
        Union llist_1 = new Union();
        llist_1.push_1(1);
        llist_1.push_1(2);
        llist_1.push_1(3);
        llist_1.push_1(4);
        llist_1.push_1(6);
        System.out.println("First linked list is ");
        llist_1.printLlist_1();
        Union llist_2 = new Union();
        llist_2.push_2(3);
        llist_2.push_2(4);
        llist_2.push_2(5);
        llist_2.push_2(6);
        llist_2.push_2(7);
        System.out.println("\nSecond linked list is ");
        llist_2.printLlist_2();
        //decalare a set
        Set<Integer> linkedListSet = new HashSet<>();
        llist_1.toSet(linkedListSet);
        System.out.println("\nThe union is :" );
        System.out.println(linkedListSet);
//        Node n = head;
//        Set<Integer> linkedSet1 = new HashSet<>();
//        while (n != null) {
//            linkedSet1.add(n.data);
//            n = n.next;
//        }
//        System.out.println("\nNew set is :");
//        System.out.println(linkedSet1);
//        System.out.println("\n");
//
//
//        Node k = head;
//        Set<Integer> linkedSet2 = new HashSet<>();
//        while (k != null) {
//            linkedSet2.add(k.data);
//            k= k.next;
//        }
//        System.out.println("\nNew set is :");
//        System.out.println(linkedSet2);
//        System.out.println("\n");

//       llist_1.toSet1(llist_1);
////        llist_2.toSet2(llist_2);
//        linkedSet1.addAll(linkedSet2);
//        System.out.println("After union of the two linked list the elements are :");
//        System.out.println(linkedSet1);

    }

    private static void toSet(Set<Integer> linkedListSet) {
        Node1 n =head1;
        while (n!=null){
            linkedListSet.add(n.data);
            n= n.next;
        }
        Node2 k = head2;
        while (k!=null){
            linkedListSet.add(k.data);
            k = k.next;
        }
    }


    private void printLlist_1() {
        Node1 n = head1;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    private void printLlist_2() {
        Node2 n = head2;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private void push_1(int i) {
        Node1 new_node = new Node1(i);
        new_node.next = head1;
        head1 = new_node;
    }
    private void push_2(int i) {
        Node2 new_node = new Node2(i);
        new_node.next = head2;
        head2 = new_node;
    }

}
