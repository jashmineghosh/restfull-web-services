package com.in28minutes.rest.webservices.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
    public class UserResource {

        private UserDaoService service;

        public UserResource(UserDaoService service) {
            this.service = service;
        }

        // GET /users
        @GetMapping("/users")
        public List<User> retrieveAllUsers() {
            return service.findAll();
        }

        // GET /users
        //http://localhost:8080/users
//EntityModel
//WebMvcLinkBuilder
        @GetMapping("/users/{id}")
        public EntityModel<Optional<User>> retrieveUser(@PathVariable int id) {
            Optional<User> user = service.findOne(id);

            if(user==null)
                throw new UserNotFoundException("id:"+id);

            EntityModel<Optional<User>> entityModel = EntityModel.of(user);

            WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllUsers());
            entityModel.add(link.withRel("all-users"));

            return entityModel;
        }
//        @GetMapping("/users/{id}")
//        public Optional<User> retrieveUser(@PathVariable int id) {
////            return service.findOne(id);
//            Optional<User> user = service.findOne(id);
//
//            if(user.isEmpty())
//                throw new UserNotFoundException("id:"+id);
//
//            return user;
//        }
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
//        service.save(user);
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }

}
