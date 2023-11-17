package mx.oax.mhd.demopostman.controller;

import mx.oax.mhd.demopostman.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("v1/users")
public class UsersController {

    private HashMap<Integer, User> allUsers;

    public UsersController() {
        this.allUsers = new HashMap<>();
        User u = new User(1, "Nicola", "Tesla");
        allUsers.put(u.getId(), u);
        u = new User(2, "Albert", "Einstein");
        allUsers.put(u.getId(), u);
        u = new User(3, "Alejandro", "Magno");
        allUsers.put(u.getId(), u);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<?> getUser(
            @RequestHeader Map<String, String> headers,
            @PathVariable("userId") Integer userId) {

        if (allUsers.containsKey(userId)) {
            return ResponseEntity
                    .ok()
                    .body(allUsers.get(userId));
        } else {
            return ResponseEntity
                    .notFound()
                    .build();
        }
    }


}
