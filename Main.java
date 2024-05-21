
public class Main {

	public static void main(String[] args) {
		Exemplu exemplu = new Exemplu();
        try {
            exemplu.doSomething(0); 
            exemplu.doSomething(1); 
        } catch (E2 e) {
            System.out.println("Prins E2");
        }

	}

}
