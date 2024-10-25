import java.util.LinkedList;

class Question6MyHashMap {
    static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int nodes;
    private LinkedList<Node>[] buckets;

    // Constructor
    public Question6MyHashMap() {
        buckets = new LinkedList[5];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        this.nodes = 0;
    }

    private int searchInBucket(int key, LinkedList<Node> ll) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        int bi = (Math.abs(key) % buckets.length);
        LinkedList<Node> ll = buckets[bi];
        int li = searchInBucket(key, ll);

        if (li != -1) {
            ll.get(li).value = value;
        } else {
            ll.add(new Node(key, value));
            nodes++;

            if (nodes > buckets.length * 0.75) {
                resize();
            }
        }
    }

    public int get(int key) {
        int bi = (Math.abs(key) % buckets.length);
        LinkedList<Node> ll = buckets[bi];
        int li = searchInBucket(key, ll);

        if (li != -1) {
            return ll.get(li).value;
        }
        return -1;
    }

    public void remove(int key) {
        int bi = (Math.abs(key) % buckets.length);
        LinkedList<Node> ll = buckets[bi];
        int li = searchInBucket(key, ll);

        if (li != -1) {
            ll.remove(li);
            nodes--;
        }
    }

    private void resize() {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (LinkedList<Node> ll : oldBuckets) {
            for (Node node : ll) {
                put(node.key, node.value);
            }
        }
    }

    public static void main(String[] args) {
        Question6MyHashMap myMap = new Question6MyHashMap();
        myMap.put(1, 1);
        myMap.put(2, 2);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(3));
        myMap.put(2, 1);
        System.out.println(myMap.get(2));
        myMap.remove(2);
        System.out.println(myMap.get(2));
    }
}
