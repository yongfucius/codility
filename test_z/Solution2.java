import java.util.Arrays;

public class Solution2 {

  // (new int[]{-1, -1, 1, 0, -1, 1, 0, 1, -1, -1}, 2) -> 6
  public int solution(int[] A, int S) {
    int N = A.length;

    int size = N;

    while (size >= S) {
      int P = 0;
      int Q = P + size;
      for (; Q <= N; P++, Q++) {
        int sum = Arrays.stream(A, P, Q).sum();

        if (sum == S) return size;
      }

      size--;
    }

    return -1;
  }
}
