import java.util.Arrays;

public class Solution4 {

  // (new int[]{4, 6, 7, 3, 2, 7}) -> 9
  public int solution(int[] A) {
    int N = A.length;
    int result = 0;

    for (int i = 0; i < N - 1; i++) {
      result += sequenceNumber(A, i);
    }

    return result;
  }

  public int sequenceNumber(int[] A, int p) {
    int num = 0;
    int[] seq2 = sequence2(A, p);
    System.out.println(Arrays.toString(seq2));
    int seq2Len = seq2.length;
    num += seq2Len;

    for (int i = 0; i < seq2Len; i++) {
      num += sequenceNumber(A, seq2[i]);
    }

    return num;
  }

  public int[] sequence2(int[] A, int p) {
    int len = A.length - (p + 1);
    int[] seq = new int[len];
    int endIdx = 0;

    int number = A[p];
    for (int i = p + 1; i < A.length; i++) {
      if (A[i] > number) {
        seq[endIdx] = i;
        endIdx++;
      }
    }

    return Arrays.copyOf(seq, endIdx);
  }
}
