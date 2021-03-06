 import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Frank Choukouali
 *
 */

public class TwoDimRaggedArrayUtility {

	
	
	/**
	 * Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum columns for each row is 10 Each row in the file is separated by a new line Each element in the row is separated by a space 
	 * Suggestion: You need to know how many rows and how many columns there are for each row to create a ragged array. 
	 * 1. Read the doubles from the file into an a temporary array [10][10] of Strings which was initialized to nulls. 
	 * 2. Find out how many rows there are (any row that has the first element != null is a valid row) 
	 * 3. Create the array based on the num of rows, i.e. double[][]array = new double[#rows][] 
	 * 4. Determine the number of columns for the first row (any element != null is a valid element) 
	 * 5. Create the first row, i.e. array[0] = new double[#columns] 
	 * 6. Put the values from the temporary array into in the row (don't forget to convert from strings to doubles) 
	 * 7. Repeat for all rows
	 * @param file
	 * @return a two dimensional ragged (depending on data) array of doubles if the file is not empty, returns a null if file is empty
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file)
            throws FileNotFoundException{
		String tempArray[][] = new String[10][];
		double returnData[][];
		Scanner stdin = new Scanner(file);
		int row=0;
		while(stdin.hasNextLine()) {
			String[] tempRow = stdin.nextLine().trim().split(" ");
			tempArray[row] = new String[tempRow.length];
			for(int col=0; col<tempRow.length; col++) 
				tempArray[row][col] = tempRow[col];
			row++;
		}
		stdin.close();
		
		returnData = new double[row][];
		for(int rows=0;rows<tempArray.length; rows++) {
			if(tempArray[rows]!=null) {
				returnData[rows] = new double[tempArray[rows].length];
				for(int cols=0; cols<tempArray[rows].length;cols++)
					returnData[rows][cols]=Double.parseDouble(tempArray[rows][cols]);
			}
			 
		}
		return returnData;
	}
	
	
	/**
	 * Writes the ragged array of doubles into the file. 
	 * Each row is on a separate line within the file and each double is separated by a space.
	 * @param data
	 * @param outputFile
	 * @throws IOException
	 */
	public static void writeToFile(double[][] data,File outputFile)
     throws IOException{
		FileWriter output = new FileWriter(outputFile);
		
		for(int row=0;row<data.length; row++) {
			for(int col=0; col<data[row].length;col++) 
				output.write(data[row][col]+" ");
			
			output.write("\n");
		}
		output.close();
	}
	
	/**
	 *Returns  the total of all the elements of the two dimensional array
	 * @param data- the two dimensional array getting total of
	 * @return the sum of all the elements in the two dimensional array
	 */
	public static double getTotal(double[][] data) {
		double total=0;
		for(int row=0;row<data.length; row++) {
			for(int col=0; col<data[row].length;col++)
				total+=data[row][col];
		}
		return total;
	}
	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param data - the two dimensional array getting the average of
	 * @return the average of the elements in the two dimensional array
	 */
	public static double getAverage(double[][] data) {
		double total=getTotal(data);
		double average =0;
		for(int row=0;row<data.length; row++) {
				average+=data[row].length;
		}
		return (total/average);
	}
	
	/**
	 * Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row- the row index to take the total of (0 refers to the first row)
	 * @return the total of the row
	 */
	public static double getRowTotal(double[][] data,int row) {
		double total_row=0;
		if(data.length > row && row>=0) 
		for(int col=0;col<data[row].length; col++) {
			total_row += data[row][col];
		}
		return total_row;
	}
	
	/**
	 * Returns the total of the selected column in the two dimensional array index 0 refers to the first column. 
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data- the two dimensional array
	 * @param col- the column index to take the total of (0 refers to the first column)
	 * @return  the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double total_col=0;
		for(int row=0;row<data.length; row++) {
			if(col<data[row].length)
				total_col += data[row][col];
		}
		return total_col;
	}
	
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data  - the two dimensional array
	 * @param row  - the row index to find the largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static double getHighestInRow(double[][] data,int row) {
		double highest_row_value = 0;
		if(data.length > row && row>=0) {
			for(int col=0;col<data[row].length; col++) {
				if(data[row][col] >highest_row_value )
					highest_row_value =data[row][col];
			}
		}
		
		return highest_row_value;
	}
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data  - the two dimensional array
	 * @param row - the row index to find the largest element of (0 refers to the first row)
	 * @return the index of the largest element of the row
	 */
	public static int getHighestInRowIndex(double[][] data,int row) {
		int highest_row_index=0;
		if(data.length > row && row>=0) {
			for(int col=0;col<data[row].length; col++) {
				if(data[row][col] ==getHighestInRow(data,row) )
					highest_row_index =col;
			}
		}
		return highest_row_index;
	}
	
	/**
	 * Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row- the row index to find the smallest element of (0 refers to the first row)
	 * @return the smallest element of the row
	 */
	public static double getLowestInRow(double[][] data,int row) {
		double lowest_row_value = 0;
		if(data.length > row && row>=0) {
			for(int col=0;col<data[row].length; col++) {
				if(data[row][col] <lowest_row_value || lowest_row_value == 0 )
					lowest_row_value =data[row][col];
			}
		}
		
		return lowest_row_value;
	}
	
	/**
	 * Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data  - the two dimensional array
	 * @param row- the row index to find the smallest element of (0 refers to the first row)
	 * @return the index of the smallest element of the row
	 */
	public static int getLowestInRowIndex(double[][] data,int row) {
		int lowest_row_index=0;
		if(data.length > row && row>=0) {
			for(int col=0;col<data[row].length; col++) {
				if(data[row][col] ==getLowestInRow(data,row) )
					lowest_row_index =col;
			}
		}
		
		return lowest_row_index;
	}
	
	/**
	 * Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column. 
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the largest element of (0 refers to the first column)
	 * @return the largest element of the column
	 */
	public static double getHighestInColumn(double[][] data,int col) {
		double highest_col_value=0;
		for(int row=0;row<data.length; row++) {
			if(col<data[row].length)
				if(data[row][col]>highest_col_value)
				highest_col_value = data[row][col];
		}
		return highest_col_value;
	}
	
	/**
	 * Returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column. 
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data  - the two dimensional array
	 * @param col- the column index to find the largest element of (0 refers to the first column)
	 * @return the index of the largest element of the column
	 */
	public static int getHighestInColumnIndex(double[][] data,int col) {
		int highest_row_index=0;
		for(int row=0;row<data.length; row++) {
			if(col<data[row].length)
				if(data[row][col]==getHighestInColumn(data,col))
					highest_row_index = row;
		}
		return highest_row_index;
	}
	
	/**
	 * Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column.
	 *  If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data- the two dimensional array
	 * @param col- the column index to find the smallest element of (0 refers to the first column)	
	 * @return the smallest element of the column
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		double lowest_col_value=0;
		for(int row=0;row<data.length; row++) {
			if(col<data[row].length)
				if(data[row][col]<lowest_col_value || lowest_col_value==0 )
					lowest_col_value = data[row][col];
		}
		return lowest_col_value;
	}
	
	/**
	 * Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column. 
	 * If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data- the two dimensional array
	 * @param col- the column index to find the smallest element of (0 refers to the first column)	
	 * @return the index of the smallest element of the column
	 */
	public static int getLowestInColumnIndex(double[][] data,int col) {
		double lowest_col_value=getLowestInColumn(data,col);
		int lowest_row_index=0;
		for(int row=0;row<data.length; row++) {
			if(col<data[row].length)
				if(data[row][col]==lowest_col_value)
					lowest_row_index = row;
		}
		return lowest_row_index;
	}
	
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data - the two dimensional array
	 * @return the largest element in the two dimensional array
	 */
	public static double getHighestInArray(double[][] data) {
		double highest_in_array=0;
		for(int row=0;row<data.length; row++) {
			for(int col=0; col<data[row].length;col++)
				if(data[row][col]>highest_in_array)
					highest_in_array = data[row][col]; 
		}
		return highest_in_array;
	}
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data  - the two dimensional array
	 * @return the smallest element in the two dimensional array
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest_in_array=0;
		for(int row=0;row<data.length; row++) {
			for(int col=0; col<data[row].length;col++)
				if(col<data[row].length)
				if(data[row][col]<lowest_in_array || lowest_in_array==0 )
					lowest_in_array = data[row][col]; 
		}
		return lowest_in_array;
	}
}
