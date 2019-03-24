package org.cloudme.sample.aes.servlet;

import org.cloudme.sample.aes.AesUtil;

public class testingClass {
	public static void main(String[] args){		
		String passphrase = "passphrase";
		String iv = "83e719d86fd1e6e9d639cc743d191909";
		String salt = "5f941169bd9429be049913cd3055f312";
		String ciphertext = "pDoxoUXEc2QzbZGFVx436w==" ;
		int iterationCount = 1000 ;
		int keySize = 128 ;
        
        AesUtil aesUtil = new AesUtil(keySize, iterationCount);
        String plaintext = aesUtil.decrypt(salt, iv, passphrase, ciphertext);
        System.out.println(plaintext);

	}
}
