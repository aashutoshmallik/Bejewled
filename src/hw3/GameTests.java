package hw3;
import java.util.*;
import api.Jewel;
import hw3.Util;


public class GameTests {
	
	
	public static void main(String[] args)
	{
	// descriptor for initial grid of a 3 x 4 game
	String[] desc =
	{
	"2 0 1 3",
	"1 0 1 3",
	"2 1 2 1"
	};

//	JewelFactory generator = new JewelFactory(4);
//	Game g = new Game(desc, generator);
//	System.out.println(g.toString());
//	System.out.println(g.getJewel(2, 1)); // expected 1
//	g.setJewel(2, 1, new Jewel(3));
//	System.out.println(g.getJewel(2, 1)); // expected 3
//	g.setJewel(2, 1, null);
//	System.out.println(g.toString());
//	
//	Jewel[] arr = g.getCol(2);
//	System.out.println(Arrays.toString(arr));
//	System.out.println();
//	Jewel[] testCol = Util.createFromString("5 6 7");
//	g.setCol(1, testCol);
//	System.out.println(g);
//	
//	JewelFactory a = new JewelFactory(10);
//	System.out.println(a.generate()); // changes
//	System.out.println(a.generate()); // changes
//	
//	Random r = new Random(5);
//	JewelFactory b = new JewelFactory(10, r);
//	System.out.println(b.generate()); // stays at 7
//	System.out.println(b.generate()); // stays at 2
//	
//	Jewel[][] array = b.createGrid(10, 10); 
//	 //width(column) of 10 & height(row) 10
//	 //if you replace b with a, should be the same but 
//	//values change every iteration 
//	
//	 /* should look like:
//     * [4, 4]
//     * [6, 5]
//     * [4, 1]
//     */
//	for (Jewel[] row: array)
//	{
//	    System.out.println(Arrays.toString(row));
//	} 
//			
	
//	Jewel[] jewel = new Jewel[5];
//	jewel = Util.createFromString("1 1 1 1");
//	System.out.println(Arrays.toString(jewel));
	Jewel[] jewel2 = new Jewel[5];
	jewel2 = Util.createFromString("1 0 0 0 0 1 1 1 1 2 2 2");
//	System.out.println(Arrays.toString(jewel2));
	ArrayList<Integer> result = Util.findRuns(jewel2);
	System.out.println(result);  // expect [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	
			
	
	}
	}
