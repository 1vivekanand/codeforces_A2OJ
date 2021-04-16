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
		String s=fr.next();
		char a[]=s.toCharArray();
		Arrays.sort(a);
		String ans="";
		for(int i=0;i<a.length;i++) {
			if(a[i]-'0'>=0 && a[i]-'0'<=9) {
				ans+=a[i]+"+";
			}
		}
		System.out.println(ans.substring(0, ans.length()-1));
	}

}
