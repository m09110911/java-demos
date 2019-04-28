package demo.java.datastructure.lineartable.list;

public class MergeList {
    /**
     * 合并 2个链表
     * <p>
     * 递归方式
     *
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        ListNode newHead = null;

        if (head1.value > head2.value) { // 第一个 链表的 首节点值 大于 第二个链表的 首节点值 时，
            newHead = head2; // 新链表 等于 第二个链表
            // 新链表  递归 赋值， 第一个链表 ， 第二个链表的下一个节点
            newHead.next = merge(head1, head2.next);
        } else {
            newHead = head1;
            newHead.next = merge(head1.next, head2);
        }

        return newHead;

    }

    public static ListNode merge2(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 != null ? head1 : head2;
        }

        // 首节点 值 小的 链表 为 合并 主链表
        ListNode head = head1.value < head2.value ? head1 : head2;

        ListNode c1 = head == head1 ? head1 : head2; // c1 指针

        ListNode c2 = head == head1 ? head2 : head1; // c2 指针

        ListNode pre = null; // 前一个节点
        ListNode next = null; // 后一个节点

        while (c1 != null && c2 != null) {
            if (c1.value <= c2.value) {
                //前一个节点 = c1
                // c1 = c1 的下一个节点
                // c2 不做处理
                pre = c1;
                c1 = c1.next;
            } else {
                // 记录 c2 的下一个节点
                next = c2.next;
                // 前一个节点的 下一个节点 指向 c2
                pre.next = c2;
                // c2 的 下一个节点 等于 c1
                c2.next = c1;
                // 前一个节点 等于 c2
                pre = c2;

                // c2 等于 下一个节点
                c2 = next;
            }
        }

        pre.next = c1 == null ? c2 : c1; //  最后个节点

        return head;

    }


    public static void main(String[] args) {
        ListNode node1 = null, node2 = null;

        ListNode next1 = null, next2 = null;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (node2 == null) {
                    node2 = new ListNode(i);
                } else {
                    ListNode newNode = new ListNode(i);
                    if (next2 == null) {
                        next2 = node2;
                    }
                    MyList.tailInsert(next2, newNode);
                    next2 = newNode;
                }
            } else {
                if (node1 == null) {
                    node1 = new ListNode(i);
                } else {
                    ListNode newNode = new ListNode(i);
                    if (next1 == null) {
                        next1 = node1;
                    }
                    MyList.tailInsert(next1, newNode);
                    next1 = newNode;
                }
            }
        }

        MyList.forEach(node1);
        MyList.forEach(node2);
//
        ListNode newList = merge2(node1, node2);

        MyList.forEach(newList);

        // ListNode newList1 = merge2(node1, node2);

//        MyList.forEach(newList1);

    }
}
