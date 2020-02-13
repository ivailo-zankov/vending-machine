package storage;

import java.util.LinkedHashMap;
import java.util.Map;

public class Storage<T> {

    private Map<Integer, T> storage = new LinkedHashMap<>();

    public void loadItem(int position, T item) {
        this.storage.put(position, item);
    }

    public void removeItem(int position) {
        this.storage.remove(position);
    }

    public T getItem(int position) {
        return this.storage.get(position);
    }


//
//    public void increaseQuantity(int quantity) {
//        this.quantity += quantity;
//    }

    public int getSize() {
        return storage.size();
    }

    public Map<Integer, T> getStorage() {
        return this.storage;
    }
}
