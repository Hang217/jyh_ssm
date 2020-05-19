package com.jyh.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.jyh.ssm.dao.IProductDao;
import com.jyh.ssm.domain.Product;
import com.jyh.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值,参数pageSize 是每页显示条数
        PageHelper.startPage(page, size);
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
