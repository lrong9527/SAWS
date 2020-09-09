package com.saws.dao;

import com.saws.entity.Finance;
import com.saws.entity.mapper.FinanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FinanceDao {
    @Resource
    private FinanceMapper financeMapper;

    public List<Finance> findAll() {
        return financeMapper.findAll();
    }

    public void insert(Finance finance) {
        financeMapper.insertFinance(finance);
    }

}
