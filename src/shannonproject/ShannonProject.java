/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shannonproject;

import javax.swing.JOptionPane;

/**
 *
 * @author k00214677
 */
public class ShannonProject
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		double rainfall[] = new double[6];
		String month[] =
		{
			"January", "February", "March", "April", "May", "June"
		};

		for (int index = 0; index < rainfall.length; index++)
		{
			String input = JOptionPane.showInputDialog("Rainfall for the month of " + month[index]);
			rainfall[index] = Double.parseDouble(input);
			System.out.println(month[index] + ": " + rainfall[index]);

		}

		double min = minimum(rainfall);
		double avg = average(rainfall);
		System.out.printf("\nThe average rainfall is: %1s", avg);
		System.out.println("\nThe minimum rainfall " + min);
	}

	public static double average(double[] array)
	{
		double total = 0;
		for (int index = 0; index < array.length; index++)
		{
			total += array[index];
		}

		return total / array.length;
	}

	public static double minimum(double[] array)
	{
		double min = array[0];
		for (int index = 1; index < array.length; index++)
		{
			double candidate = array[index];
			if (candidate < min)
			{
				min = candidate;
			}
		}

		return min;
	}
}
