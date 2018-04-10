//Write your code here
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n){
        int total = 0;
        // Iterate through each number starting at 1 -> n, 
        for (int i = 1; i <= n; i++) {
           // Divide with modules, if, it equals 0, we sum it to the total 
            if((n%i) == 0) {
                total += i;
            }
        }
        return total;
    }
}
