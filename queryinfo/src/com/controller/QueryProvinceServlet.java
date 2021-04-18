package com.controller;

import com.dao.ProviceDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QueryProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接受了ajax请求");
        //处理参数
        String shenfengming="默认无数据";
        String proid=request.getParameter("proid");
        if(proid!=null&&!"".equals(proid)) {
            ProviceDao dao = new ProviceDao();
            shenfengming=dao.queryProviceNameByid(Integer.valueOf(proid));
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.print(shenfengming);
        pw.flush();
        pw.close();
    }
}
