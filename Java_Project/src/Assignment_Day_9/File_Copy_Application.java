package Assignment_Day_9;

import java.io.*;

public class File_Copy_Application {

	public static void main(String[] args)  {

try {

FileInputStream fis =new FileInputStream("student.txt");
FileOutputStream fos  =new FileOutputStream("copy.txt");
int data;
while((data=fis.read())!=-1) {
	fos.write(data);
}
fis.close();
fos.close();

}
catch(Exception e) {
	System.out.println("Error:- "+e);
}

	}

}
