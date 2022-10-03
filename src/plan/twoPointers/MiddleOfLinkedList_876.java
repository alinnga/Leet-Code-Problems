package plan.twoPointers;

public class MiddleOfLinkedList_876 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node4 = new ListNode(4, tail);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        int count = 0;
        ListNode next = head;
        while(next!=null){
            count++;
            next = next.next;
        }
        int middleIndex = count/2;
        int countMiddle=0;

        ListNode middle = head;
        while(countMiddle<middleIndex){
            middle = middle.next;
            countMiddle++;
        }

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
