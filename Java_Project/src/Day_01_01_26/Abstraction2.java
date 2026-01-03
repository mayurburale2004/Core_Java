package Day_01_01_26;


public class Abstraction2 {

	public static void main(String[] args) {
		
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());

	}
	static void duty(Trainer t) {
		t.teaches();
	}

}

abstract class Trainer {
abstract void teaches(); 
}
class JavaTrainer extends Trainer{
void teaches() {
	System.out.println("Teaches Java...  ");
}
}
class AptiTrainer extends Trainer{
void teaches() {
	System.out.println("Teaches Aptitude...  ");
}
}
class TestingTrainer extends Trainer{
void teaches() {
	System.out.println("Teaches Testing...  ");
}
}
