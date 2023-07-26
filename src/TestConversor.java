
public class TestConversor extends Conversor{

	public static void main(String[] args) {
		TestConversor test1= new TestConversor();
		test1.test();
	}
	public void test() {
		Conversor conversor  = new Conversor();
		conversor.menuPrincipal(getSeleccion());
	}
}
