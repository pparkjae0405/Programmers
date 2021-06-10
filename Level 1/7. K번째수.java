import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++) {
            int a = commands[i][0] - 1;
            int b = commands[i][1] - 1;
            int c = commands[i][2] - 1;
            int d = b-a+1;
            int[] cut = new int[d];
            for (int j = a; j <= b; j++) {
                cut[j-a] = array[j];
            }
            Arrays.sort(cut);
            answer[i] = cut[c];
        }
        return answer;
    }
}