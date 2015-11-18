//CISC3150
//Xin Guan
//11/18/15

import java.io.*;

public class HW7Q1{

    public static void main(String[] args) throws IOException {
    	
    	FileWriter fw = new FileWriter(new File("./dir_tree.txt"));
    	printDir("/Users/guanxin/Desktop/2015fall", fw, 1);
    	
    }
    
    //recursive function to get every directories and print them out in tree format.
    public static void printDir(String s, FileWriter fw, int a) throws IOException{
    	//Ascii extend code: 0x2514└ 0x2500─
    	File current = new File(s);
    	File[] dirs = current.listFiles();
    	
    	//print out the folders in current directory
    	for(int i=0; i<dirs.length; i++){
    		if(dirs[i].isDirectory()){
    			
    			for(int j=0; j<a-1; j++){
    				fw.write("   ");
    			}
    			fw.write("└──"+dirs[i].getName()+ "\n");
    			printDir(dirs[i].getPath(), fw, a+1);
    			
    			fw.flush();
    		}
    	}	
    }
    
}