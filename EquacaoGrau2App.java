package equacao;

public class EquacaoGrau2App 
{
	public static void main(String[] args) 
	{	EquacaoGrau2 equacao = new EquacaoGrau2Impl();
		double a = 1;
		double b = -2;
		double c = -3;
		equacao.setA(a);
		equacao.setB(b);
		equacao.setC(c);
		double delta1 = equacao.getDelta();
		int qtd1 = equacao.getQtdRaizes();
		
		switch (qtd1) 
		{	case 1:
			System.out.println("a: " + a + ", b: " + b + ", delta: " + delta1 + ", quantidade: " + qtd1 + ", x' = " + equacao.getRaiz1()+ ", x'' = " + equacao.getRaiz2());
				break;
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz2();
				System.out.println("a: " + a + ", b: " + b + ", delta: " + delta1 + ", quantidade: " + qtd1 + ", x' = " + x1+ ", x'' = " + x2);
				break;
			case 0:
				double x3 = equacao.getRaiz1();
				double x23 = equacao.getRaiz1();
				System.out.println("nao existe raiz negativa");
				break;
		}
		System.out.println();
		
		double a1 = 1;
		double b1 = 8;
		double c1 = 16;
		equacao.setA(a1);
		equacao.setB(b1);
		equacao.setC(c1);
		int qtd2 = equacao.getQtdRaizes();
		double delta2 = equacao.getDelta();
		switch (qtd2) 
		{	case 1:
			System.out.println("a: " + a1 + ", b: " + b1 + "c:"+c1 +", delta: " + delta2 + ", quantidade: " + qtd2 + ", x' = " + equacao.getRaiz1()+ ", x'' = " + equacao.getRaiz2());
				break;
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz1();
				System.out.println("a: " + a1 + ", b: " + b1 + ", b: " + c1+", delta: " + delta2 + ", quantidade: " + qtd2 + ", x' = " + equacao.getRaiz1()+ ", x'' = " + equacao.getRaiz2());
				break;
			case 0:
				double x3 = equacao.getRaiz1();
				double x23 = equacao.getRaiz1();
				System.out.println("nao existe raiz negativa");
				break;
		}
		System.out.println();
		
double a3 = 10;
	double	b3 = 6;
	double	c3 = 10;
	equacao.setA(a3);
		equacao.setB(b3);
		equacao.setC(c3);
		int qtd3 = equacao.getQtdRaizes();
		double delta3 = equacao.getDelta();
		switch (qtd3) 
		{	case 1:
				System.out.println("a: " + a3 + ", b: " + b3 +", c: " +c3+ " e quantidade: " + qtd3);
				break;
			case 2:
				double x1 = equacao.getRaiz1();
				double x2 = equacao.getRaiz1();
				System.out.println("a: " + a3 + ", b: " + b3 + ", delta: " + delta3 + ", quantidade: " + qtd3 + ", x' = " + x1 );
				break;
			case 0:
				double x3 = equacao.getRaiz1();
				double x23 = equacao.getRaiz1();
				System.out.println("DELTA NEGRATIVO"
						+ "" );
				break;
		}
		System.out.println();
	}
}
