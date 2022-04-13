package com.capgemini.cleancode.functions;

import com.capgemini.cleancode.srp.User;

public class ReturnEarly {
    boolean isSystemUp;

    private String getUserInfos(User user, String login){
        if(isSystemUp) {
            if (user != null && !"".equals(user.getLastName())) {
                if (login.equals(user.getLogin())) {
                    return user.getPersonalInfos();
                }
                return "invalid login";
            }
            return "invalid user";
        }
        return "the system is down";
    }





    private String getUserInfos2(User user, String login){
        if(!isSystemUp) return "the system is down";

        if (user == null || "".equals(user.getLastName())) return "invalid user";

        if (!login.equals(user.getLogin())) return "invalid login";

        return user.getPersonalInfos();
    }
}
