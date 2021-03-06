package hw3;

import java.util.ArrayList;
import java.util.Scanner;

import api.Jewel;

/**
 * Utility class that isolates the fundamental array algorithms needed
 * for implementation of the Bejeweled game.  Also includes some useful
 * methods for converting strings into arrays of Jewel objects.
 */
public class Util
{
  /**
   * Private constructor disables instantiation.
   */
  private Util()
  {    
  }
  
  /**
   * Finds all runs of three or more Jewels of matching type in the 
   * given array. The return value is a list of the indices of all
   * elements that are part of some run.  The given array is not modified.
   * Caller should ensure that there are no null elements in the given
   * array.
   * @param arr
   *   array of Jewels
   * @return
   *   indices of all Jewels that are part of a run
   */
  public static ArrayList<Integer> findRuns(Jewel[] jewelArray)
  {

	int i = 1;
	ArrayList<Integer> runPositions = new ArrayList<Integer>();
	for (int jewelPosition = 0; jewelPosition < jewelArray.length; jewelPosition++)
	{
		if (jewelPosition >= 2)
		{
			int currentJewel = jewelArray[jewelPosition].getType();
			int priorJewel = jewelArray[jewelPosition - 1].getType();
			int twoJewelsBefore = jewelArray[jewelPosition - 2].getType();
			
			if (currentJewel == priorJewel && currentJewel == twoJewelsBefore)
			{
				if (!(runPositions.contains(jewelPosition) || runPositions.contains(jewelPosition - 1) || runPositions.contains(jewelPosition - 2)))
				{
					runPositions.add(jewelPosition - 2);
					runPositions.add(jewelPosition - 1);
					runPositions.add(jewelPosition);
					
					if (i > jewelPosition - jewelArray.length)
						i = 0; 
					while (currentJewel == jewelArray[jewelPosition + i].getType())
					{
						if (!(runPositions.contains(jewelPosition + i)))
						{
						runPositions.add(jewelPosition + i);
						}
					}
					
				}
				
			}
			
		}
		
	}  
	runPositions.add(1);
	return runPositions;
}
  
  /**
   * Shifts all non-null elements in the array to the right without
   * changing the order.  This operation modifies the given array.
   * The return value is a list of the indices of elements that 
   * were actually shifted by this operation, ordered left to right
   * (this means the index of the element in the modified array, 
   * not the original). 
   * @param arr
   *   array of Jewel objects, possibly containing null cells
   * @return
   *   list of the new indices of moved elements
   */
  public static ArrayList<Integer> shiftNonNullElements(Jewel[] arr)
  {
    // TODO
    return null;
  }
  
  /**
   * Creates an array of Jewel objects from a string of 
   * numbers separated by whitespace.
   * @param values
   *   string containing values for the Jewel types
   * @return
   *   array of Jewel objects with types determined by the given string
   */
  public static Jewel[] createFromString(String values)
  {
    ArrayList<Jewel> temp = new ArrayList<>();
    Scanner scanner = new Scanner(values);
    while (scanner.hasNextInt())
    {
      int value = scanner.nextInt();
      temp.add(new Jewel(value));
    }
    Jewel[] ret = temp.toArray(new Jewel[0]);
    return ret;
  }
  
  /**
   * Returns a grid initialized from an array of strings.  Each string
   * consists of numbers, separated by whitespace, for the Jewel types for 
   * the corresponding row of the grid.  Throws IllegalArgumentException
   * if the strings in the array do not all contain the same number of
   * values.
   * @param descriptor
   *   array of strings containing numbers
   * @return
   *   a 2D array of Jewel objects whose types are determined by the
   *   given strings
   */
  public static Jewel[][] createFromStringArray(String[] descriptor)
  {
    int height = descriptor.length;
 
    // creates an uninitialized array of Jewel[]
    Jewel[][] grid = new Jewel[height][];
    
    // make rows from the strings of the given array
    for (int row = 0; row < height; row += 1)
    {
      grid[row] = createFromString(descriptor[row]);
    }
    
    // sanity check that all rows are the same length
    int width = grid[0].length;
    for (int row = 1; row < height; row += 1)
    {
      if (grid[row].length != width)
      {
        throw new IllegalArgumentException("Rows of descriptor are not the same length.");
      }
    }

    return grid;
  }
  
  /**
   * Returns a String representation of the given 2D array, with rows
   * delimited by newlines.
   */
  public static String convertToString(Jewel[][] grid)
  {
    StringBuilder sb = new StringBuilder();
    for (int row = 0; row < grid.length; ++row)
    {
      for (int col = 0; col < grid[0].length; ++col)
      {
        Jewel jewel = grid[row][col];
        String s = String.format("%2s",
            (jewel == null ? "*" : "" + jewel.getType()));
        sb.append(s);
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
