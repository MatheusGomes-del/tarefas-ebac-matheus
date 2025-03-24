public class Media {

	private int num1;
	private int num2;
	private int num3;
	private int num4;


	public Media(int numero1, int numero2, int numero3, int numero4) {
		this.num1 = numero1;
		this.num2 = numero2;
		this.num3 = numero3;
		this.num4 = numero4;
	}

	public int calculaMedia() {
		int soma = this.num1 + this.num2 + this.num3 + this.num4;
		int media = soma / 4;

		return media;
	}

}
