package com.aox.aoxmoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aox.aoxmoney.api.model.Lancamento;
import com.aox.aoxmoney.api.model.Pessoa;
import com.aox.aoxmoney.api.repository.LancamentoRepository;
import com.aox.aoxmoney.api.repository.PessoaRepository;
import com.aox.aoxmoney.api.service.exception.PessoaInativaOuInexistenteException;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Lancamento buscaPeloCodigo(Long codigo) {
		Lancamento lancamentoSalvo = lancamentoRepository.findOne(codigo);
		if(lancamentoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return lancamentoSalvo;
	}
	

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInativaOuInexistenteException();
		}
		return lancamentoRepository.save(lancamento);
	}

}
