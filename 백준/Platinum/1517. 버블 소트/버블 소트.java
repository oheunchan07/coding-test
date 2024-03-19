import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static long count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Long[] arr = new Long[a];
        Long[] mergedArr = new Long[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<a;i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        int left = 0;
        int right  = arr.length - 1;
        mergeSort(arr, left, right, mergedArr);
        System.out.print(count);
    }

    public static void mergeSort(Long[] arr, int left, int right, Long[] mergedArr) {
        if(left != right) {
            int mid = (right + left) / 2;
            mergeSort(arr,left,mid, mergedArr);
            mergeSort(arr,mid+1,right, mergedArr);
            merge(arr,left,right, mergedArr);
        }
    }

    public static void merge(Long[] arr, int left, int right, Long[] mergedArr) {
        int mid = (right + left) / 2;
        int start = mid + 1;
        int left1 = left;
        int left2 = left;

        while(left2 <= mid&&start <= right) {
            if(arr[left2] > arr[start]) {
                count+=(mid - left2 + 1);
                mergedArr[left1++] = arr[start++];
            }
            else
                mergedArr[left1++] = arr[left2++];
        }

        if(left2>mid) {
            while(start<=right)
                mergedArr[left1++] = arr[start++];
        }

        if(start>left2) {
            while(left2<=mid)
                mergedArr[left1++] = arr[left2++];
        }

        for(int i = left;i<= right;i++)
            arr[i] = mergedArr[i];
    }
}