package com.rmieg;

	import java.rmi.registry.LocateRegistry;
	import java.rmi.Naming;

	public class ServerEg {
	    public static void main(String[] args) {
	        try {
	            RMIDEMO demo = new RMIClass();

	            // Register the remote object with RMI registry
	            LocateRegistry.createRegistry(1099);
	           
	           

	Naming.rebind("rmi://localhost:5000/jbc",demo);

	            System.out.println("server running.");
	        } catch (Exception e) {
	            System.err.println("Error " + e.toString());
	            e.printStackTrace();
	        }
	    }
	}

