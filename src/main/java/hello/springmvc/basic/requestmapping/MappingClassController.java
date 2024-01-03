package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    /**
     * Get /mapping/users
     * @return
     */
    @GetMapping
    public String user(){
        return "get users";
    }

    /**
     * Post /mapping/users
     * @return
     */
    @PostMapping
    public String addUser(){
        return "post user";
    }

    /**
     * Get /mapping/users/{userId}
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get userId =" + userId;
    }

    /**
     * Patch /mapping/users/{userId}
     */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId =" + userId;
    }

    /**
     * DELETE /mapping/users/{userId}
     * @param userId
     * @return
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId = " + userId;
    }
}
