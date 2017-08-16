/**
 * Creates a "fake" arraylist
 * by implementing the methods in
 * SimpleCollection into an abstract
 * array list.
 * @author Michael Goodrum
 * @version  1.0
 * @since 07-04-2016
 * @param <T> This describes the generic parameter
 */
public class ArrayWrapper<T> implements SimpleCollection<T> {
    private T[] backingArray;
    /**
     * Creates an empty ArayWrapper with
     * 5 empty slots
     */
    public ArrayWrapper() {
        backingArray = (T[]) new Object[5];
    }
    /**
     * Creates an ArrayWrapper with whichever size
     * array is fed to it
     * @param  elems [array of objects]
     */
    public ArrayWrapper(T[] elems) {
        backingArray = (T[]) new Object[elems.length];
        for (int x = 0; x < elems.length; x++) {
            backingArray[x] = elems[x];
        }
    }
    /**
     * Adds one element to the array
     * if array is not large enough it
     * doubles its length
     * @param elem [one single object]
     */
    public void add(T elem) {
        int token = 0;
        boolean nullity = true;
        for (int x = 0; x < backingArray.length; x++) {
            if (backingArray[x] == null) {
                token += 1;
            }
        }
        if (token == 0) {
            T[] temp = (T[]) new Object[backingArray.length * 2];
            for (int x = 0; x < backingArray.length; x++) {
                temp[x] = backingArray[x];
            }
            temp[backingArray.length] = elem;
            backingArray = temp;
        } else {
            for (int x = 0; x < backingArray.length; x++) {
                if (backingArray[x] == null) {
                    backingArray[x] = elem;
                    x = backingArray.length;
                }
            }
        }
    }
    /**
     * Adds all the elements from an array of
     * objects, also doubles in size untill
     * everything can fit
     * @param elems [array of objects]
     */
    public void addAll(T[] elems) {
        for (int x = 0; x < elems.length; x++) {
            add(elems[x]);
        }
    }
    /**
     * Removes one objects from the erray
     * @param  elem [single object]
     * @return      [boolean true if object was in array]
     */
    public boolean remove(T elem) {
        boolean remove = false;
        T[] temp = backingArray;
        T[] temp2 = (T[]) new Object[backingArray.length];
        for (int x = 0; x < temp.length; x++) {
            if (temp[x] == elem) {
                temp[x] = null;
                remove = true;
                x = temp.length;
            }
        }
        if (remove) {
            int token = 0;
            for (int x = 0; x < temp.length; x++) {
                if (temp[x].equals(null)) {
                    token += 1;
                } else {
                    temp2[token] = temp[x];
                }
            } backingArray = temp2;
        } else {
            backingArray = temp;
        }
        return remove;
    }
    /**
     * Removes all elements from the erray present
     * in the fed array of objects
     * @param  elems [Array of objects]
     * @return       [returns true if one of the elements was present/removed]
     */
    public boolean removeAll(T[] elems) {
        boolean removeAll = false;
        boolean removed = false;
        int remove = 0;
        for (int x = 0; x < elems.length; x++) {
            removed = remove(elems[x]);
            if (removed) {
                remove += 1;
            }
        }
        if (remove > 0) {
            removeAll = true;
        }
        return removeAll;
    }
    /**
     * Checks to see if array contains element
     * @param  elem [single object]
     * @return      [returns true if element is within array]
     */
    public boolean contains(T elem) {
        boolean contains = false;
        for (int x = 0; x < backingArray.length; x++) {
            if (backingArray[x].equals(elem)) {
                contains = true;
            }
        } return contains;
    }
    /**
     * Returns element at given position
     * @param  index [value of position desired]
     * @return       [object at given position]
     */
    public T get(int index) {
        if (index < 0 || index > backingArray.length) {
            return null;
        } else {
            return backingArray[index];
        }
    }
    /**
     * Returns the amount of objects in the array
     * @return [integer with value]
     */
    public int size() {
        int size = 0;
        for (int x = 0; x < backingArray.length; x++) {
            if (backingArray[x] != null) {
                size++;
            }
        }
        return size;
    }
    /**
     * Returns the full size of the array including nulls
     * @return [integer with value]
     */
    public int capacity() {
        return backingArray.length;
    }
    /**
     * Empties the array and starts it back with 5 blank spaces
     */
    public void clear() {
        backingArray = (T[]) new String[5];
    }
    /**
     * Checks to see if anything is in the array
     * @return [true if only  nulls]
     */
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int x = 0; x < backingArray.length; x++) {
            if (backingArray[x] != null) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }
    /**
     * Prints the array starting with "[" and seperating elements
     * with "," ends the array with "]"
     * @return [string representation of the array]
     */
    public String toString() {
        String output = "[";
        int c = size();
        for (int x = 0; x < c - 1; x++) {
            if (backingArray[x] != null) {
                output += backingArray[x] + ", ";
            }
        }
        if (c == 0) {
            output += "]";
        } else {
            output += backingArray[c - 1] + "]";
        }
        return output;
    }
}