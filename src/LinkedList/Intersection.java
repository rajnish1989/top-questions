package LinkedList;

/*Intersection of two sorted linked lists
*
*
* */

public class Intersection {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        ListNode headB = new ListNode(4);
        ListNode five = new ListNode(5);
        five.next = new ListNode(6);
        headB.next = five;
        headA.next.next.next = five;
        Intersection intersection = new Intersection();
        ListNode res = intersection.findIntersection(headA, headB);
        System.out.println(res);

    }

    public ListNode findIntersection(ListNode headA, ListNode headB){
        if(headA==null || headB==null) return null;
        ListNode tempA = headA, tempB = headB;
        while(tempA != tempB){
            if(tempA == null){
                tempA = headB;
            }
            if(tempB == null){
                tempB = headA;
            }
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
