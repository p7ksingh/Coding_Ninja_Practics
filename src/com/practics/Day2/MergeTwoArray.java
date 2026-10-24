package com.practics.Day2;

public class MergeTwoArray {
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr3= new int[arr1.length+arr2.length];
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]> arr2[j]){
                arr3[k] = arr2[j];
                j++;
                k++;
            }else{
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(i<arr1.length) {
        	arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
        	arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,11,12};
        int[] arr2={2,4,6,7};
       int[] arr3=mergeArr(arr1,arr2);
       for(int i=0; i<arr3.length;i++) {
    	   System.out.print(arr3[i]+" ");
       }
        
    }
}
