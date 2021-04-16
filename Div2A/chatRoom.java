import java.util.*;
import java.io.*;

public class practice {
	
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
	
 public static void main(String[] args) throws IOException{
		
	 FastReader fr=new FastReader();
	 String s=fr.next();
	 String ans="hello";
	 int j=0;
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)==ans.charAt(j)) {
			 j++;
			 if(j==ans.length()) {
				 break;
			 }
		 }
	 }
	 if(j==ans.length()) {
		 System.out.println("YES");
	 }
	 else {
		 System.out.println("NO");
	 }
	}
}
	


