/* This class implements a "fail-soft" array which prevents
runtime errors.
*/
class FailSoftArray {
    private int a[]; // reference to array
    private int errval; // value to return if get() fails

    public int length; // length is public

    /* Construct array given its size and the value to
    return if get() fails. */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public FailSoftArray(int [] arIn, int errv) {
        this(arIn.length, errv); // = FailSoftArray(len, errv);
        int len = arIn.length;
        for (int i = 0; i < len; i++)
            this.put(i, arIn[i]);
    }

    // Return value at given index.
    public int get(int index) {
        if(ok(index)) return a[index];
        return errval;
    }

    // Put a value at an index. Return false on failure.
    public boolean put(int index, int val) {
        if(ok(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    public void printVals() {
        for (int val : this.a)
            System.out.print(val);
    }

    // Return true if index is within bounds.
    private boolean ok(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }

}