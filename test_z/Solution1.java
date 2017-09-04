import java.util.Arrays;

public class Solution1 {

  // (1 ,8, 3, 2, 6, 4)
  // (0, 0, 0, 7, 8, 9)
  // (2, 4, 5, 9, 5, 9)
  // (9, 9, 9, 9, 9, 9)
  public String solution(int A, int B, int C, int D, int E, int F) {
    int[] array = {A, B, C, D, E, F};

    Arrays.sort(array);
    validateSecond(array);
    validateMinute(array);

    if (isNotTime(array)) {
      return "NOT POSSIBLE";
    } else {
      return timeformat(array);
    }
  }

  private void validateSecond(int[] array) {
    int second = makeSecond(array);

    int index = 4;
    while (isNotSecond(second) && index > 0) {
      index--;
      int change = array[4];
      array[4] = array[index];
      array[index] = change;
      second = makeSecond(array);
    }
  }

  private int makeSecond(int[] array) {
    return array[4] * 10 + array[5];
  }

  private boolean isNotSecond(int second) {
    return second > 59;
  }

  private void validateMinute(int[] array) {
    int minute = makeMinute(array);

    int index = 2;
    while (isNotMinute(minute) && index > 0) {
      index--;
      int change = array[2];
      array[2] = array[index];
      array[index] = change;
      minute = makeMinute(array);
    }
  }

  private int makeMinute(int[] array) {
    return array[2] * 10 + array[3];
  }

  private boolean isNotMinute(int minute) {
    return minute > 59;
  }

  private int makeHour(int[] array) {
    return array[0] * 10 + array[1];
  }

  private boolean isNotHour(int hour) {
    return hour > 23;
  }

  private boolean isNotTime(int[] array) {
    return isNotHour(makeHour(array));
  }

  private String timeformat(int[] array) {
    return "" + array[0] + array[1] + ":" + array[2] + array[3] + ":" + array[4] + array[5];
  }
}
