
package es.uvigo.esei.aed1.activity0.exercise16;
import java.util.Scanner;

public class Activity0Exercise16 {

  //exercise 16
  
  /**
   * Calcula el maximo de los enteros almacenados en el array
     *
     * @param array contiene los enteros
     * @return el valor mínimo
     */
    public static int maximum(int[] array) {
        int ret = array[0];
        for (int num : array) {
            if (ret < num) {
                ret = num;
            }
        }
        return ret;
    }

  /**
   * Calcula el mínimo de los enteros almacenados en el array
   * @param array contiene los enteros
   * @return el valor mínimo
   */
  public static int minimum(int[] array) {
    
    int ret = array[0];
    for (int num : array) {
        if (ret > num) {
            ret = num;
        }
    }
    return ret;
  }
/**
 * Calcula el promedio de los enteros almacenados en el array
 * @param array contiene los enteros
 * @return el valor promedio
 */
  public static double average(int[] array) { 
      int n = 0;
      for (int num : array){
          n += num;
      }
    return n/array.length;
  }

  public static int readInteger(String message) {
      System.out.print(message);
    return Integer.parseInt(new Scanner(System.in).nextLine());
  }
  /**
   * almacena enteros en el array haciendo uso del método readInteger
   * @param array que almacenará los enteros
   */
  public static void readArray(int[] array) {
    for(int i = 0;i<array.length;i++){
        array[i] = readInteger(new StringBuilder().append("give me the number in the position ").append((i+1)).append(": ").toString());
    }
  }
  
}
