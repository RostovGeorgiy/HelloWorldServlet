package ru.academits.helloworldservlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@SuppressWarnings("unused")
@WebFilter("")
public class AnnotationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        if (response instanceof HttpServletResponse httpResponse) {
            httpResponse.addHeader("X-Test-1", "Test-1");
        }

        chain.doFilter(request, response);
    }
}