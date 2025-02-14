
package es.uvigo.esei.aed1.activity0.exercise18;

import static es.uvigo.esei.aed1.activity0.exercise18.Activity0Exercise18.readNumber;
import static es.uvigo.esei.aed1.activity0.exercise18.Activity0Exercise18.readMatrix;
import static es.uvigo.esei.aed1.activity0.exercise18.Activity0Exercise18.searchMatrix;


public class TestActividad0Exercise18 {
  public static void main(String[] args) {
    
      //exercise 18
      int[][] matrix = new int[5][5];
      readMatrix(matrix);
      
      int number = readNumber("enter the number to search for: ");
      searchMatrix(matrix, number);
  } 
}
