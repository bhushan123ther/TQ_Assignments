package com.assignment;

public class Laptop {
	private int noOfUSBPort;
	private int processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		Laptop lap1 = new Laptop();
		lap1.setNoOfUSBPort(3);
		lap1.setProcessorSpeed(80);

		System.out.println("Number of USB Ports : " + lap1.getNoOfUSBPort());
		System.out.println("Processor speed : " + lap1.getProcessorSpeed());
	}
}
