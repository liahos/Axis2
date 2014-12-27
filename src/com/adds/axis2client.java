package com.adds;

import java.rmi.RemoteException;

public class axis2client {
	public static void main(String[] args) throws RemoteException {
		
		AddiStub a = new AddiStub();
		com.adds.AddiStub.Add ad1 = new com.adds.AddiStub.Add();
		ad1.setA(20);
		ad1.setB(80);
		com.adds.AddiStub.AddResponse res = a.add(ad1);
		System.out.println(res.get_return());
	}

}
