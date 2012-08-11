package davenkin;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class AA
{
    public static void main(String[] args) throws IOException
    {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("aa.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(systemResourceAsStream);
        Properties properties = System.getProperties();
        char[] aa = new char[100];
        inputStreamReader.read(aa);
        int read = systemResourceAsStream.read();
        int read1 = systemResourceAsStream.read();
        int read2 = systemResourceAsStream.read();
        int read3 = systemResourceAsStream.read();
        int read4 = systemResourceAsStream.read();
        String s = Integer.toHexString(read);
        String s1 = Integer.toHexString(read1);
        String s2 = Integer.toHexString(read2);
        String s3 = Integer.toHexString(read3);
        String s4 = Integer.toBinaryString(read);
        System.out.println(aa);
    }
}
