class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1개수 = arr2개수
        // a = 행, b = 열
        int a = arr1.length;
        int b = arr1[0].length;
        // 주어진 행열에 맞게 answer배열 생성
        int[][] answer = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                // arr1, arr2의 해당 행렬 값의 합을 answer에 저장
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}