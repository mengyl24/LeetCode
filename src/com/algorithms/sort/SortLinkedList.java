/**
 * Insertion Sort List
 * Sort a linked list using insertion sort.
 * Example
 * Given 1->3->2->0->null, return 0->1->2->3->null.
 */

package com.algorithms.sort;

import com.algorithms.list.ListNode;

public class SortLinkedList {
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);

        while (head != null) {
            ListNode node = dummy;
            //System.out.println(node.next);
            while (node.next != null && node.next.val < head.val) {
                //System.out.println("test");
                node = node.next;
            }
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        //System.out.println("atest");
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);

       /* ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);*/

        n1.next = n2;
        n2.next = n3;
        /*n3.next = n4;
        n4.next = n5;
        n5.next = n6;*/

        n1 = insertionSortList(n1);

        printList(n1);

    }

    public static void printList(ListNode x) {
        if(x != null){
            System.out.print(x.val + " ");
            while (x.next != null) {
                System.out.print(x.next.val + " ");
                x = x.next;
            }
            System.out.println();
        }

    }
}
