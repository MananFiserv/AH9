import java.util.HashMap;

class ECSource {
    public static <T> boolean isUnivalueList(Node<T> head) {
        HashMap<T, Integer> mp = new HashMap<>();

        while (head != null) {
            mp.put(head.val, mp.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }

        return mp.size() == 1;
    }

    public static void main(String[] args) {
        Node<String> z = new Node<>("z");

        // z
        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(3);
        Node<Integer> x = new Node<>(3);
        Node<Integer> y = new Node<>(2);

        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;

// 2 -> 2 -> 3 -> 3 -> 2

        System.out.println(isUnivalueList(u)); // false
        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
