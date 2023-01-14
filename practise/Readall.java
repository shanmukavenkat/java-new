import java.io.BufferedReader;
import java.io.FileReader;
class Readall{
    public static void main (String args[]) throws Exception
    {
        FileReader fr=new FileReader("javar.txt");
        BufferedReader br= new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        System.out.println(s);
    }
    
}