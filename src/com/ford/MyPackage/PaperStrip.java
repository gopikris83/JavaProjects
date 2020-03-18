package com.ford.MyPackage;

public class PaperStrip {

    public static int minPieces(int[] original, int[] desired) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int strips = original.length;
        System.out.println("Original:"+strips);
        System.out.println("Desired:"+desired.length);

        for(int i = 0; i<original.length-1; i++){
            for (int j=0; j<desired.length-1; j++){
                if ((original[i]== desired[j])&&(original[i+1]== desired[j+1])) {
                    strips--;
                    System.out.println("Inside Loop Strips:"+strips);
                }
            }
        }
        return strips ;
    }

    public static void main(String[] args) {
        int[] original = new int[]{1, 4, 3, 2 };
        int[] desired = new int[]{1, 2, 4, 3 };
        System.out.println(PaperStrip.minPieces(original, desired));
    }
}
