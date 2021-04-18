package com.controller;

import com.dao.QueryDao;
import com.entity.City;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class QueryCityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post接受了Ajax请求");
        String json="{}";
        String proid=request.getParameter("proid");
        if(proid!=null&&!"".equals(proid.trim()))
        {
            QueryDao dao=new QueryDao();
            List<City> list=dao.querycity(Integer.valueOf(proid));
            if (list!=null){
                ObjectMapper om=new ObjectMapper();
                json=om.writeValueAsString(list);
            }
        }
        response.setContentType("application/x-www-form-urlencoded;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.print(json);
        pw.flush();
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
