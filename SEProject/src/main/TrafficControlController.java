package main;
import trafficLight.TrafficLight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import gui.GUIRunner;

public class TrafficControlController {

	public static void main(String[] args) {
		// Calls thread to begin executing
		TrafficLight test = new TrafficLight();
		test.start();
		
		//Calls interface to open
		GUIRunner.main();
		
		
	}

}
