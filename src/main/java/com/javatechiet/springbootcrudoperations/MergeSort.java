package com.javatechiet.springbootcrudoperations;



public class MergeSort {

    public void mergeSort(int[] arr){
        if (arr.length<2){
            return;
        }
        int m = arr.length/2;
        int[] lArr = new int[m];
        int[] rArr = new int[arr.length-m];
        for (int i= 0;i<m;i ++){
            lArr[i]=arr[i];
        }
        for (int i = m; i<arr.length; i++){
            rArr[i-m]=arr[i];
        }
        mergeSort(lArr);
        mergeSort(rArr);
        merge(arr,lArr,rArr);
    }

    private void merge(int[] arr, int[] lArr, int[] rArr) {
        int i = 0,j=0,k=0;
        while (i< lArr.length && j< rArr.length){
            if (lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
                k++;
            }
            else {
                arr[k] = rArr[j];
                k++;
                j++;
            }
        }
        while (i< lArr.length){
            arr[k]=lArr[i];
            k++;
            i++;
        }
        while (j< rArr.length){
            arr[k]=rArr[j];
            k++;
            j++;
        }
    }
}
