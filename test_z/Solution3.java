import java.util.Arrays;

public class Solution3 {

  // (new int[]{1, 3, 2, 5, 4, 4, 6, 3, 2}) -> 7
  public int solution(int[] A) {
    int N = A.length;
    int[] trace = new int[]{0, 0}; // current x, current y
    int[][] edges = new int[][]{{0,0}, {0,0}, {0,0}, {0,0}}; // left bottom, left top, right top, right bottom

    for (int i = 0; i < N; i++) {
      if (i < 3) {
        switch (i % 4) {
          case 0:
            trace[1] = A[i];
            edges[1] = Arrays.copyOf(trace, 2);
            break;
          case 1:
            trace[0] = A[i];
            edges[2] = Arrays.copyOf(trace, 2);
            break;
          case 2:
            trace[1] -= A[i];
            edges[3] = Arrays.copyOf(trace, 2);
            break;
        }
      } else {
        switch (i % 4) {
          case 0:
            trace[1] += A[i];

            if (trace[0] > edges[0][0] && trace[1] > edges[0][1]) return i + 1;
            if (trace[0] > edges[1][0] && trace[1] > edges[1][1]) return i + 1;

            edges[1] = Arrays.copyOf(trace, 2);
            break;
          case 1:
            trace[0] += A[i];

            if (trace[1] < edges[1][1] && trace[0] > edges[1][0]) return i + 1;
            if (trace[1] < edges[2][1] && trace[0] > edges[2][0]) return i + 1;

            edges[2] = Arrays.copyOf(trace, 2);
            break;
          case 2:
            trace[1] -= A[i];

            if (trace[0] < edges[2][0] && trace[1] < edges[2][1]) return i + 1;
            if (trace[0] < edges[3][0] && trace[1] < edges[3][1]) return i + 1;

            edges[3] = Arrays.copyOf(trace, 2);
            break;
          case 3:
            trace[0] -= A[i];

            if (trace[1] > edges[3][1] && trace[0] < edges[3][0]) return i + 1;
            if (trace[1] > edges[0][1] && trace[0] < edges[0][0]) return i + 1;

            edges[0] = Arrays.copyOf(trace, 2);
            break;
        }
      }
      System.out.println("edges:" + Arrays.toString(edges[0]) + Arrays.toString(edges[1]) + Arrays.toString(edges[2]) + Arrays.toString(edges[3]) + "    trace:" + Arrays.toString(trace));
    }

    return 0;
  }
}
