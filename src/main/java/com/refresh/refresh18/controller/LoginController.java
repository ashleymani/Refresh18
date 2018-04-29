package com.refresh.refresh18.controller;

import com.refresh.refresh18.data.entity.Churches;
import com.refresh.refresh18.data.entity.Users;
import com.refresh.refresh18.data.repositories.ChurchesRepository;
import com.refresh.refresh18.data.repositories.UsersRepository;
import com.refresh.refresh18.model.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/login")
public class LoginController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ChurchesRepository churchesRepository;

    @PostMapping("/registerUser")
    public ResponseStatus registerUser(@RequestBody Users users) {
        String responseMsg = "Success";
        try{
            Users user = usersRepository.findOne(users.getMobileNumber());
            if(user != null && user.getUserName() != null) {
                responseMsg = user.getMobileNumber() + " is already registered. Please try to login.";
            } else {
                usersRepository.save(users);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ResponseStatus status = new ResponseStatus(responseMsg);
        return status;
    }

    @PostMapping("/loginUser")
    public ResponseStatus loginUser(@RequestBody Users users) {
        String responseMsg = "Success";
        try{
            Users user = usersRepository.findOne(users.getMobileNumber());
            if(user == null) {
                responseMsg = "You are not a registered user. Please register.";
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ResponseStatus status = new ResponseStatus(responseMsg);
        return status;
    }

    @PostMapping("/registerChurch")
    public ResponseStatus registerChurch(@RequestBody Churches churches) {
        String responseMsg = "Success";
        try{
            Churches church = churchesRepository.findOne(churches.getChurchID());
            if(church != null && church.getPocMobile() != null) {
                responseMsg = church.getName() + " is already registered by " + church.getPocName();
            } else {
                churchesRepository.save(churches);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ResponseStatus status = new ResponseStatus(responseMsg);
        return status;
    }
}
