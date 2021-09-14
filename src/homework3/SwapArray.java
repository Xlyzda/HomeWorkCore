package homework3;


public class SwapArray {

    private final String[] swapArray;

    public SwapArray(String[] swapArray) {
        this.swapArray = swapArray;

    }

    public String[] swapEl(int el1, int el2) {
        String elTmp = this.swapArray[el1];
        this.swapArray[el1] = this.swapArray[el2];
        this.swapArray[el2] = elTmp;
        return this.swapArray;
    }


}
