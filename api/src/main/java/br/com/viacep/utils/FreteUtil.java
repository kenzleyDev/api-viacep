package br.com.viacep.utils;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;

@Component
public class FreteUtil {

    private final static String FRETE_NORTE = "20.83";
    private final static String FRETE_SUL = "17.30";
    private final static String FRETE_NORDESTE = "15.98";
    private final static String FRETE_SUDESTE = "7.85";
    private final static String FRETE_CENTRO_OESTE = "12.50";

    public static String buscaValorFretePorEstado(String estado) {

        HashMap<String, BigDecimal> valorFrete = new HashMap<>();

        valorFrete.put("AC", new BigDecimal(FRETE_NORTE));
        valorFrete.put("AP", new BigDecimal(FRETE_NORTE));
        valorFrete.put("AM", new BigDecimal(FRETE_NORTE));
        valorFrete.put("PA", new BigDecimal(FRETE_NORTE));
        valorFrete.put("RO", new BigDecimal(FRETE_NORTE));
        valorFrete.put("RR", new BigDecimal(FRETE_NORTE));
        valorFrete.put("TO", new BigDecimal(FRETE_NORTE));

        valorFrete.put("AL", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("BA", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("CE", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("MA", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("PB", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("PE", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("PI", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("RN", new BigDecimal(FRETE_NORDESTE));
        valorFrete.put("SE", new BigDecimal(FRETE_NORDESTE));

        valorFrete.put("GO", new BigDecimal(FRETE_CENTRO_OESTE));
        valorFrete.put("MT", new BigDecimal(FRETE_CENTRO_OESTE));
        valorFrete.put("MS", new BigDecimal(FRETE_CENTRO_OESTE));
        valorFrete.put("DF", new BigDecimal(FRETE_CENTRO_OESTE));

        valorFrete.put("ES", new BigDecimal(FRETE_SUDESTE));
        valorFrete.put("MG", new BigDecimal(FRETE_SUDESTE));
        valorFrete.put("RJ", new BigDecimal(FRETE_SUDESTE));
        valorFrete.put("SP", new BigDecimal(FRETE_SUDESTE));

        valorFrete.put("PR", new BigDecimal(FRETE_SUL));
        valorFrete.put("SC", new BigDecimal(FRETE_SUL));
        valorFrete.put("RS", new BigDecimal(FRETE_SUL));

        return valorFrete.get(estado).toString();

    }
}
