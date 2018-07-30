/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;

/**
 *
 * @author Alexander Barros
 */
public class JavaApplication1 {

    static void print(int mat[][], String num)
	{
	int size = 5 * num.length();
		// If in matrix row number is even then print "-"
		// otherwise print "|"
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < size; j++) {
				if (i % 2 == 0) {
					if (mat[i][j] == 1)
						System.out.print("-");
					else
						System.out.print(" ");
				}
				else {
					if (mat[i][j] == 1)
						System.out.print("|");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static int[][] digit0()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 0, 0, 0, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit1()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 0, 0, 0, 0 },
						{ 0, 0, 1, 0, 0 },
						{ 0, 0, 0, 0, 0 },
						{ 0, 0, 1, 0, 0 },
						{ 0, 0, 0, 0, 0 } };
		return mat;
	}
	static int[][] digit2()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit3()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit4()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 0, 0, 0, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 0, 0, 0, 0 } };
		return mat;
	}
	static int[][] digit5()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit6()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit7()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 0, 0, 0, 0 } };
		return mat;
	}
	static int[][] digit8()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	static int[][] digit9()
	{
		// In matrix 0 used for space
		// and 1 for either - or |
		int mat[][] = { { 0, 1, 0, 1, 0 },
						{ 1, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 1, 0, 1, 0 } };
		return mat;
	}
	
	// Function to check number
	static int[][] checkDigit(int num)
	{
            int[][] result = null ;
		// for digit 0
		if (num == 0)
			result =digit0();
	
		// for digit 1
		else if (num == 1)
			result =digit1();
	
		// for digit 2
		else if (num == 2)
			result =digit2();
	
		// for digit 3
		else if (num == 3)
			result =digit3();
	
		// for digit 4
		else if (num == 4)
			result =digit4();
	
		// for digit 5
		else if (num == 5)
			result =digit5();
	
		// for digit 6
		else if (num == 6)
			result =digit6();
	
		// for digit 7
		else if (num == 7)
			result =digit7();
	
		// for digit 8
		else if (num == 8)
			result =digit8();
	
		// for digit 9
		else if (num == 9)
			result =digit9();
                
                return result;
	}
	
	// Driver program
	public static void main (String[] args) 
	{
		// Input a number
		String num = "234";
                int size = 5 * num.length();
                
                int[][] number = new  int[5][size];
                for(int i = 0; i<num.length(); i++){
                    int[][] digit = checkDigit(Integer.parseInt(num.substring(i,i+1)));
                    
                    for(int j =0 ; j<5;j++){
                        int move = 0;
                        for(int k=(i)*5; k<((i+1)*5);k++){
                            number[j][k]=digit[j][move];
                            move++;
                        }
                    }
                }
                print(number,num);
		// function call to check digit
		
		
	}
    
}
