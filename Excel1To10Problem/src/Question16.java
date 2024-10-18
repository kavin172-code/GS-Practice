import java.util.HashMap;

public class Question16 {
    public static void main(String[] args) {
        String[] logs = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93"
        };

        System.out.println(findMostFrequentIPAddress(logs)); // Output: 10.0.0.2
    }

    public static String findMostFrequentIPAddress(String[] logs) {
        HashMap<String, Integer> ipCount = new HashMap<>();

        for (String log : logs) {
            String ip = extractIPAddress(log);
            if (isValidIPAddress(ip)) {
                ipCount.put(ip, ipCount.getOrDefault(ip, 0) + 1);
            }
        }


        String maxIP = null;
        int maxCount = 0;

        for (String ip : ipCount.keySet()) {
            if (ipCount.get(ip) > maxCount) {
                maxCount = ipCount.get(ip);
                maxIP = ip;
            }
        }

        return maxIP;
    }

    private static String extractIPAddress(String log) {
        String[] parts = log.split(" ");
        for (String part : parts) {
            if (isValidIPAddress(part)) {
                return part;
            }
        }
        return "";
    }

    private static boolean isValidIPAddress(String ip) {

        String[] octets = ip.split("\\.");
        if (octets.length != 4) return false;

        for (String octet : octets) {
            if (!octet.matches("\\d+") || octet.length() > 3 || Integer.parseInt(octet) > 255 || (octet.length() > 1 && octet.startsWith("0"))) {
                return false;
            }
        }
        return true;
    }
}
