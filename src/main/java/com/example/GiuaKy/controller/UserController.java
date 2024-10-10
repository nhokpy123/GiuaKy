package com.example.GiuaKy.controller;


import com.example.GiuaKy.dto.request.UserReqestDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping(value = "/")

    public String addUser(@RequestBody UserReqestDTO userDTO) {
        return "success";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserReqestDTO userDTO) {
        System.out.println("Request update userId" + userId);
        return "User updated successfully";
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam(required = false) boolean status) {
        System.out.println("Request change status userId" + userId);
        return "User changed successfully";

    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId){
        return "User deleted";
    }

    @GetMapping("/{userId}")
    public UserReqestDTO getUser(@PathVariable int userId) {
        System.out.println("Request get user detail by userID" + userId);
        return new UserReqestDTO("Phi", "Nguyen", "Phi101066", "Ip14Plus");
    }


    @GetMapping("/list")
    public List<UserReqestDTO> getUserList(
            @RequestParam(required = false) String email,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {
        System.out.println("Request get user list");
        return List.of(new UserReqestDTO("Phi", "Nguyen", "Phi101066", "Ip14Plus"),
                new UserReqestDTO("Phi", "Nguyen", "Phi101066", "Ip14Plus"));
    }
}
