package com.tap.tflassessment.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class CorsFilter implements Filter {

    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) 
        throws IOException,ServletException{

        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse)response;
      
        //Cors policy configuration
        
        res.setHeader("Access-Control-Allow-Origin","http://localhost:5173");
        res.setHeader("Access-Control-Allow-Credentials","true");
        res.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,OPTIONS");
        res.setHeader("Access-Control-Allow-Headers","Origin,Content-Type,Accept,Authorization");
        res.setHeader("Access-Control-Max-Age","3600");

        if("OPTIONS".equalsIgnoreCase(req.getMethod())){
            res.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy(){

    }
    
}
