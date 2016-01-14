package com.algorithms.removeDuplicate;

/**
 * Created by Yilong Meng on 1/14/2016.
 */

import com.algorithms.sort.SortLinkedList;
import com.algorithms.list.ListNode;

public class RemoveDuplicatesFromList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);

        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        n1 = SortLinkedList.insertionSortList(n1);
        SortLinkedList.printList(n1);
        System.out.println("After sorting ListNode");

        n1 = RemoveDuplicatesFromList.deleteDuplicates(n1);
        SortLinkedList.printList(n1);
        System.out.println("After removing duplicates");
    }
}

