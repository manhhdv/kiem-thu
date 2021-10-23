
// Cho 3 số a,b,c dương tùy ý (a,b < 100).
// Nếu cả a và b đều chia hết cho 5 hoặc c chia hết cho 5 thì tính tổng các số chia hết cho a,
// không thì tính tổng các số chia hết cho b trong 20 số đầu tiên chia hết.

public class SumCalculator {

    private int a, b, c;

    public SumCalculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sumCalculator() {
        if (a >= 100 || b >= 100 || a <= 0 || b <= 0) {
            return 0;
        }
        int sum = 0;
        int i = 0;
        int count = 0;
        if ((a % 5 == 0) && (b % 5 == 0) || (c % 5 == 0)) {
            while (count < 20) {
                if (i % a == 0) {
                    sum += i;
                    count++;
                }
                i++;
            }
        } else {
            while (count < 20) {
                if (i % b == 0) {
                    sum += i;
                    count++;
                }
                i++;
            }
        }
        return sum;
    }
}