package main;
import trafficLight.TrafficLight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TrafficControlController {

	public static void main(String[] args) {
		TrafficLight test = new TrafficLight();
		//test.start();
		
		Scanner sc = new Scanner(System.in);
		
		List<String> test1 = new ArrayList<>();
		
		test1.add("group1");
		test1.add("group2");
		test1.add("group3");
		test1.add("group4");
		
		Collections.shuffle(test1);
		Collections.shuffle(test1);
		
		
		test1.forEach(n ->
			System.out.println( n)
			);
		
		
		
		
		
	}

}
