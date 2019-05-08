package Day0508;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int count = 1;
		
		while (count <= T) {
			String str = br.readLine();
			String[] arrStr = str.split(" ");
			
			int A = Integer.parseInt(arrStr[0]);
			int B = Integer.parseInt(arrStr[1]);
			
			bw.write((A+B) + "\n");
			count++;
		}
		bw.flush();
		bw.close();
	}
	
}
