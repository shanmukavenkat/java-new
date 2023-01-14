import java.io.*;
 class Read {
    public static void main(String args[]) throws Exception
    {
        //open the file 
        //read the contents in the file and print the output
        //it is text file
        //we hwve to use the file reader which means it is character stream
        FileReader fr=new FileReader("javar.txt");
        //filereader it used to read mode in java
        char Ch;
          //characte variable is taken
          System.out.println((char)fr.read());
          //it reads a single character
    }
    
}
