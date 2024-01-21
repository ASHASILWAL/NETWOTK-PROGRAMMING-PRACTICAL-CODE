package com.rmieg;

	import java.rmi.Remote;
	import java.rmi.RemoteException;

	public interface RMIDEMO extends Remote {
	    double SimpleInterest(double p, double r, double t) throws RemoteException;
	    double Cube(double n) throws RemoteException;
	}

