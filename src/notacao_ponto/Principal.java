package notacao_ponto;

public class Principal {

	public static void main(String[] args) {
		
//		método 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		ClasseA a = new ClasseA();
		ClasseB b = a.getB();
		ClasseC c = b.getC();
		
		c.imprimir();
//		método 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		método 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
		new ClasseA().getB().getC().imprimir();
//		método 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
	}
}
