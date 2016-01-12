package com.algorithms.list;

import java.util.LinkedList;

/**
 * Created by Yilong Meng on 1/12/2016.
 */

public class SwapNodes {
    public static ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;
        head = dummy;

        while(head.next!=null && head.next.next!=null){
            ListNode n1 = head.next;
            ListNode n2 = head.next.next;

            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            head = n1;
        }

        return dummy.next;
    }

    public static void main(String args[]){
        //LinkedList<Integer> ll = new LinkedList<>();

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);

        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        n1 = swapPairs(n1);
        printList(n1);
    }

    public static void printList(ListNode x){
        if(x!=null){
            System.out.print(x.val + " ");
            while(x.next!=null){
                System.out.print(x.next.val + " ");
                x = x.next;
            }
        }
    }
}
