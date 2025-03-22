class Solution {
    public double[] convertTemperature(double celsius) {
        
        double kel=0,far=0;
        kel = celsius + 273.15;
        far = (celsius * 1.80) + 32;
        return new double[]{kel,far};
    }
}