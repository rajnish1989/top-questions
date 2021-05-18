package LinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        MergeKSortedList m = new MergeKSortedList();
        ListNode[] lists = {list1, list2, list3};
        ListNode res = m.mergeKLists(lists);
        while(res != null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comp = new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        };

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(comp);
        for(ListNode list : lists){
            if(list != null){
                pq.add(list);
            }
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(!pq.isEmpty()){
            temp.next = pq.poll();
            temp = temp.next;
            ListNode next = temp.next;
            if(next != null){
                pq.add(next);
            }
        }
        return result.next;

    }
}
