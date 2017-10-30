package hw3;

import api.Jewel;
import java.util.*;

public class JewelFactory
    {
        
        private int max;
        
        Random      jewel = new Random();
        
        
        
        
        
        /**
         * Constructs a JewelFactory that will create Jewel objects with types 0 through
         * givenMaxType - 1
         * 
         * @param givenMaxType
         *            number of types of Jewels
         */
        public JewelFactory(int givenMaxType)
            {
                max = givenMaxType;
            }
            
            
            
            
            
        /**
         * constructs a jewelfactory that will create jewels with types 0 -
         * givenMaxType-1, using the given Random instance
         * 
         * @param givenMaxType
         *            number of types of jewels
         * @param rand
         *            random number generator to use
         */
        public JewelFactory(int givenMaxType, java.util.Random rand)
            {
                max = givenMaxType;
                jewel = rand;
            }
            
            
            
            
            
        /**
         * Returns a random instance of Jewel with a type that is less than this
         * factory's maximum value.
         * 
         * @return a jewel object with randomly selected type
         */
        public Jewel generate()
            {
                
                Jewel jewelA = new Jewel(jewel.nextInt(max));
                
                return jewelA;
            }
            
            
            
            
            
        /**
         * Creates a grid of the given width and height with random jewels less than
         * maximum type, The jewels are produced using this factory's random number
         * generator, where the random selection is restricted so is restricted so that
         * the resulting grid has no runs.
         * 
         * @param width
         *            number of column for the created grid
         * @param height
         *            number of rows for the created grid
         * @return a 2d array of randomly selected jewel objects that contains no runs
         */
        public Jewel[][] createGrid(int width, int height)
            {
                Jewel[][] jewelGrid = new Jewel[height][width];
                
                jewelGrid[0][0] = new Jewel(jewel.nextInt(max));
                for (int i = 1; i < jewelGrid.length; i++)
                    {
                        
                        jewelGrid[i][0] = generate();
                        if (jewelGrid[i][0] == jewelGrid[i - 1][0] && jewelGrid[i][0] == jewelGrid[i - 2][0])
                            {
                                if (jewelGrid[i][0].getType() == 0)
                                    {
                                        jewelGrid[i][0] = new Jewel(jewel.nextInt(max) + 1);
                                    }
                                if (jewelGrid[i][0].getType() == max)
                                    {
                                        jewelGrid[i][0] = new Jewel(jewel.nextInt(max) - 1);
                                        
                                    } else
                                    {
                                        jewelGrid[i][0] = new Jewel(jewel.nextInt(jewelGrid[i][0].getType()));
                                    }
                            }
                            
                    }
                    
                ArrayList<Jewel> b = new ArrayList<Jewel>();
                for (int j = 0; j < jewelGrid.length; j++)
                    {
                        
                        for (int i = 1; i < jewelGrid[j].length; i++)
                            {
                                
                                jewelGrid[j][i] = generate();
                                if (i >= 2)
                                    {
                                        
                                        int currentJewel = jewelGrid[j][i].getType();
                                        int priorJewel = jewelGrid[j][i - 1].getType();
                                        int twoBefore = jewelGrid[j][i - 2].getType();
                                        
                                        if (currentJewel == priorJewel && currentJewel == twoBefore)
                                            {
                                                
                                                if (currentJewel == 0)
                                                    {
                                                        jewelGrid[j][i] = new Jewel(jewel.nextInt(max) + 1);
                                                    }
                                                if (currentJewel == max - 1)
                                                    {
                                                        jewelGrid[j][i] = new Jewel(jewel.nextInt(max) - 1);
                                                        
                                                    } else
                                                    {
                                                        jewelGrid[j][i] = new Jewel(
                                                                jewel.nextInt(jewelGrid[j][i].getType()));
                                                        
                                                    }
                                            }
                                            
                                    }
                            }
                    }
                    
                return jewelGrid;
                
            }
            
    }
