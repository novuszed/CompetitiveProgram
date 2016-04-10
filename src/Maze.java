import java.util.*;

public class Maze {

	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, -1, 1, 0 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int startx = 0, starty = 0, endx = 0, endy = 0;
		for (int i = 0; i < cases; i++) {
			int numrow = sc.nextInt();
			int numcols = sc.nextInt();
			char[][] map = new char[numrow][numcols];
			for (int k = 0; k < numrow; k++) {

				map[k] = sc.next().toCharArray();
			}
			for (int a = 0; a < numrow; a++) {
				for (int b = 0; b < numcols; b++) {
					if (map[a][b] == 's') {
						startx = a;
						starty = b;
					} else if (map[a][b] == 'e') {
						endx = a;
						endy = b;
					}
				}
			}

			Queue<int[]> q = new LinkedList<int[]>();

			int[] start = { startx, starty };
			q.add(start);

			boolean found = false;
			int[][] visited = new int[numrow][numcols];
			visited[startx][starty] = -1;
			while (!q.isEmpty()) {
				int[] curr = q.poll();
				int currx = curr[0];
				int curry = curr[1];

				if (map[currx][curry] == 'e') {
					found = true;
					// visited[currx][curry]=-2;
					break;
				}
				for (int z = 0; z < 4; z++) {

					if (isValid(currx + dx[z], curry + dy[z], numrow, numcols, map)
							&& (visited[currx + dx[z]][curry + dy[z]] == 0)) {
						int newx = currx + dx[z];
						int newy = curry + dy[z];
						int[] temp = { newx, newy };

						if (map[currx + dx[z]][curry + dy[z]] == 'e') {
							switch (z) {
							case 0:
								visited[currx + dx[z]][curry + dy[z]] = 1;
								// System.out.println("D");
								break;
							case 1:
								visited[currx + dx[z]][curry + dy[z]] = 2;
								// System.out.println("L");

								break;
							case 2:
								visited[currx + dx[z]][curry + dy[z]] = 3;
								// System.out.println("R");

								break;
							case 3:
								visited[currx + dx[z]][curry + dy[z]] = 4;
								// System.out.println("U");

								break;
							default:
								break;
							}
						} else {

							switch (z) {
							case 0:
								visited[currx + dx[z]][curry + dy[z]] = 1;
								// System.out.println("D");
								break;
							case 1:
								visited[currx + dx[z]][curry + dy[z]] = 2;
								// System.out.println("L");

								break;
							case 2:
								visited[currx + dx[z]][curry + dy[z]] = 3;
								// System.out.println("R");

								break;
							case 3:
								visited[currx + dx[z]][curry + dy[z]] = 4;
								// System.out.println("U");

								break;
							default:
								break;
							}
						}
						q.add(temp);
					}

				}
			}
			if (found) {
				Stack<String> direction = new Stack<String>();
				while ((endx != startx) || (endy != starty)) {
					if (visited[endx][endy] == -1) {
						break;
					} else if (visited[endx][endy] == 1) {
						direction.push("D");
						endx--;
					} else if (visited[endx][endy] == 2) {
						direction.push("L");
						endy++;
					} else if (visited[endx][endy] == 3) {
						direction.push("R");
						endy--;
					} else if (visited[endx][endy] == 4) {
						direction.push("U");
						endx++;
					}

				}
				while (!direction.isEmpty()) {
					System.out.print(direction.pop());
				}
				//System.out.println();
			} else {
				System.out.println(":(");
			}

		}
		sc.close();
	}

	public static boolean isValid(int x, int y, int n, int m, char[][] map) {

		if (x < 0 || y < 0 || x >= n || y >= m || map[x][y] == '#') {
			return false;
		}
		return true;
	}

}
