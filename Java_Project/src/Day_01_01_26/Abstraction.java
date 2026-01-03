package Day_01_01_26;


public class Abstraction {

	public static void main(String[] args) {
		duty(new Army());
		duty(new Navy());
		duty(new AirForce());
	}
	static void duty(SecurityForce s) {		
		s.protect();
		
	}
}
abstract class SecurityForce {
    abstract void protect();

}
class Army extends SecurityForce {
    void protect() {
        System.out.println("Protect -> Army");
    }
    void useTank() {
        System.out.println("Use Tank");
    }
}
class Navy extends SecurityForce {
    void protect() {
        System.out.println("Protect -> Navy");
    }
    void useShips() {
        System.out.println("Use Ships");
    }
}
class AirForce extends SecurityForce {  
    void protect() {
        System.out.println("Protect -> AirForce");
    }
    void useJets() {
        System.out.println("Use Jets");
    }
}