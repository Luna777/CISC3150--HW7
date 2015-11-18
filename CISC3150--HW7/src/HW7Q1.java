import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW7Q1 {

    public static void main(String[] args) throws IOException {
    	
    	FileWriter fw = new FileWriter(new File("./dir_tree.txt"));
    	printDir("/Users/guanxin/Desktop/2015fall", fw, 1);
    	
    }
    
    public static void printDir(String s, FileWriter fw, int a) throws IOException{
    	//0x251C├ 0x2514└ 0x2500─
    	File current = new File(s);
    	File[] dirs = current.listFiles();
    	
    	for(int i=0; i<dirs.length; i++){
    		if(dirs[i].isDirectory()){
    			
    			for(int j=0; j<a-1; j++){
    				//System.out.print("   ");
    				fw.write("   ");
    			}
    			//System.out.println("└──"+dirs[i].getName());
    			fw.write("└──"+dirs[i].getName()+ "\n");
    			//printDir(file.getCanonicalPath(), fw, a+1);
    			printDir(dirs[i].getPath(), fw, a+1);
    			
    			fw.flush();
    		}
    	}	
    }
    
}





