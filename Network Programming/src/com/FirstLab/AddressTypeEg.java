package com.FirstLab;
import java.net.*;

public class AddressTypeEg {
	public static void main(String [] args)
	{
		try
		{
			InetAddress i = InetAddress.getByName("www.janabhawana.com");
			if(i.isAnyLocalAddress()) //used to check whether the inetAddress is wild card address or not
				{
					System.out.println("The given address "+i+" is wild card address.");
				}
			if(i.isLoopbackAddress()) //used to check whether the inetAddress is loop back(127.0.0.0.1) address or not
				{
					System.out.println("The given address "+i+" is loopback address.");
				}
			
			if(i.isLinkLocalAddress()) //used to check whether the inetAddress is link local address or not
				{
					System.out.println("The given address "+i+" is linklocal address.");
				}
			
			if(i.isSiteLocalAddress()) //used to check whether the inetAddress is site local address or not
				{
					System.out.println("The given address "+i+" is sitelocal address.");
				}
			else
				{
					System.out.println("The given address "+i+" is global address."); // not wild card address
				}
			  
			if(i.isMulticastAddress()) //used to check whether the inetAddress is an IP multicast(class )(one node to another node) address or not
			{
				if(i.isMCGlobal()) //used to check whether the multi cast address has global scope or not
					{
						System.out.println("The given address "+i+" is global multicast address.");
					}
				else if(i.isMCOrgLocal()) //used to check whether the multi cast address has organization scope or not
					{
						System.out.println("The given address "+i+" is wild multicast address.");
					}
				else if(i.isMCSiteLocal()) //used to check whether the multi cast address has site scope or not
					{
						System.out.println("The given address "+i+" is site wild multicast address.");
					}
				else if(i.isMCLinkLocal()) //used to check whether the multi cast address has link scope or not
					{
						System.out.println("The given address "+i+" is subnet wide multicast address.");
					}
				else if(i.isMCNodeLocal()) //used to check whether the multi cast address has node scope or not
					{
						System.out.println("The given address "+i+" is an interface local multicast address.");
					}
				else
				{
					System.out.println("The given address "+i+" is unknown multicast address."); // throws message if multi cast address is unknown
				}
			}
			else
			{
				System.out.println("The given address "+i+" is unicast address."); //returns if given address is not multi cast address
			}
		}catch(UnknownHostException e) // throws message if the given domain or address is invalid or unknown
			{
				System.out.println("This is invalid address.");
			}
	}
	}

