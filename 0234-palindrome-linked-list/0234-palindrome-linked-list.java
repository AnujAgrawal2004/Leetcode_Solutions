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
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> AL=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            AL.add(temp.val);
            temp=temp.next;
        }
        int l=AL.size();
       for(int i=0;i<l/2;i++){
           if(AL.get(i)!=AL.get(l-i-1))
               return false;
       }
        return true;
    }
}