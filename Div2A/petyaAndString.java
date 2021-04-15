//package practice;

import java.io.*;
import java.util.*;

public class test {

	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	public static void main(String[] args) {

		FastReader fr=new FastReader();
		int t=fr.nextInt();
		while(t-->0) {
				String s=fr.next();
				String ans="";
				if(s.length()<=10) {
					System.out.println(s);
				}				
				else {
					System.out.println(String.valueOf(s.charAt(0))+String.valueOf(s.length()-2)+String.valueOf(s.charAt(s.length()-1)));
				}
		}

	}

}
