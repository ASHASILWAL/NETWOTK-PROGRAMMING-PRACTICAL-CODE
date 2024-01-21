package com.FirstLab;
import java.net.*;

public class GetterMethodsEg {
	
	public static void main(String [] args)
	{
		try
		{
		InetAddress i =  InetAddress.getByName("www.facebook.com");
		System.out.println("Result1 : "+i.getHostName());
		System.out.println("Result2 : "+i.getCanonicalHostName());
		System.out.println("Result3 : "+i.getAddress());
		System.out.println("Result4 : "+i.getHostAddress());
	}catch(UnknownHostException e) // throws message if the given domain or address is invalid or unknown
		{
			System.out.println("Invalid domain name.");
		}

}
}
