package summary;

import java.util.Arrays;

/**
 * @description:
 * @time:2019/6/12
 */
public class moveZeros {

    public static void main(String[] args) {
        int[] nums = {1,0,0};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void solution(int[] nums) {
       int i;
       int j = 0;

       for (i=0;i<nums.length;i++){
           if (nums[i]!=0){
               nums[j++] = nums[i];
           }

       }
       while(j<nums.length)
       {
           nums[j++] = 0;
       }
          }


    public static void sort(int a[], int low, int high){
        int i,j,index;
        if (low > high){
            return;
        }
        i = low;
        j = high;
        index = a[i];//用子表的第一个记录做基准
        while(i<j){ //从表的两端交替向中间扫描
            while(i<j && a[j] >= index)
                j--;
            if(i < j)
                a[i++] = a[j];//用比基准小的记录替换低位记录
            while(i<j && a[i]< index)
                i++;
            if (i<j)
                a[j--] = a[i];//用比基准大的替换高位记录
        }
        a[i] = index;//将基准数组
        sort(a,low,i-1);//对低子表进行递归排序
        sort(a,i +1,high);//对高子表进行递归排序
    }

    public static void quickSort(int a[]){
        sort(a,0,a.length-1);
    }


}
