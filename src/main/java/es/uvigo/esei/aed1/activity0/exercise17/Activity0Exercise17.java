
package es.uvigo.esei.aed1.activity0.exercise17;

import java.util.Scanner;


public class Activity0Exercise17 {
    public static final Scanner input = new Scanner(System.in);
  
  //exercise 17
  /**
   * muestra un mensaje por pantalla y lee un número entero de teclado
   * @param message el mensaje a visualizar
   * @return el número entero leido de teclado
   */
  public static int readNumber(String message) {
      System.out.println(message);
    return Integer.parseInt(input.nextLine());
  }
  
  /**
   * muestra un mensaje por pantalla y lee un número real de teclado
   * @param message el mensaje a visualizar
   * @return el número real leido de teclado
   */
  public static double readDouble(String message) {
     System.out.print(message);
     return Double.parseDouble(input.nextLine());
  }

 
  /**
   * muestra un mensaje por pantalla y lee una matriz de números reales
   * @param matrix que almacena números reales
   * @param message el mensaje a visualizar
   */
  public static void readNotes(double[][] matrix, String message) {
      System.out.println(message);
      for(int i = 0;i< matrix.length;i++){
          for (int j=0;j<matrix[0].length;j++){
              matrix[i][j] = readDouble(new StringBuilder().append("Introduce la Nota ").append(j+1).append(" del alumno ").append(i+1).append(": ").toString());
              System.out.println("");
          }
      }
  }
  
  /**
   * muestra por pantalla un mensaje y el contenido de una matriz de números reales
   * @param matrix que almacena numeros reales
   * @param message el mensaje a visualizar
   */
  public static void printNotes(double[][] matrix, String message){
    for(int i = 0;i< matrix.length;i++){
          for (int j=0;j<matrix[0].length;j++){
              System.out.println(new StringBuilder().append("La nota ").append(j+1).append(" del alumno ").append(i+1).append(" es ").append(matrix[i][j]).toString());
          }
      }
  }
}
