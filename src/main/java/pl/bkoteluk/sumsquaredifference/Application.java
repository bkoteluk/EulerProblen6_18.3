package pl.bkoteluk.sumsquaredifference;

import pl.bkoteluk.sumsquaredifference.service.SumSquareDifferenceService;

public class Application {
    public static void main(String[] args) {
        int maxNumber = 100;
        System.out.println("Różnica kwadratu sum i sumy kwadratów dla ciągu " + maxNumber+
                " liczb wynosi: " + new SumSquareDifferenceService(maxNumber).differenceBetweenSums());
    }
}
