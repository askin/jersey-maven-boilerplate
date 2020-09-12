/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.askin.jersey.maven.boilerplate.ws;

import java.io.IOException;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author askin
 */
public class Application extends ResourceConfig{
    
    public Application() throws IOException{
        packages("com.github.askin.jersey.maven.boilerplate.ws.resource");        
    }
    
}
