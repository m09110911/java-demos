package demo.java.datastructure.lineartable.list;

public class ReverseList {
    /**
     * 翻转链表
     */

    public static ListNode reverse(ListNode head) {

        ListNode pre = null; // 前一个节点指针
        ListNode next = null; // 下一个节点指针

        while (head != null) {
            next = head.next;  //记录当前节点的下一个节点
            head.next = pre; // 将当前节点的下一个节点 设置为 上一个节点

            pre = head; //上一个节点 等于 当前节点
            head = next; // 当前节点等于 当前节点的下一个节点
        }

        return pre;

    }


    /**
     * 取中间节点(偶数个时 取 前面的那个)
     */

    public static ListNode getMid(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head; // 快指针  每次 走2步

        ListNode slow = head; // 慢指针 每次走一步

        // 遍历结束后， 慢指针的节点 就是 中间节点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        System.out.println(getMid(node1).value);

        ListNode newHead = reverse(node1);
        MyList.forEach(newHead);

    }

}
