
import java.math.*;
import java.util.Scanner;
public class a016 {
	public static void main(String[] args){
		BigInteger b2=new BigInteger("2");
		BigInteger a=b2.pow(1000);
		System.out.println(a);
		Scanner in=new Scanner("107150860718626732094842504906000181056140481170553360744375038837035105112493612249319837881569585812759467291755314682518714528569231404359845775746985748039345677748242309854210746050623711418779541821530464749835819412673987675591655439460770629145711964776865421676604298316526243868372056680693760000000000000000000000000000000000000000000000000000000000000000000000000000000000000000").useDelimiter("\\s*");
		int f=0;
		for(int t=0;t<360;t++){
			f+=in.nextByte();
		}
		System.out.println(f);
	}
}
