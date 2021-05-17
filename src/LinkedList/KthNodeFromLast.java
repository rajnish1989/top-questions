package LinkedList;

public class KthNodeFromLast {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next= new ListNode(6);
        System.out.println(findKthFromLast(head, 4));
    }

    private static ListNode findKthFromLast(ListNode head, int k) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        int n = k;
        while(k>0 && fast != null){
            fast = fast.next;
            k--;
            count++;
        }

        if(fast == null){
            if(n==count){
                return slow;
            }
            return null;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
