package Digi;

public class SimpleHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size;

    public SimpleHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public SimpleHashMap(int capacity) {
        buckets = new Entry[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            Entry<K, V> current = buckets[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newEntry;
        }
        size++;

        // Check if resizing is needed
        if (size > buckets.length * 0.75) {
            resize();
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        Entry<K, V>[] newBuckets = new Entry[newCapacity];
        for (Entry<K, V> entry : buckets) {
            Entry<K, V> current = entry;
            while (current != null) {
                int newIndex = Math.abs(current.key.hashCode()) % newCapacity;
                Entry<K, V> newEntry = new Entry<>(current.key, current.value);
                if (newBuckets[newIndex] == null) {
                    newBuckets[newIndex] = newEntry;
                } else {
                    Entry<K, V> newCurrent = newBuckets[newIndex];
                    while (newCurrent.next != null) {
                        newCurrent = newCurrent.next;
                    }
                    newCurrent.next = newEntry;
                }
                current = current.next;
            }
        }
        buckets = newBuckets;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Value for 'one': " + map.get("one")); // Should print 1
        System.out.println("Value for 'two': " + map.get("two")); // Should print 2
        System.out.println("Value for 'three': " + map.get("three")); // Should print 3
    }
}
