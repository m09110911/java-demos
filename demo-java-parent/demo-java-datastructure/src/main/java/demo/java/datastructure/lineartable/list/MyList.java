package demo.java.datastructure.lineartable.list;

public class MyList {
    /**
     * 头 节点插入
     */

    public static void headInsert(ListNode head, ListNode newHead) {
        ListNode old = head;
        head = newHead;
        head.next = old;
    }

    /**
     * 尾节点 插入
     */

    public static void tailInsert(ListNode tail, ListNode newTail) {
        newTail.next = null;
        tail.next = newTail;
    }

    /**
     * 遍历
     */
    public static void forEach(ListNode head) {
        while (head != null) {
            System.out.print(head.value+" ");
            head = head.next;
        }
        System.out.println();
    }

    /**
     * 查找
     *
     * @param head
     * @param value
     * @return
     */
    public static int find(ListNode head, int value) {
        int index = -1;
        int count = 0;
        while (head != null) {
            if (head.value == value) {
                index = count;
            }
            count++;
            head = head.next;
        }

        return index;
    }

    /**
     * 插入
     *
     * @param p
     * @param s
     */
    public static void insert(ListNode p, ListNode s) {
        ListNode next = p.next;
        p.next = s;
        s.next = next;

    }

    /**
     * 删除
     */

    public static void remove(ListNode head, ListNode p) {
        if (p != null && p.next != null) {
            ListNode q = p.next; // 拿到 删除节点的 下一个节点
            p.value = q.value; //将 删除节点的 下一个节点的值 赋值 给 删除节点
            p.next = q.next;
            q = null;
        }

        if (p.next == null) {
            while (head != null) {
                if (head.next != null && head.next == p) {
                    head.next = null;
                    break;
                }
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        forEach(node1); //1 2 3

        ListNode newHead = new ListNode(0);

        headInsert(node1,newHead);

        forEach(newHead);// 0 1 2 3

        ListNode node4 = new ListNode(4);

        tailInsert(node3,node4);
        forEach(newHead); // 0 1 2 3 4


        System.out.println(find(newHead,2)); // 2


        ListNode node5 = new ListNode(5);

        insert(node2,node5);

        forEach(newHead); // 0 1 2 5 3 4

        remove(newHead,node5);

        forEach(newHead); // 0 1 2 3 4

    }

}
