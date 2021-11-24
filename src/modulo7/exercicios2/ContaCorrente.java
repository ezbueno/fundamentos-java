package modulo7.exercicios2;

public class ContaCorrente extends ContaBancaria {

	@Override
	double calcularSaldo() {
		return this.saldo - (this.saldo * 0.1);
	}
}
