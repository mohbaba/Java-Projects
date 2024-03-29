package BackToSender;

public class BackToSender {

    private static double calculatePercentage(int numberOfParcels){
        return ((double) numberOfParcels / 100) * 100;
    }
    private static int getAmountPerParcel(double percentage){
        if(percentage < 0)return 0;
        if (percentage < 50){
            return 160;
        } else if (percentage <= 59) {
            return 200;
        } else if (percentage <= 69) {
            return 250;
        } else {
            return 500;
        }
    }
    public static int pay(int numberOfParcels) {
        if (numberOfParcels > 100)return (100 * getAmountPerParcel(calculatePercentage(100)) + 5000);
        if (numberOfParcels < 0)return 0;
        return (numberOfParcels * getAmountPerParcel(calculatePercentage(numberOfParcels))) + 5000;
    }
}
