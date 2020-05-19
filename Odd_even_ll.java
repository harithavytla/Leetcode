class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){return null;}
        ListNode odd=head,even=head.next,link=even;
        while(even!=null&&odd.next.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=link;
        return head;
    }
}