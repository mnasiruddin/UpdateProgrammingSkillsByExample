package learnbyexample;

public class FindDistanceBetweenPoints {

    public static void main(String[] args) {

        double startLatitude = 53.305172428587106;
        double endLatitude = 53.3052108948436;
        double startLongitude = -6.245706081390381;
        double endLongitude = -6.237530708312988;

        final double radiusMiles = 3959.0;
        double deltaLat = Math.toRadians(endLatitude - startLatitude);
        double deltaLong = Math.toRadians(endLongitude - startLongitude);

        double aux = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
                + Math.cos(Math.toRadians(startLatitude)) * Math.cos(Math.toRadians(endLatitude)) * Math.sin(deltaLong / 2) * Math.sin(deltaLong / 2);
        double coef = 2 * Math.atan2(Math.sqrt(aux), Math.sqrt(1 - aux));
        double mile = radiusMiles * coef;

        System.out.println("mile : " + mile);
        System.out.println("km : " + mile * 1.609344);
    }
}
