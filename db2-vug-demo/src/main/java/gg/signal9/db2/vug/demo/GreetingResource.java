package gg.signal9.db2.vug.demo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.Template;

@Path("/hello")
public class GreetingResource {
    @Inject
    Template helloPage;

    @Inject
    DemoService demoService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance hello() {
        return helloPage.data("demo", demoService);
    }
}