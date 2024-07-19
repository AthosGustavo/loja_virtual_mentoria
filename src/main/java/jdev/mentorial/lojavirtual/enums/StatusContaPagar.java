package jdev.mentorial.lojavirtual.enums;

public enum StatusContaPagar {
	
	COBRANCA("Pagar"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	QUITADA("QUITADA"),
	NEGOCIADA("Renegociada"),
	ALUGUEL("Aluguel"),
	FUNCIONARIO("Funcionário");
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


}
