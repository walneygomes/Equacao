package equacao;

public class EquacaoGrau2Impl implements EquacaoGrau2 
{
	private double a;
	private double b;
	private double c;

	public void setA(double a) 
	{	this.a = a;	
	}

	public void setB(double b) 
	{	this.b = b;	
	}

	public void setC(double c) 
	{	this.c = c;	
	}

	public double getDelta() 
	{	return (b*b) - 4 * a * c;
	}

	public int getQtdRaizes() 
	{	int qtd;
		if (getDelta() > 0)
		{	qtd = 2;
		} else if (getDelta() == 0)
		{	qtd = 1;
		} else 
		{	qtd = 0;
		}
		return qtd;
	}

	public double getRaiz1()
	{	return (-b + Math.sqrt(getDelta())) / (2 * a); 
	}

	public double getRaiz2() 
	{	return (-b - Math.sqrt(getDelta())) / 2 * a;
	}
}
