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
    public ListNode sortList(ListNode head) {
        if(head==null)
            return null;
      
        ListNode l1=head;
        List<Integer> list=new ArrayList<>();
        while(l1!=null){
            list.add(l1.val);
            l1=l1.next;
        }
        Collections.sort(list);
        ListNode n = new ListNode(0);
        head=n;
        ListNode temp=head;
        for(int i=0;i<list.size();i++){
            ListNode n1 = new ListNode(list.get(i));
            temp.next=n1;
            temp=temp.next;
        }
        return head.next;
    }
}