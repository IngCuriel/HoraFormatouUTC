package com.curiel.horaformatoutc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * <h1>Configuración global de CORS</h1>
 * clase para manejar la configuracion de cors
 * @author Eleazar Curiel Monjaraz
 *
 */


@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
     /**
     * Todos los orígenes y método POST están permitido
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("POST");
    }

}
