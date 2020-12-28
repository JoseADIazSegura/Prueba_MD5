package com.JoseDiaz;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String textoSinEncriptar = "jose";
        String textoEncriptadoConMD5 = DigestUtils.md5Hex(textoSinEncriptar);
        System.out.println("Texto Encriptado con MD5: " + textoEncriptadoConMD5);

        var test = scanner.next();
        if(test.equals(textoEncriptadoConMD5)){
            System.out.println("La pass es correcta");
        }else {
            System.out.println("Esta no es");
        }
    }
}
