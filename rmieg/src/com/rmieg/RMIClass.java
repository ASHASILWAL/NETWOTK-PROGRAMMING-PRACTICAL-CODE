package com.rmieg;

	import java.rmi.RemoteException;
	import java.rmi.server.UnicastRemoteObject;

	public class RMIClass extends UnicastRemoteObject implements RMIDEMO {
	    public RMIClass() throws RemoteException {
	        super();
	    }

	    @Override
	    public double SimpleInterest(double p, double r, double t) throws RemoteException {
	        return (p * r * t) / 100;
	    }

	    @Override
	    public double Cube(double n) throws RemoteException {
	        return n * n * n;
	    }
	}
