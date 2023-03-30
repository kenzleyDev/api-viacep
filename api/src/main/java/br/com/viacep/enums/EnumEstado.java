package br.com.viacep.enums;

public enum EnumEstado {

    ACRE(20.33, "NORTE", "AC"),
    AMAPA(20.33, "NORTE", "AP"),
    AMAZONAS(20.33, "NORTE", "AM"),
    PARA(20.33, "NORTE", "PA"),
    RONDONIA(20.33, "NORTE", "RO"),
    RORAIMA(20.33, "NORTE", "RR"),
    TOCANTINS(20.33, "NORTE", "TO"),
    ALAGOAS(15.98, "NORDESTE", "AL"),
    BAHIA(15.98, "NORDESTE", "BA"),
    CEARA(15.98, "NORDESTE", "CE"),
    MARANHAO(15.98, "NORDESTE", "MA"),
    PARAIBA(15.98, "NORDESTE", "PB"),
    PERNAMBUCO(15.98, "NORDESTE", "PE"),
    PIAUI(15.98, "NORDESTE", "PI"),
    RIO_GRANDE_DO_NORTE(15.98, "NORDESTE", "RN"),
    SERGIPE(15.98, "NORDESTE", "SE"),
    GOIAS(12.50, "CENTRO-OESTE", "GO"),
    MATO_GROSSO(12.50, "CENTRO-OESTE", "MT"),
    MATO_GROSSO_DO_SUL(12.50, "CENTRO-OESTE", "MS"),
    ESPIRITO_SANTO(7.85, "SUDESTE", "ES"),
    MINAS_GERAIS(7.85, "SUDESTE", "MG"),
    RIO_DE_JANEIRO(7.85, "SUDESTE", "RJ"),
    SAO_PAULO(7.85, "SUDESTE", "SP"),
    PARANA(17.30, "SUL", "PR"),
    SANTA_CATARINA(17.30, "SUL", "SC"),
    RIO_GRANDE_DO_SUL(17.30, "SUL", "RS");

    private Double valorFrete;
    private String regiao;
    private String uf;


    EnumEstado(Double valorFrete, String regiao, String uf) {
        this.valorFrete = valorFrete;
        this.regiao = regiao;
        this.uf = uf;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getUf() {
        return uf;
    }
}
