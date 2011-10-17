import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class TestHeap {
public static void main(String[] args) throws IOException {

			PrintWriter pw = new PrintWriter("output.txt");
for(int j=2; j<=10; j+=2) {

		long start = System.nanoTime(); // requires java 1.5
		
		
Heap he = new Heap(j);

		StringBuffer debug = new StringBuffer();
			FileReader input = new FileReader(args[0]);
			BufferedReader bf = new BufferedReader(input);
			StringBuffer sb = new StringBuffer();
			String line = null;

pw.println(j+"-ary heap:");

			// Read through file one line at time. Print line # and line
			while ((line = bf.readLine()) != null) {
				String cmd = line.substring(0, 2);
				int key;
				key=0;
if(line.length()>2) {
key = Integer.parseInt(line.substring(3));
}
if("IN".equals(cmd)) {
he.insert(key);
}
else if("EX".equals(cmd)) {
pw.println(""+he.extractMin());
pw.flush();
}
}
pw.println("running time: "+(System.nanoTime()-start)/1000+" microseconds.");
pw.flush();

}
}
}
