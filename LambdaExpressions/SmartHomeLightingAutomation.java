package LambdaExpressions;
import java.util.function.Consumer;
	interface LightBehavior {
	    void execute(String trigger);
	}
	public class SmartHomeLightingAutomation {
	    public static void al(String trigger, LightBehavior behavior) {
	        System.out.println("Trigger detected: " + trigger);
	        behavior.execute(trigger);
	        System.out.println("---");
	    }
	    public static void main(String[] args) {
	        LightBehavior motionPattern = (t) -> {
	            System.out.println(" Pattern:    Bright White    for movement.");
	            System.out.println("System command: Set all lights to 100% brightness, cool white color.");
	        };
	        LightBehavior eveningPattern = (t) -> {
	            System.out.println(" Pattern:   Warm Dim    for evening ambience.");
	            System.out.println("System command: Set living room lights to 40% brightness, warm color.");
	        };
	        LightBehavior movieMode = (t) -> {
	            System.out.println(" Pattern:   Movie Dim   from voice command.");
	            System.out.println("System command: Dim main lights to 10%, turn on backlighting.");
	        };
	        al("Motion Sensor Activated", motionPattern);
	        al("Time: 7:00 PM", eveningPattern);
	        al("Voice Command: Movie Mode", movieMode);
	    }
	}