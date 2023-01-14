import java.io.*;
class Readallchar {
    public static void main(String args[]) throws Exception
    {
        //open the file 
        //read the contents in the file and print the output
        //it is text file
        //we hwve to use the file reader which means it is character stream
        FileReader fr=new FileReader("javar.txt");
        //filereader it used to read mode in java
        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
            //here it reads the all the character and print
            //here the -1 denotes the empty spaces in java
        }
          //characte variable is taken
         
          //it reads a single character
    }
}
 