package com.FirstLab;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlExample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// Creating URL
		URL u = new URL("http://localhost/phpmyadmin/index.php?route=/#toc");
		
		System.out.println("The authority of "+u+ " is "+u.getAuthority());
		// getAuthority()-> returns domain name
		
		 System.out.println("The default port number of "+u+ " is "+u.getDefaultPort());
		 // getDefaultPort()-> returns default port name for any domain name
		 
		 System.out.println("The port number of "+u+ " is "+u.getPort());
		 // getPort() -> returns port name of given host name else returns -1
		 
		 System.out.println("The file name of "+u+ " is "+u.getFile());
		 // getFile() -> returns name of file given after the host name
		 
		 System.out.println("The host name of "+u+ " is "+u.getHost());
		 // getHost() -> returns name of host
		 
		 System.out.println("The path of "+u+ " is "+u.getPath());
		 // getPath() -> returns path of file without reference and query string
		 
		 System.out.println("The protocol of "+u+ " is "+u.getProtocol());
		 // getProtocol() -> returns protocol used in URL
		 
		 System.out.println("The query string of "+u+ " is "+u.getQuery());
		 // getQuery() -> returns query string of URL
		 
		 System.out.println("The reference of "+u+ " is "+u.getRef());
		 // getRef() -> returns reference of URL
		 
		 System.out.println("The user information of "+u+ " is "+u.getUserInfo());
		 // getUserInfo() -> returns user information from URL
		 
		
	}


	
}
