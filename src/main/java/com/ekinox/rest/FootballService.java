package com.ekinox.rest;

import com.ekinox.entity.LiveEvent;
import com.google.gson.Gson;
import com.googlecode.genericdao.search.Search;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/football")
public class FootballService {

  @GET
  @Path("/{param}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getMsg(@PathParam("param") String msg) {


//    Configuration configuration = new Configuration().configure();
//
//    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//
//    SessionFactory factory = configuration.buildSessionFactory(builder.build());
//    Session session = factory.openSession();
//    List list = session.createQuery("FROM LiveEvent").list();


    Search search = new Search(LiveEvent.class);
      search.
      Gson gson = new Gson();
    String s = gson.toJson(list);

    return Response.status(200).entity(s).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON + "; charset=ISO-8859-15").build();

  }

}


