package equacao;

/**
 *	Uma equa��o do segundo grau representa
 *	os pontos que formam uma par�bola no plano
 *	cartesiano. Toda equa��o do segundo grau
 *	obedece a equa��o ax2 + bx + c = 0.
 */
public interface EquacaoGrau2 
{
	/**
	 * Altera o par�metro a da equa��o.
	 * @param a novo par�metro a
	 */
	public void setA(double a);
	
	/**
	 * Altera o par�metro b da equa��o.
	 * @param a novo par�metro b
	 */
	public void setB(double b);
	
	/**
	 * Altera o par�metro c da equa��o.
	 * @param a novo par�metro c
	 */
	public void setC(double c);
	
	/**
	 * Retorna o valor do par�metro delta da equa��o.
	 * @return valor do delta
	 */
	public double getDelta();
	
	/**
	 * Retorna a quantidade de ra�zes da equa��o.
	 * Uma equa��o pode possuir: zero ra�zes, 
	 * se delta < 0; uma raiz, se delta = 0 ou 
	 * duas ra�zes, se delta > 0.
	 * @return quantidade de ra�zes
	 */
	public int getQtdRaizes();
	
	/**
	 * Retorna a primeira raiz da equa��o. Se a equa��o 
	 * n�o possuir ra�z, deve retornar a constante Double.NaN.
	 * Se a equa��o possuir uma raiz, os m�todos getRaiz1 e getRaiz2
	 * devem retornar o mesmo valor.  
	 * @return valor da primeira raiz
	 */
	public double getRaiz1(); 
	
	/**
	 * Retorna a segunda raiz da equa��o. Se a equa��o 
	 * n�o possuir ra�z, deve retornar a constante Double.NaN.
	 * Se a equa��o possuir uma raiz, os m�todos getRaiz1 e getRaiz2
	 * devem retornar o mesmo valor.  
	 * @return valor da segunda raiz
	 */
	public double getRaiz2();
}
