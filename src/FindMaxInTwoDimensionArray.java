import java.util.Scanner;

public class FindMaxInTwoDimensionArray {
  public static void main(String[] args) {
    int choice;
    do {
      Scanner input = new Scanner(System.in);
      int[][] array = createTwoDimensionalArray(input);
      addElementToTwoDimensionalArray(array);
      printTwoDimensionalArray(array);
      findMax(array);
      System.out.println("Do it again?");
      System.out.println("1. Yes");
      System.out.println("0. No");
      System.out.println("Enter your choice: ");
      choice = input.nextInt();
    } while (choice!=0);
  }
  public static void findMax(int[][]array){
    int max = array[0][0];
    int rowIndex=0;
    int columnIndex=0;
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[r].length; c++) {
        if (array[r][c]>max){
          max = array[r][c];
          rowIndex = r;
          columnIndex = c;
        }
      }
    }
    System.out.printf("Max is %d in row %d and column %d",max,rowIndex,columnIndex);
  }
  public static int[][] createTwoDimensionalArray(Scanner input) {
    int[][] array;
    System.out.println("Enter array row size");
    int rowSize = input.nextInt();
    System.out.println("Enter array column size");
    int columnSize = input.nextInt();
    array = new int[rowSize][];
    for (int r = 0; r < rowSize; r++) {
      array[r] = new int[columnSize];
    }
    return array;
  }

  public static void printTwoDimensionalArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%3d ", array[i][j]);
      }
      System.out.println();
    }
  }

  public static void addElementToTwoDimensionalArray(int[][] array) {
    for (int r = 0; r < array.length; r++) {
      for (int c = 0; c < array[r].length; c++) {
        array[r][c] = (int) Math.round(Math.random() * 100);
      }
    }
  }
}
