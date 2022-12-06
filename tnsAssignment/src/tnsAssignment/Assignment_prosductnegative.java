package tnsAssignment;
import java.util.Scanner;

public class Assignment_prosductnegative {

	public static void main (String[] args) {
	int negative=1, positive=1;
	int num [] ={1,2,3,4,5,6,7,-8,-9,12};
	for(int i=0;i<num.length;i++)
	{
	if(num[i]<0)
	{
	negative*=num[i];
	}
	}
	System.out.println("the product of negative is" + negative);
	}
	}
