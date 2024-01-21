package com.FirstLab;
import java.net.*;

public class GetAllByNameEg {

	public static void main(String []args)
	{
		try{
			
			InetAddress[] i1 = InetAddress.getAllByName("www.google.com");
			//getAllByName()-> is a method used to return an array of IP address of given host name
			System.out.println(i1);
			
			InetAddress[] i2 = InetAddress.getAllByName("www.ncdbhwqvshjqwb.com");
			System.out.println(i2);
			
		}catch(UnknownHostException e)// throws message if the given domain or address is invalid or unknown
		{
			System.out.println("The given address is invalid.");
		}
	}
	
}
