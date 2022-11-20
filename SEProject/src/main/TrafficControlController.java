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
		// Calls thread to begin executing
		TrafficLight lightDisplay = new TrafficLight();
		lightDisplay.start();
		
		//Function call to start camera monitoring controller
		CameraMonitoringController cameraInput = new CameraMonitoringController();
		cameraInput.start();
		
		//Calls interface to open
		GUIRunner.main();
		
	}

}
