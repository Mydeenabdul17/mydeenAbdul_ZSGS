package com.mydeenAbdul_ZSGS.arrays;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mydeenAbdul_ZSGS.Application;

public class Demo {
	
    static Scanner sc=new Scanner(System.in);
	public static void myMain() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
//System.out.println(Demo.class.getPackageName());
		boolean b=true;
		do {
			System.out.println("***************************************");
			System.out.println("\tA R R A Y S  P R O B L E M S");
			System.out.println("***************************************");
			List<String> classNames = listOfClassName();
			// Display the class names
			int i=1;
			for (String className : classNames) {
				System.out.println(i++ +" - " + className);
			}
			System.out.println("0 - Exit");
			System.out.println("Enter the choice");
			int input=sc.nextInt();
			if(input==0) {
				b=false;
				}else {
					String classname=Demo.class.getPackageName()+"."+classNames.get(input-1);
					Class myClass = null;
					try {
						myClass=Class.forName(classname);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					myClass.getDeclaredMethod("myMain", null).invoke(new Demo(), null);
				}
			System.out.println("***************************************");
		} while (b);
	}

	public static List<String> listOfClassName() {
        	Package currentPackage = Demo.class.getPackage();
    		String packageName = currentPackage.getName();
    		String packagePath = packageName.replace(".", "/");
            File packageDirectory = new File("src/" + packagePath);

            // List all the .class files in the package directory
            String[] classFiles = packageDirectory.list((dir, name) -> name.endsWith(".java"));
            List<String> classNames = new ArrayList<>();
            if (classFiles != null) {
               

                for (String classFile : classFiles) {
                    // Remove the ".class" extension
                	if(!classFile.equals("Demo.java")) { 
                    String className = classFile.substring(0, classFile.lastIndexOf('.'));       
                    classNames.add(className);
                	}    
                }
                
    }
            return classNames;
	}
}
