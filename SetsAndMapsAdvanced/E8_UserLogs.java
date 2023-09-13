package SetsAndMapsAdvanced;

import java.util.*;

public class E8_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String ip = inputParts[0].split("=")[1];
            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];
            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>() {{
                    put(ip, 1);
                }});

            } else {
                Map<String, Integer> currentIps = data.get(username);
                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);
                } else {
                    currentIps.put(ip, 1);
                }
            }

            input = scanner.nextLine();
        }
        //"username:
        //{IP} => {count}, {IP} => {count}."
        data.keySet().forEach(username->{
            System.out.println(username+":");
            Map<String,Integer>ips=data.get(username);
            int countIps=ips.size();
            ips.entrySet().forEach(entry->{

                System.out.println(entry.getKey()+" => "+entry.getValue()+", ");
                //TODO: poslednoto ip da e s tochka nakraq
            });
        });
    }
}
