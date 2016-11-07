package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.dao.daoimpl.HibernateUserDao;
import io.khasang.helpdesk.entity.Users;
import io.khasang.helpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/user")
@Produces("application/json")
public class RestUserController{

    private final Map<Integer, Users> usersMap = new ConcurrentHashMap<>();

    private final AtomicInteger ids = new AtomicInteger(0);

    @Autowired
    UserService userService;

    @Autowired
    Users users;
//
//    @Autowired
//    Dao dao;
//
//    @Autowired
//    HibernateUserDao hibernateUserDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Collection<Users> list(){
        return userService.getUserList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  Object getById(@PathVariable(value = "id") String inputId, HttpServletResponse response){
        try {
            long userId = Integer.valueOf(inputId);
            Users user = userService.getUserById(userId);
            if (user != null) {
                return user;
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return "User with id: " + userId + " not found.";
            }
        }catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Bad user id format: " + inputId;
        }

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Users create(@RequestBody Users users){
        final int id  = ids.incrementAndGet();
        users.setId(id);
        this.usersMap.put(id, users);
        return users;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Users update(@RequestBody Users users){
        this.usersMap.put((int) users.getId(), users);
        return users;
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public  Users delete(@RequestBody Users users){
        this.usersMap.remove(users);
        return users;
    }
//    @GET
//    @Produces("text/plain")
//    public String getUserName(@PathParam("user") String name){
//        StringBuilder stringBuilder = new StringBuilder("hello, ");
//        stringBuilder.append(name).append("!");
//        return stringBuilder.toString();
//    }

//    @POST
//    @Path("/id")
//    @Consumes("text/plain")
//    public Users regUser(@PathVariable("id") long id){
//        hibernateUserDao.regUser(users);
//
//        return  users;
//    }

//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getUsers() {
//        ArrayList<Users> allUsers = this.findAllUsers();
//        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
//        for (Users user : allUsers) {
//            jsonArrayBuilder.add(Json.createObjectBuilder()
//                    .add("id", users.getId())
//                    .add("login", users.getLogin())
//                    .add("password", users.getPassword()));
//        }
//        return Response.ok(jsonArrayBuilder.build()).build();
//    }
}
