package hashTables;

import java.util.LinkedList;

public class HashTable {

    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        var index = hash(key);
        // create LinkedList if not there
        if(entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var entry = getEntry(key);
        return (entry == null) ? null : entry.value;

    }

    public void remove(int key){
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private Entry getEntry(int key){
        var bucket = getBucket(key);
        if(bucket != null){
            for(var entry : bucket){
                if(entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private int hash(int key){
        return Math.abs(key)%entries.length;
    }
}
