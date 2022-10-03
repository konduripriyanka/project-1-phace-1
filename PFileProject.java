package com.phase1.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PFileProject {
public static void main(String[] args) throws IOException {
		String path="C:\\Filesproject\\";
		Scanner sc=new Scanner(System.in);
		 while(true) {
		System.out.println("u are performing operations on file");
		
			 System.out.println("1.displayingfiles\n2.menu\n3.exit");
			 System.out.println("enter ur choice");
			 String ch=sc.next();
			 
			 switch(ch) {
			 case "1"://displaying
				 File f1=new File(path);
				 File fn1[]=f1.listFiles();
				 for(File ff:fn1) {
					 System.out.println(ff.getName());
				 }
				break;
			 case "2"://in menu we have sub operations in file
				 System.out.println("2.1: adding\n2.2:deleting\n2.3:searching\n2.4:exit");
				 System.out.println("enter ur choice");
				 String ch1=sc.next();
				
				 switch(ch1) {
				case "2.1"://adding
					System.out.println("enter file name u want to add:"+path);
					String fn2=sc.next();
					File f2=new File(path+fn2);
					boolean b=f2.createNewFile();
					if(b==true) {
						System.out.println("file is created at:"+path);
					}
					else {
						System.out.println("file is not created");
					}
					break;
				case "2.2"://deleting
					System.out.println("enter file name to dalete:"+path);
					String fn3=sc.next();
					File f3=new File(path+fn3);
					boolean c=f3.delete();
					if(c==true) {
						System.out.println("file is deleted");
					}
					else {
						System.out.println("file is not deleted");
					}
					break;
				case "2.3"://searching a file
					System.out.println("enter file name u want to search");
					String fn4=sc.next();
					File f4=new File(path);
					File fn5[]=f4.listFiles();
					int flag=0;
					for(File ff:fn5) {
						if(ff.getName().equals(fn4)) {
							flag=1;
							break;
						}
						else {
							flag=0;
						}
					}
					if(flag==1) {
						System.out.println("the file is found at:"+path);
					}
					else {
						System.out.println("file is not found");
					}
					break;
				case "2.4":
					System.exit(0);
					break;
				
				default:
				System.out.println("enter correct choice");
				break;
				}
			 break;
			
			case "3":
				 System.exit(0);
				 break;
			default:
				System.out.println("enter correct choice");
				break;
			 }
			 }
		 }
		// TODO Auto-generated method stub
		 }
	


