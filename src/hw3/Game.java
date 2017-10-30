package hw3;

import java.util.ArrayList;
import java.util.Arrays;

import api.GridPosition;


import api.Jewel;



public class Game
    {
        private Jewel[][] grid;
        
        private int score;
        
        private JewelFactory jewelFact;
        
        /**
         * Constructs a game with the given number of columns and rows
         * 
         * @param width
         *            given number of columns
         * @param height
         *            given number of rows
         * @param generator
         *            creates the jewels
         */
        public Game(int width, int height, JewelFactory generator)
            {
                jewelFact = generator;
                grid = new Jewel[width][height];
               
            }
            
            
            
            
            
        /**
         * Constructs a game whose size and initial configuration are determnined by the
         * given string array
         * 
         * @param descriptor
         *            string array
         * @param generator
         *            creates new jewels
         */
        public Game(java.lang.String[] descriptor, JewelFactory generator)
            {
                grid = Util.createFromStringArray(descriptor);
                score = 0;
            }
            
            
            
            
            
        /**
         * Returns the Jewel at the given row and column
         * 
         * @param row
         *            given row in the grid
         * @param col
         *            Given column in the grid
         * @return jewel at the given row and column
         */
        public Jewel getJewel(int row, int col)
            {
                
                
                return grid[row][col];
            }
            
            
            
            
            
        /**
         * Sets the Jewel at the given row and column
         * 
         * @param row
         *            given row in the grid
         * @param col
         *            given column in the grid
         * @param jewel
         *            value to be set
         */
        public void setJewel(int row, int col, Jewel jewel)
            {
                
                grid[row][col] = jewel;
                
                
            }
            
            
            
            
            
        /**
         * returns the height of the grid for this game(number of rows)
         * 
         * @return number of rows in the grid for this game
         */
        public int getHeight()
            {
             
                
                return grid.length;
            }
            
            
            
            
            
        /**
         * returns the current score for this game
         * 
         * @return current score
         */
        public int getScore()
            {
                
                return score;
            }
            
            
            
            
            
        /**
         * Returns a copy of the given row of the grid
         * @param row
         * given row
         * @return
         * a new array containg the jewels fromthe given row
         */
        public Jewel[] getRow(int row) {
            
           Jewel[] jewelA = new Jewel[grid[row].length]; 
           for(int column = 0 ; column < grid[row].length ; column++) {
               jewelA[column] = grid[row][column];
           }
            return jewelA;
        }
        
        
        
        
        
        /**
         * copies the given array values into the specified row of the grid
         * 
         * @param row
         *            given row that will be changed
         * @param arr
         *            array of jewels containg the values for the row
         */
        public void setRow(int row, Jewel[] jewelA)
            {
                for(int column = 0; column < grid[row].length; column++) {
                    grid[row][column] = jewelA[column];
                }
            }
            
            
            
            
            
        /**
         * Returns a copy of the given column of the grid
         * @param col
         * given col
         * @return
         * a newarray containing the Jewels from the given col
         */
        public Jewel[] getCol(int column) {
            Jewel[] columnArr = new Jewel[grid.length];
            
           for(int row = 0; row < grid.length ; row++) {
               
               columnArr[row] = grid[row][column];
           }
            return columnArr;
        }
        
        
        
        
        
        /**
         * copies the given array values into the specified column of the grid.
         * 
         * @param col
         *            given col that will be changed
         * @param arr
         *            array of jewel containing the values for the column
         */
        public void setCol(int column, Jewel[] arr)
            {
                for(int row = 0; row < grid.length; row++) {
                    grid[row][column] = arr[row];
                }
            }
            
            
            
            
            
        /**
         * selects two jewels to switch , must be adjacent, can only switch if the
         * switch will form a run and will return true, otherwise it returns false and
         * the switch will not occur
         * 
         * @param c0
         *            grid position of first jewel
         * @param c1
         *            grid position of adjacent jewel to jewel c0
         * @return true if the two given cells are exchanged, false otherwise
         */
        public boolean select(GridPosition c0, GridPosition c1)
            {
                
                return true;
            }
            
            
            
            
            
        /**
         * Finds runs in the given row of the grid using the Util.findRuns method. the
         * return value is a list of grid positions for each cell that is in the run in
         * left to right order This method does not modify grid or score
         * 
         * @param row
         *            the row in which to find runs
         * @return list of GridPosition objects
         */
        public java.util.ArrayList<GridPosition> findHorizontalRuns(int row)
            {
                
        	 ArrayList<GridPosition> jewelPosition = new ArrayList<GridPosition>();
        	 return jewelPosition;
            }
            
            
            
            
            
        /**
         * Finds runs in the given column of the grid using the method Util.findRuns
         * return value is a list of gridposition objects in top to bottom order does
         * not modify grid or update score
         * 
         * @param col
         *            column chosen to find runs
         * @return gridposition objects for cells that are part of a run
         */
        public java.util.ArrayList<GridPosition> findVerticalRuns(int col)
            {
        	 ArrayList<GridPosition> arrayList = new ArrayList<GridPosition>();
                return arrayList;
            }
            
            
            
            
            
        /**
         * replaces each null cell in the grid with a new Jewel created by a call to
         * this Game's jewel facotry
         * 
         * @return list of GridPosiiton objects for the filled cells
         */
        public java.util.ArrayList<GridPosition> fillAll()
            {
        	// TODO could do an if cell = null then generate new jewel in cell 
        	 ArrayList<GridPosition> arrayList = new ArrayList<GridPosition>();
                return arrayList;
            }
            
            
            
            
            
        /**
         * Shifts the jewels in a given column downward using the
         * Util.shiftNonNullElements. after this method, the null cells will be at the
         * top of the column, order of the Jewels is not changed. Returns a list of
         * gridposition objects for each jewel that was moved by this operation. grid
         * position should be the row and column of the new position
         * 
         * @param col
         *            the given column to shift
         * @return list of grid position objects for elements moved
         */
        public java.util.ArrayList<GridPosition> shiftColumnDown(int col)
            {
        	 	
        	ArrayList<GridPosition> arrayList = new ArrayList<GridPosition>();
                return arrayList;
            }
            
            
            
            
            
        /**
         * finds all horizontal and vertical runs, returns a list of the grid position
         * objects for all cells in the run, list does not have order and can have
         * duplicates, all gridpositions are set to null and score is updated
         * 
         * @return grid postion objects
         */
        public java.util.ArrayList<GridPosition> findAndMarkAllRuns()
            {
                ArrayList<GridPosition> arrayList = new ArrayList<GridPosition>();
				return arrayList ;
            }
            
            
            
            
            
        /**
         * returns a string representation of the grid for this game, with rows
         * delimited by newlines.
         * 
         * @return returns string representation of the grid
         */
        public java.lang.String toString()
            {
                
                return Util.convertToString(grid);
            }





		public int getWidth() 
		{
			// TODO Auto-generated method stub
			return 0;
		}
            
    }
