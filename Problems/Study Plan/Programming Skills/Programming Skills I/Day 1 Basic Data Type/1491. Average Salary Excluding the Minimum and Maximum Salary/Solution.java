class Solution {
    public double average(int[] salary) {
        int length = salary.length;
        double average = 0;
        
        Arrays.sort(salary);
        
        for (int i=1; i < length-1 ; i++) {
            average += salary[i];
        }
        
        return average / (length - 2);
    }
}