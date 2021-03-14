package helix;

import java.util.ArrayList;
import java.util.List;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) 
    {
    	
    	
    	int M =inMatrix.length;
        int N =inMatrix[0].length;
        
        int top = 0, bottom = M - 1;
        int left = 0, right = N - 1;
 
        int index = 0;
        
        
        int arr[] = new int[M*N];
        for(int i = 0; i < M; i++) {
            int[] r = inMatrix[i];
            for(int j = 0; j < r.length; j++) {
                int number = inMatrix[i][j];
                arr[i*r.length+j] = number;
            }
        }
 
        while (true)
        {
            if (left > right) {
                break;
            }
 
            // print top row
            for (int i = left; i <= right; i++) {
                inMatrix[top][i] = arr[index++];
            }
            top++;
 
            if (top > bottom) {
                break;
            }
 
            // print right column
            for (int i = top; i <= bottom; i++) {
            	inMatrix[i][right] = arr[index++];
            }
            right--;
 
            if (left > right) {
                break;
            }
 
            // print bottom row
            for (int i = right; i >= left; i--) {
            	inMatrix[bottom][i] = arr[index++];
            }
            bottom--;
 
            if (top > bottom) {
                break;
            }
 
            // print left column
            for (int i = bottom; i >= top; i--) {
            	inMatrix[i][left] = arr[index++];
            }
            left++;
        }
        
    	
    	
    	
    	  return inMatrix;
}
    }