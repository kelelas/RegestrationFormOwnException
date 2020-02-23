package com.company.model;

import java.util.HashMap;

/**
 * Created by student on 26.09.2017.
 */
public class Model {
    private HashMap<String, String> userLoginName = new HashMap<>();


    public HashMap<String, String> getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(HashMap<String, String> userLoginName) {
        this.userLoginName = userLoginName;
    }

    public void addNewUserToMap(String login, String name) throws LoginInputException{
        userLoginName.put("kelly12345", "kelly");
        if (userLoginName.containsKey(login))
            throw new LoginInputException();
        else
        userLoginName.put(login, name);
    }
}
