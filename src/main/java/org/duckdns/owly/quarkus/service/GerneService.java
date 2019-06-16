package org.duckdns.owly.quarkus.service;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.duckdns.owly.quarkus.entities.Genre;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GerneService implements PanacheRepository<Genre> {
}
