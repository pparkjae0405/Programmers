class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // 숫자를 저장할 정수배열 선언
        int[] cash = new int[3];
        // 숫자를 카운트할 counta, 조건을 카운트할 countb 선언
        int counta = 0, countb = 0;
        // 주어진 문자열의 크기만큼 반복하는데
        for (int i = 0; i < dartResult.length(); i++) {
            // 조건 저장하는 dchar 문자열
            char dchar = dartResult.charAt(i);
            // 숫자 저장하는 dint 정수
            int dint = Character.getNumericValue(dchar);
            // 숫자가 10이면 10을 저장하도록 하는 if문
            if (dint >= 0 && dint <= 10) {
                if (dint == 1) {
                    if (Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                        dint = 10;
                        i++;
                    }
                }
                cash[counta] = dint;
                counta++;
            } else {
                // S일 때 1제곱
                if (dchar == 'S') {
                    cash[countb] = (int) Math.pow(cash[countb], 1);
                    countb++;
                }
                // D일 때 2제곱
                if (dchar == 'D') {
                    cash[countb] = (int) Math.pow(cash[countb], 2);
                    countb++;
                }
                // T일 때 3제곱
                if (dchar == 'T') {
                    cash[countb] = (int) Math.pow(cash[countb], 3);
                    countb++;
                }
                // *일 때 해당 값 2배, 그 전숫자에도 2배
                if (dchar == '*') {
                    //삼항연산자 (조건문 ? 참:거짓)
                    countb = countb-2 < 0 ? 0 : countb-2;
                    while(countb<counta) {
                        cash[countb] *= 2;
                        countb++;
                    }
                }
                // #일 때 해당 값 -1배
                if (dchar == '#') {
                    cash[countb-1] *= -1;
                }
            }
        }
        answer = cash[0] + cash[1] + cash[2];
        return answer;
    }
}