package com.FirstLab;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetByNameEg {
	public static void main(String []args)
	{
		try{
			
			InetAddress i1 = InetAddress.getByName("www.facebook.com");
			//getByName()-> is a method used to determine the IP address of host
			System.out.println(i1);
			
			InetAddress i2 = InetAddress.getByName("www.msjjsasd.com");
			System.out.println(i2);
			
		}catch(UnknownHostException e) // throws message if the given domain or address is invalid or unknown
		{
			System.out.println("The given address is invalid.");
		}
	}

}
