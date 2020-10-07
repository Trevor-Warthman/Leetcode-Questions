//Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//APPROACH:
//make a dummy to start and append onto it
//While both have elements, append the smaller of the fronts. 
//Then when one is empty, append the entirety of the other one to the back

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        
        //loop while an element exists
        while(l1 != null && l2 != null){
            //if l1 has length and is better, get its val and delete
            if(l1 != null && l1.val <= l2.val){
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            //else then l2 has at least one and it's bigger. get l2 and delete
            else{
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null){
            cur.next = l1;
        }
        else if(l2 != null){
            cur.next = l2;
        }
        return dummy.next;
    }
}
