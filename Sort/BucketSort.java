package Sort;

import java.util.LinkedList;
import java.util.List;

/*    排序原理：
    顺序从待排数组中取出数字,首先6被取出,然后把6入6号桶,这个过程类似这样:空桶[ 待排数组[ 0 ] ] = 待排数组[ 0 ]
    [6 2 4 1 5 9]           待排数组
    [0 0 0 0 0 0 6 0 0 0]   空桶
    [0 1 2 3 4 5 6 7 8 9]   桶编号(实际不存在)
    顺序从待排数组中取出下一个数字,此时2被取出,将其放入2号桶,是几就放几号桶
    [6 2 4 1 5 9]           待排数组
    [0 0 2 0 0 0 6 0 0 0]   空桶
    [0 1 2 3 4 5 6 7 8 9]   桶编号(实际不存在)
    3,4,5,6省略,过程一样,全部入桶后变成下边这样
    [6 2 4 1 5 9]           待排数组
    [0 1 2 0 4 5 6 0 0 9]   空桶
    [0 1 2 3 4 5 6 7 8 9]   桶编号(实际不存在)
 */
public class BucketSort extends Sort {
    private int range = 0;
    public BucketSort(int range) {
        this.range = range;
    }
    @Override
    public int[] doSort(int[] arr) {
        @SuppressWarnings("unchecked")
        // 构造辅助数组
        List<Integer> [] aux = new LinkedList[range];
        for(int i = 0; i < aux.length; i++){
            aux[i] = new LinkedList<Integer>();
        }
        for(int i = 0; i < arr.length; i++){
            // 找打元素在桶中的位置，并将其添加
            aux[arr[i]].add(arr[i]);
        }
        for(int i = 0, j = 0; i < aux.length && j < arr.length; i++){
            for(int v : aux[i]){
                arr[j] = v;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Sort sort = new BucketSort(10);
        sort.printOrder(new int []{4, 1, 3, 2, 6, 9, 9});
    }

}
