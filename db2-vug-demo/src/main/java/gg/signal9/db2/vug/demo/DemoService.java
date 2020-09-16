package gg.signal9.db2.vug.demo;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DemoService {
    public DemoService(){
        this.arch = System.getProperty("os.arch");
        this.hostname = System.getenv("HOSTNAME");
    }
    public String arch;
    public String hostname;
    
}