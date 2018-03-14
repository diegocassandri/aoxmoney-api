package com.aox.aoxmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aox.aoxmoney.api.model.Lancamento;
import com.aox.aoxmoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>,LancamentoRepositoryQuery{

}
