package com.test;

import java.io.IOException;

import com.controller.DealDataController;

public class CjjTest {
	public static void main(String[] args) {
		
		DealDataController de=new DealDataController();
		try {
			de.home(null, null, null, null, null, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
