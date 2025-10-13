package tutorial_06.activity4;

public class List {
    private int[] els;
    private int size;

    public List() {
        els = new int[0];
        size = 0;
    }

    public void add(int value) {
        int[] newEls = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newEls[i] = els[i];
        }
        newEls[size] = value;
        els = newEls;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) return;
        int[] newEls = new int[size - 1];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                newEls[j] = els[i];
                j++;
            }
        }
        els = newEls;
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return els[index];
    }

    public int getSize() {
        return size;
    }
}

