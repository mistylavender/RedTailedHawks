package com.nighthawk.csa.natasha.assignOne;

public class test {
    public int findRange(int[] array1) {
        int bigNum = 0;
        int smallNum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > bigNum) {
                bigNum = array1[i];
            } else if (array1[i] < smallNum) {
                smallNum = array1[i];
            }
        }
        return bigNum - smallNum;
    }

    public void main(String[] args) {
        int[] arrayexample = {4, 2, 53, 6, 9};
        findRange(arrayexample);
    }
}
