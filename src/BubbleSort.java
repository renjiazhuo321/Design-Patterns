/**
 * 冒泡排序
 */

public class BubbleSort {

    /**
     * 经过一轮交换，最后的元素是最大的或者是最小的，类似冒泡，交换z次后，再次循环N-z的次数，一直循环到最后
     *
     * @param args
     */
    public static void main(String[] args) {
        int arrays[] = {10, 9, 56, 19, 28, 37, 34, 80, 20, 1, 65, 94, 82};
        bubbleSort(arrays, arrays.length);
    }

    /**
     * 比较两个数字，如果前面的比后面的大就交换，也就是左边比右边数字大，就交换顺序,每次交换后下次循环的次数就比上一次少1，直到最后循环次数为0就代表没有数字了
     *
     * @param arrays
     */
    public static void bubbleSort(int[] arrays, int end) {
        if (arrays != null && arrays.length > 1) {
            for (int i = 0; i < end - 1/*这个位置因为是两个数字比较，所以只需要循环到倒数第二个数字为左边数字，i+1就是最后的数字，不然会数组越界*/; i++) {
                if (arrays[i]/*左边数字*/ > arrays[i + 1]/*右边数字*/) {
                    int tem = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = tem;
                }
            }
        }
        /**== 个人习惯用递归，可以直接用for循环==*/
        /**========================下面是多次循环，每次由于找到了最大的数，所以需要去除最大的数再次循环==============================**/
        end = end - 1;
        if (end == 0) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);
            }
            return;
        }
        bubbleSort(arrays, end);/*递归，每次循环次数-1*/
    }
}
