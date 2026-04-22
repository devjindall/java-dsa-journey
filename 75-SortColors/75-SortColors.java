// Last updated: 4/22/2026, 9:08:49 PM
class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);

    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }


    void mergeSort(int nums[],int start,int end){
        if(start>=end) {
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }


    void merge(int nums[],int start,int mid,int end){
        
        int i = start;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[end-start+1];
        while(i<=mid && j<=end){
            if(nums[i] > nums[j]){
                temp[k++] = nums[j++];
            }

            else{
                temp[k++] = nums[i++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=end){
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
        nums[start + x] = temp[x];
        }

    }


    
}