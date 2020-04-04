package com.app.controller;

import com.app.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.Menu;
import com.app.service.MenuService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping ("/getList")
    public List<Menu> getList(){
        List<Menu> menuList = menuService.getList();
        return menuList;
    }

}
