// http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-list/

// Remove Duplicates from Sorted List

// Given a sorted linked list, delete all duplicates such that each element appear only once.

// Example
// Given 1->1->2, return 1->2.
// Given 1->1->2->3->3, return 1->2->3.

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        while(node.next != null){
            if(node.next.val == node.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }  
}

