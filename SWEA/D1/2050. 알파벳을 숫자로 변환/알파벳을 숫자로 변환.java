
import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphabet = br.readLine();
            for(int i = 0; i < alphabet.length(); i++){
                System.out.print(alphabet.charAt(i)- 64 + " ");
            }
	}
}