package com.internshala.connectfour.javafxapp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {
	public static void main(String[] args) {

		//Use of intStream Class
		//Wap to create  an array for range of values from 0 to 100

		int[] numArray = IntStream.rangeClosed(0,100).toArray();

		//wap to create an Arraylist<Integer> that contains 0 to 100 INTEGERS

	List<Integer> numberList =	IntStream.rangeClosed(0,100) //0,1,2,............100
			.mapToObj(i -> new Integer(i)) //Here we are convrting the integer values to integer Objects
			.collect(Collectors.toList());       //Add all integers Objects to Arraylist<Integer>



	}
}
