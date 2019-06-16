package org.duckdns.owly.quarkus.resources;

import org.duckdns.owly.quarkus.domain.Count;
import org.duckdns.owly.quarkus.service.GerneService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/genre")
public class GenreResource {
    @Inject
    GerneService genreService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Count getCount() {
        Count count = new Count();
        count.count = genreService.count();
        return count;
    }
}
