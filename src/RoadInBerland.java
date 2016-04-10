
 import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author nasko
 */
public class RoadInBerland {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskC {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int n = in.nextInt();
        int[][] dist = new int[n+1][n+1];


        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                dist[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();

        long sum = -1;
        for(int a = 0; a < k; ++a) {
            int from = in.nextInt();
            int to = in.nextInt();
            int weight = in.nextInt();


            if(sum != -1 && weight > dist[from][to]) {
                out.print(sum + " ");
                continue;
            }
            weight = Math.min(weight,dist[from][to]);
            dist[from][to] = weight;
            dist[to][from] = weight;

            for(int i = 1; i <= n; ++i) {
                for(int j = 1; j <= n; ++j) {
                    if(dist[i][j] > dist[i][from] + dist[from][j]) {
                        dist[i][j] = dist[i][from] + dist[from][j];
//                        dist[j][i] = dist[i][j];
                    }
                }
            }
            for(int i = 1; i <= n; ++i) {
                for(int j = 1; j <= n; ++j) {
                    if(dist[i][j] > dist[i][to] + dist[to][j]) {
                        dist[i][j] = dist[i][to] + dist[to][j];
                    }
                }
            }
            sum = 0;
            for(int i = 1; i <=n; ++i) {
                for(int j = 1; j <= i; ++j) sum += dist[i][j];
            }
            out.print(sum + " ");

        }
        out.println();

    }

}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}