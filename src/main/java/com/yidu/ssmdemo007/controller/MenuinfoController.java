package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.Menuinfo;
import com.yidu.ssmdemo007.bean.Product;
import com.yidu.ssmdemo007.service.MenuinfoServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuinfoController {

    @Autowired
    MenuinfoServlet menuinfoServlet;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public List<Menuinfo> selectAll(){
        return menuinfoServlet.selectAll();
    }
    /**
     * 新增
     * @return
     */
    @RequestMapping("insert")
    @ResponseBody
    public int insert(Menuinfo menuinfo){
        System.out.println(menuinfo);
        return menuinfoServlet.insert(menuinfo);
    }
    /**
     * 删除
     * @return
     */
    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(String menuid){
        return menuinfoServlet.deleteById(menuid);
    }
}
