package jdev.mentorial.lojavirtual.enums;

public enum TipoEndereco {
	
	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;

	TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Instância: TipoEndereco.COBRANCA, retorna o nome da instância "COBRANCA"
	// Instância: TipoEndereco.COBRANCA.getDescricao() retorna o valor "Cobrança"

}
