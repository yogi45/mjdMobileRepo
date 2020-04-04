package com.app.service;

import java.util.List;

import com.app.entity.Menu;
import com.app.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	public List<Menu>  getList() {
		List<Menu> Menu = menuRepository.findAll();
		return Menu;
	}

}
