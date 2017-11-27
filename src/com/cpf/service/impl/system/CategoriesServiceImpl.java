package com.cpf.service.impl.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpf.beans.transaction.TraCategories;
import com.cpf.mapper.transaction.TraCategoriesMapper;
import com.cpf.service.system.CategoriesService;

@Service("categoriesService")
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private TraCategoriesMapper categoriesMapper;

	@Override
	public List<TraCategories> findCategories() {
		// TODO Auto-generated method stub
		return categoriesMapper.findCategories();
	}
	
}
