class DynamicArray {

    int[] lst = null;
    int size;
    int capacity;

    public DynamicArray(int capa) {
        lst = new int[capa];
        capacity = capa;
        size = 0;
    }

    public int get(int i) {
        return lst[i];
    }

    public void set(int i, int n) {
        lst[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
            lst[size] = n;
        } else {
            lst[size] = n;
        }
        size++;

    }

    public int popback() {
        size--;
        return lst[size];
    }

    private void resize() {
        int[] newLst = new int[capacity * 2];
        capacity = capacity*2;
        for (int i = 0; i<size; i++) {
            newLst[i] = lst[i];
        }
        lst = newLst;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {

        return capacity;
    }
}