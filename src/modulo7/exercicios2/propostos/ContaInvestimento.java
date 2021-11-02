package modulo7.exercicios2.propostos;

public class ContaInvestimento extends ContaBancaria {

	@Override
	double calcularSaldo() {
		return this.saldo + (this.saldo * 0.05);
	}
}
