package com.nitincodes;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        if(arr1==arr2){
            System.out.println("are same");
        }
        else{
            System.out.println("not same");
        }
    }
}
/*in this the answer will be "not same", because array is a reference datatype in which the thing which will
be same is their values in the heap memory but in the stack memory the address of both the arrays will be
Different so,m they both are not same arrays.
 */