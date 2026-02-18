package com.tap.demo.filter;

import java.util.List;


import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.tap.demo.util.JWTUtil;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {

    private final JWTUtil jwtUtil;

    public JWTAuthFilter(JWTUtil jWTUtil) {
        this.jwtUtil=jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException, java.io.IOException {
        System.out.println("JWT FILTER CALLED :" + request.getRequestURI()); //returns the url of api
        String header = request.getHeader("Authorization");                 //get authorization header from request, the header starts with Bearer <token>
        System.out.println("Authorization header = " + header);

        if(header!=null && header.startsWith("Bearer ")){
            try{
                System.out.println("Token extracted");
                String token=header.substring(7);
                String username=jwtUtil.extractUsername(token);
                String role=jwtUtil.extractRole(token);

                System.out.println("Username= "+username);
                System.out.println("role= "+role);

                SimpleGrantedAuthority authority=new SimpleGrantedAuthority("role"+role);

                if(username!=null &&
                SecurityContextHolder.getContext().getAuthentication()==null&&
                jwtUtil.isTokenValid(token)){
                UsernamePasswordAuthenticationToken authToken=new UsernamePasswordAuthenticationToken(username, null,List.of(authority));
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
            catch(Exception e){
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return;
            }


            }
            filterChain.doFilter(request,response);
        }
    }


