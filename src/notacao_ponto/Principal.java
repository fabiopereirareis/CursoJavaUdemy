package notacao_ponto;

public class Principal {

	public static void main(String[] args) {
		
//		m�todo 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		ClasseA a = new ClasseA();
		ClasseB b = a.getB();
		ClasseC c = b.getC();
		
		c.imprimir();
//		m�todo 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		m�todo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		new ClasseA().getB().getC().imprimir();
//		m�todo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
	}
}
