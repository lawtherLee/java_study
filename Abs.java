public class Abs {
}

abstract class ObjectStorage {
    int objectNum = 0;
    Object[] storage = new Object[100];

    abstract void put(Object o);

    abstract Object get();
}

class Stack extends ObjectStorage {
    private int point = 0;

    public void put(Object o) {
        storage[point++] = o;
        objectNum++;
    }

    public Object get() {
        objectNum--;
        return storage[--point];
    }
}

class Queue extends ObjectStorage {
    private int top = 0, bottom = 0;

    public void put(Object o) {
        storage[top++] = o;
        objectNum++;
    }

    public Object get() {
        objectNum--;
        return storage[bottom++];
    }
}