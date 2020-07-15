/**
 * 选择排序
 * 从一组数据种找到最大或者最小的数字，然后放到数据的末尾或者初始，交换z次后，再次循环N-z的次数，一直循环到最后
 */
public class SelectSort {
    public static void main(String[] args) {
        int arrays[] = {10, 9, 56, 19, 28, 37, 34, 80, 20, 1, 65, 94, 82};
        selectSort(arrays, arrays.length);
    }

    public static void selectSort(int[] arrays, int end) {
        int max = 0;
        int position = 0;
        if (arrays == null && arrays.length <= 1) {
            return;
        }

        /*循环end次，因为每次找到了最大数后会-1次数*/
        for (int i = 0; i < end; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                position = i;
            }
        }
        /**
         * 当前循环中最后一个数字和最大的数字交换，最大的数字坐标为position，最后的数字坐标为end-1，并不是所有数组中最后一位，是循环数组中最后一位交换
         */
        int tem = arrays[end - 1];
        arrays[end - 1] = max;
        arrays[position] = tem;

        /**== 个人习惯用递归，可以直接用for循环==*/
        /**========================下面是多次循环，每次由于找到了最大的数，所以需要去除最大的数再次循环==============================**/
        end = end - 1;
        if (end <= 0) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);
            }
            return;
        }
        selectSort(arrays, end);

    }
}
