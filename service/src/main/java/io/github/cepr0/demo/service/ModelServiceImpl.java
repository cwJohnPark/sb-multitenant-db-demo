package io.github.cepr0.demo.service;

import io.github.cepr0.demo.model.Model;
import io.github.cepr0.demo.repo.ModelRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ModelServiceImpl implements ModelService {
	
	private final ModelRepo modelRepo;
	
	public ModelServiceImpl(ModelRepo modelRepo) {
		this.modelRepo = modelRepo;
	}
	
	@Override
	public Iterable<Model> findAll() {
		return modelRepo.findAll();
	}
	
	@Transactional
	@Override
	public Model save(Model model) {
		return modelRepo.save(model);
	}
}
