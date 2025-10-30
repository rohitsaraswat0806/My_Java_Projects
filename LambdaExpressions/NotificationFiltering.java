package LambdaExpressions;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class NotificationFiltering{
    static class Alert {
        private final String type;
        private final String severity;
        private final String message;

        public Alert(String type, String severity, String message) {
            this.type = type;
            this.severity = severity;
            this.message = message;
        }

        public String getType() { return type; }
        public String getSeverity() { return severity; }
        public String toString() {
            return String.format("[%s/%s]", type, severity);
        }
    }
    public static List<Alert> filterAlerts(List<Alert> alerts, Predicate<Alert> predicate) {
        return alerts.stream()
                     .filter(predicate)
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Alert> allAlerts = List.of(
            new Alert("STAT", "CRITICAL", "Cardiac arrest."),
            new Alert("MONITOR", "LOW", "Vitals stable."),
            new Alert("STAT", "HIGH", "Sepsis intervention needed."),
            new Alert("ORDER", "MEDIUM", "Pharmacist review."),
            new Alert("STAT", "CRITICAL", "Severe blood loss.")
        );
        Predicate<Alert> isCritical = alert -> alert.getSeverity().equals("CRITICAL");
        Predicate<Alert> isStatType = alert -> alert.getType().equals("STAT");

        Predicate<Alert> isUrgent = isStatType.and(isCritical);
        List<Alert> urgentAlerts = filterAlerts(allAlerts, isUrgent);

        System.out.println("--- All Alerts ---");
        allAlerts.forEach(System.out::println);

        System.out.println("\n--- Filtered (STAT AND CRITICAL) ---");
        urgentAlerts.forEach(System.out::println);
        System.out.println("Total Urgent Alerts: " + urgentAlerts.size());
    }
}