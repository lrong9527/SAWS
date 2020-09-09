package com.saws.controller;

import com.saws.dao.FinanceDao;
import com.saws.entity.Finance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("finance")
public class FinanceController {
    @Resource
    private FinanceDao financeDao;


    @GetMapping
    public ModelAndView list(){
        List<Finance> financeList= financeDao.findAll();

        ModelAndView modelAndVie=new ModelAndView("allFinance");
        modelAndVie.addObject("list",financeList);
        return modelAndVie;
    }

    @ResponseBody
    @PostMapping
    public String insert(@RequestBody Finance finance){
        financeDao.insert(finance);
        return "success";
    }
}
