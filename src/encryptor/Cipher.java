/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Kaweendra
 */
public class Cipher {

   private int key;
	
	//constructor
	
	public Cipher(int givenkey){
		
		key = givenkey;
	}
	
	//main ecryption method
	
	public void encrypt(InputStream inStr, OutputStream outStr) throws IOException{
		boolean done =false;
		while(!done){
			int next = inStr.read();
			if(next == -1){
				 done = true;
				 
			}else{
				byte b =(byte)next;
				byte c =(byte) (b+key);
				outStr.write(c);
			}
			
		}
		
	}
    
}
