package com.controller;

import com.Province;
import com.dao.ProviceDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Queryjson1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接受了请求");
       String json="{}";
        String proid=request.getParameter("proid");
        if(proid!=null&&proid.trim().length()>0) {
            ProviceDao dao = new ProviceDao();
            Province p=dao.queryProviceByid(Integer.valueOf(proid));
            //使用jackson将province转为json
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(p);
        }
        //指定服务器（servlet）返回给浏览器的是json格式的数据
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.print(json);
        pw.flush();
        pw.close();

    }
}
