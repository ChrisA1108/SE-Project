package main;
import trafficLight.TrafficLight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import camera.CameraMonitoringController;
import gui.GUIRunner;

public class TrafficControlController {

	public static void main(String[] args) {
		// Calls traffic light display in new thread
		TrafficLight lightDisplay = new TrafficLight();
		lightDisplay.start();
		
		//Function call to start camera monitoring controller in new thread
		CameraMonitoringController cameraInput = new CameraMonitoringController();
		cameraInput.start();
		
		//Calls user interface to open
		GUIRunner.main();
		
	}

}
