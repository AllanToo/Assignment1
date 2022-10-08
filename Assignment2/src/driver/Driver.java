package driver;


import java.io.BufferedReader;
import utilities.Sorting;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import Compare.areaCompare;
import Compare.volumeCompare;
import Objects.Cone;
import Objects.Cylinder;
import Objects.OctagonPrism;
import Objects.PentagonPrism;
import Objects.Pyramids;
import Objects.Shape;
import Objects.SquarePrism;
import Objects.TriangularPrism;

/*
 * Assingment 1 CPRG311-C
 * Instructor: Helder Oliveira
 * @author Allan To
 * @author Justin Gil
 * @author Paul K. Holck
 * @author Xyrille Tugade
 * version October 8, 2022
 * This driver class reads and adds the desired text file to an array called shapeArray
 * Call sorting method from the sorting class from utilities package
 */


public class Driver {
   
	
	public static void main(String[] args) throws IOException
	{    
		    int count = 0;
		      
		      String fileWithF = args[0].substring(1); // f + file 
		      String file = fileWithF.substring(1);// file ( e.g: polyfor1.txt)
		      
		     
		    
		    if (file.equals("polyfor1.txt"))
		    {
		    	count = 20237;
		    }
		    if (file.equals("polyfor3.txt"))
		    {
		    	count = 472956;
		    }
		    if (file.equals("polyfor5.txt"))
		    {
		    	count = 1078499;
		    }
		    if (file.equals("fpolyNameBIG.txt"))
		    {
		    	count = 8388608;
		    }
		    
		    Shape[] shapeArray = new Shape[count];
		    String line = " ";
		   
		    try {
			BufferedReader br = new BufferedReader( new FileReader(file));
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
		    int ignore ; 
			String shape ;
		    double num1;
		    double num2;
		    int position = 0;
		    //move the pointer to the second element of the text file
		    if(st.hasMoreTokens())
			{
		    	
				ignore =  (int) Double.parseDouble(st.nextToken());
			
			}
			
			while(st.hasMoreTokens())
			{
			  
				shape = st.nextToken();
				num1 = Double.parseDouble(st.nextToken());
				num2 = Double.parseDouble(st.nextToken());
				  		
			if (shape.equals("Cone"))
			   {
				   Cone cone = new Cone (shape, num1, num2);
				   shapeArray[position] = cone;
			
				   
			   }
			   
			   else if (shape.equals("Cylinder")) 
			   {
				   Cylinder cylinder = new Cylinder(shape, num1, num2);
				   shapeArray[position] = cylinder;
				
			   }
			   
			   else if (shape.equals("Pyramid")) 
			   {
				   Pyramids pyramid = new Pyramids(shape, num1, num2);
				   shapeArray[position] = pyramid;
			
			   }
			   
			   else if (shape.equals("SquarePrism")) 
			   {
				   SquarePrism squarePrism = new SquarePrism ( shape, num1, num2);
				   shapeArray[position] = squarePrism;
			
			   }
			   else if (shape.equals("TriangularPrism")) 
			   {
				   TriangularPrism triangularPrism = new TriangularPrism (shape, num1, num2);
				   shapeArray[position] = triangularPrism;
				
			   }
			   
			   else if (shape.equals("PentagonalPrism")) 
			   {
				   PentagonPrism pentagonPrims = new PentagonPrism ( shape, num1, num2);
				   shapeArray[position] = pentagonPrims;
				 
			   }
			   
			   else if (shape.equals("OctagonalPrism")) 
			   {
				   OctagonPrism octagonPrism = new OctagonPrism (shape, num1, num2);
				   shapeArray[position] = octagonPrism;
				  
			   }
			   
                
				
				position++;
				
			}
			
			
		
		    }catch (FileNotFoundException e) {
		
			e.printStackTrace();
		    }
		  
	
		    /*
		     * Selection sort by height
		     * @param shapeArray
		     * @return array with sorted height
		     */
		    if(args[1].equals("-Th") && args[2].equals("-Ss"))
		    {
		      
              Sorting.selectionSortHeight(shapeArray);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].getHeight() );
              }
		    }
		    /*
		     * Insertion sort by height
		     * @param shapeArray
		     * @return array with sorted height
		     */	
		    if(args[1].equals("-Th") && args[2].equals("-Si"))
		    {
		      
              Sorting.insertionSort(shapeArray);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].getHeight() );
              }
		    }
		    /*
		     * Bubble sort by height
		     * @param shapeArray
		     * @return array with sorted height
		     */
		    
		    if(args[1].equals("-Th") && args[2].equals("-Sb"))
		    {
		      
              Sorting.bubbleSortHeight(shapeArray);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].getHeight() );
              }
		    }
		    /*
		     * Merge sort by height
		     * @param shapeArray
		     * @return array with sorted height
		     */
		    if(args[1].equals("-Th") && args[2].equals("-Sm"))
		    {
		      
              Sorting.mergeSortHeight(shapeArray);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].getHeight() );
              }
		    }
		    /*
		     * Selection sort by volume
		     * @param shapeArray, volumeCompare vc objects
		     * @return array with sorted volume
		     */
		    if(args[1].equals("-Tv") && args[2].equals("-Ss"))
		    {
		      volumeCompare vc = new volumeCompare();
              Sorting.selectionSort(shapeArray, vc);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcVolume() );
              }
		    }
		    
		
		    /*
		     * Insertion sort by volume
		     * @param shapeArray, volumeCompare vc objects
		     * @return array with sorted volume
		     */
		    if(args[1].equals("-Tv") && args[2].equals("-Si"))
		    {
		      volumeCompare vc = new volumeCompare();
              Sorting.bavinsertionSort(shapeArray, vc);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcVolume() );
              }
		    }
		    /*
		     * Bubble sort by volume
		     * @param shapeArray, volumeCompare vc objects
		     * @return array with sorted volume
		     */
		    if(args[1].equals("-Tv") && args[2].equals("-Sb"))
		    {
		      volumeCompare vc = new volumeCompare();
              Sorting.bubbleSort(shapeArray, vc);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcVolume() );
              }
		    }
		    
		    /*
		     * Merge sort by volume
		     * @param shapeArray, volumeCompare vc objects
		     * @return array with sorted volume
		     */
		    if(args[1].equals("-Tv") && args[2].equals("-Sm"))
		    {
		      volumeCompare vc = new volumeCompare();
              Sorting.mergeSort(shapeArray, vc);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcVolume() );
              }
		    }
		    
		    
		    /*
		     * Selection sort by area 
		     * @param shapeArray, areaCompare ac objects
		     * @return array with sorted base area
		     */
		    if(args[1].equals("-Ta") && args[2].equals("-Ss"))
		    {
		      areaCompare ac = new areaCompare();
              Sorting.selectionSort(shapeArray, ac);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcBaseArea() );
              }
		    }
		    
		    /*
		     * Insertion sort by area 
		     * @param shapeArray, areaCompare ac objects
		     * @return array with sorted base area
		     */
		    if(args[1].equals("-Ta") && args[2].equals("-Si"))
		    {
		      areaCompare ac = new areaCompare();
              Sorting.bavinsertionSort(shapeArray, ac);;
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcBaseArea() );
              }
		    }
		    
		    /*
		     * Bubble sort by area 
		     * @param shapeArray, areaCompare ac objects
		     * @return array with sorted base area
		     */
		    if(args[1].equals("-Ta") && args[2].equals("-Sb"))
		    {
		      areaCompare ac = new areaCompare();
              Sorting.bubbleSort(shapeArray, ac);;
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcBaseArea() );
              }
		    }
		    
		    /*
		     * Merge sort by area 
		     * @param shapeArray, areaCompare ac objects
		     * @return array with sorted base area
		     */
		    if(args[1].equals("-Ta") && args[2].equals("-Sm"))
		    {
		      areaCompare ac = new areaCompare();
              Sorting.mergeSort(shapeArray, ac);
              for(int i = 0; i < shapeArray.length ; i = i + 1000	)
              {
             	  System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcBaseArea() );
              }
		    }
		    
		    
          
	
}
}


