package com.tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.code.patient;

public class serial {

	//for serialization
	
	public static void encoder (List<patient>list,String name)throws invalidexception, FileNotFoundException, IOException{
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(name))){
			
			oos.writeObject(list);
			System.out.println("FIle store Successfully.......");
		}
		
		
	}
	
	//for deserialization
	
	public static List<patient> decoder (String name) throws invalidexception, FileNotFoundException, IOException, ClassNotFoundException{
		
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(name))){
			
		
			List<patient>list=(List<patient>) ois.readObject();
			return list;
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
