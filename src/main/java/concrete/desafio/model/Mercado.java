package concrete.desafio.model;

public class Mercado {

	private int a;
	private int b;
	private float precoA;
	private float precoB;
	private float precoC;
	private float precoD;
	private float precoTotal;
	private int ocorrenciasA;
	private int ocorrenciasB;
	private int ocorrenciasC;
	private int ocorrenciasD;
	
	// Construtor para o uso do método calcular
	private Mercado(int a, int b, float precoA, float precoB, float precoC, float precoD, float precoTotal,
			int ocorrenciasA, int ocorrenciasB, int ocorrenciasC, int ocorrenciasD) {

		this.a = a;
		this.b = b;
		this.precoA = precoA;
		this.precoB = precoB;
		this.precoC = precoC;
		this.precoD = precoD;
		this.precoTotal = precoTotal;
		this.ocorrenciasA = ocorrenciasA;
		this.ocorrenciasB = ocorrenciasB;
		this.ocorrenciasC = ocorrenciasC;
		this.ocorrenciasD = ocorrenciasD;
	}
	
	// Construtor para o uso de outra classe
	public Mercado(int a, int b, int ocorrenciasA, int ocorrenciasB, int ocorrenciasC, int ocorrenciasD) {

		this.a = a;
		this.b = b;
		this.ocorrenciasA = ocorrenciasA;
		this.ocorrenciasB = ocorrenciasB;
		this.ocorrenciasC = ocorrenciasC;
		this.ocorrenciasD = ocorrenciasD;
		this.precoA = 0;
		this.precoB = 0;
		this.precoC = 0;
		this.precoD = 0;
		this.precoTotal = 0;
	}

	public Mercado calcular() {

		this.precoA = this.ocorrenciasA * 50 + this.a * 130;
		this.precoB = this.ocorrenciasB * 30 + this.b * 45;
		this.precoC = this.ocorrenciasC * 20;
		this.precoD = this.ocorrenciasD * 15;
		this.precoTotal = this.precoA + this.precoB + this.precoC + this.precoD;
		
		return new Mercado(this.a, this.b, this.precoA, this.precoB, this.precoC, this.precoD, this.precoTotal, 
				this.ocorrenciasA, this.ocorrenciasB, this.ocorrenciasC, this.ocorrenciasD);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public float getPrecoA() {
		return precoA;
	}

	public void setPrecoA(float precoA) {
		this.precoA = precoA;
	}

	public float getPrecoB() {
		return precoB;
	}

	public void setPrecoB(float precoB) {
		this.precoB = precoB;
	}

	public float getPrecoC() {
		return precoC;
	}

	public void setPrecoC(float precoC) {
		this.precoC = precoC;
	}

	public float getPrecoD() {
		return precoD;
	}

	public void setPrecoD(float precoD) {
		this.precoD = precoD;
	}

	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}

	public int getOcorrenciasA() {
		return ocorrenciasA;
	}

	public void setOcorrenciasA(int ocorrenciasA) {
		this.ocorrenciasA = ocorrenciasA;
	}

	public int getOcorrenciasB() {
		return ocorrenciasB;
	}

	public void setOcorrenciasB(int ocorrenciasB) {
		this.ocorrenciasB = ocorrenciasB;
	}

	public int getOcorrenciasC() {
		return ocorrenciasC;
	}

	public void setOcorrenciasC(int ocorrenciasC) {
		this.ocorrenciasC = ocorrenciasC;
	}

	public int getOcorrenciasD() {
		return ocorrenciasD;
	}

	public void setOcorrenciasD(int ocorrenciasD) {
		this.ocorrenciasD = ocorrenciasD;
	}
}
