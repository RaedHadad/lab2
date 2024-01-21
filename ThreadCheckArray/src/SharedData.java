public class SharedData {
    private int[] array;

    private boolean[] winArray;

    private boolean flag;

    private final int b;

    /**
     * Constructs a new SharedData object with the specified integer array and constant 'b'.
     *
     * @param array The integer array to be encapsulated.
     * @param b     The constant integer 'b'.
     */
    public SharedData(int[] array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Gets the encapsulated boolean array 'winArray'.
     *
     * @return The encapsulated boolean array 'winArray'.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the  boolean array 'winArray'.
     *
     * @param winArray The boolean array to be encapsulated.
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Gets the integer array .
     *
     * @return The integer array .
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Gets integer 'b'.
     *
     * @return integer 'b'.
     */
    public int getB() {
        return b;
    }

    /**
     * Gets the value of the flag.
     *
     * @return The value of the flag.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag.
     *
     * @param flag The new value of the flag.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}