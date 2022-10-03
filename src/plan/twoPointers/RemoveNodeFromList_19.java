package plan.twoPointers;

public class RemoveNodeFromList_19 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node4 = new ListNode(4, tail);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        int n = 2;

        ListNode next = head;
        int count = 0;
        while(next!=null){
            count++;
            next =  next.next;
        }
        int index = count-n;

        ListNode nthNode = head;
        ListNode prevNode = null;
        int nthIndex = 0;
        while(nthIndex<index){
            prevNode = nthNode;
            nthNode = nthNode.next;
            nthIndex++;
        }
        if(nthNode.next!=null){
            if(prevNode!=null){
                prevNode.next = nthNode.next;
            }
            else{
                head = nthNode.next;
            }

        }
        else{
            if(prevNode!=null){
                prevNode.next = null;
            }
            else{
                head=null;
            }
        }
        System.out.println(head);
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
