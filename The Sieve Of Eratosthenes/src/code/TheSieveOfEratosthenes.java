package code;

import java.util.Scanner;

public class TheSieveOfEratosthenes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[20000];
		
		for (int x = 0; x < array.length; x++)
		{
			array[x] = x+1;
		}
		
		for (int eliminater = 2; eliminater < array.length; eliminater++)
		{
			for(int x = 0; x < eliminater-1; x++)
			{
				if( (array[x] % eliminater) == 0)
				{
					array[x] = 0;
				}
			}
		}
		
		array[1] = 0;
		
		for (int eliminater = 2; eliminater < array.length; eliminater++)
		{
			for(int x = eliminater+1; x < array.length; x++)
			{
				if( (array[x] % eliminater) == 0)
				{
					array[x] = 0;
				}
			}
		}
		
		int number = input.nextInt();
		
		for (int x = 0; x < array.length; x++)
		{
			if(array[number-1] == 0)
			{
				System.out.println("not prime");
				break;
			}
			else 
			{
				System.out.println("prime");
				break;
			}
		}
		
	}

}
