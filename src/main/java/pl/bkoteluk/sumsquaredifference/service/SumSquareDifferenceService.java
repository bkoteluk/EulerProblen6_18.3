package pl.bkoteluk.sumsquaredifference.service;

public class SumSquareDifferenceService {

    private int maxNumber;

    public SumSquareDifferenceService(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int sumOfTheSquaresNumbers() {
        int sum = 0;
        for(int i = 1; i <= maxNumber; i++) {
            sum += i*i;
        }
        return sum;
    }
    public int squareOfTheSumNumbers() {
        int sum = 0;
        for(int i = 1; i <= maxNumber; i++) {
            sum += i;
        }
        return sum*sum;
    }

    public int differenceBetweenSums() {
        return squareOfTheSumNumbers()-sumOfTheSquaresNumbers();
    }
}
