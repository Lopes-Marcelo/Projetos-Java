package com.cursoimersao.projetocursodioimersaospringboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    
    public int somar(int num1, int num2){
        
        return num1 + num2;
    }
}
