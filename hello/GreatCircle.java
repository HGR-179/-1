public class GreatCircle {
    public static void main(String[] args) {
        try {
            checkArgsLength(args);
            
            double latitude1 = Math.toRadians(Double.parseDouble(args[0]));
            double longitude1 = Math.toRadians(Double.parseDouble(args[1]));
            double latitude2 = Math.toRadians(Double.parseDouble(args[2]));
            double longitude2 = Math.toRadians(Double.parseDouble(args[3]));  // 변경된 부분 (toDegrees -> toRadians)

            double radius = 6371.0;

            double dlat = latitude2 - latitude1;
            double dlon = longitude2 - longitude1;
            double a = Math.pow(Math.sin(dlat / 2), 2)
                     + Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin(dlon / 2), 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

            double distance = radius * c;

            System.out.println("Great-circle distance: " + distance + " kilometers");
        } catch (Exception e) {
            System.out.println("Please provide exactly four arguments: latitude1, longitude1, latitude2, longitude2.");
        }
    }
    private static void checkArgsLength(String[] args) throws Exception {
        if (args.length < 4) {
            throw new Exception("Insufficient arguments");
        }
    }
}
