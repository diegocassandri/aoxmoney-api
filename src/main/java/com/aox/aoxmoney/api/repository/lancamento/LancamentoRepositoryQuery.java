package com.aox.aoxmoney.api.repository.lancamento;

import java.util.List;

import com.aox.aoxmoney.api.model.Lancamento;
import com.aox.aoxmoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
