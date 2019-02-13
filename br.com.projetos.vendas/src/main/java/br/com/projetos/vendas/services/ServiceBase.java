package br.com.projetos.vendas.services;

import org.modelmapper.ModelMapper;

public class ServiceBase {

    protected ModelMapper getModelMapper() {
	return new ModelMapper();
    }
    
}
