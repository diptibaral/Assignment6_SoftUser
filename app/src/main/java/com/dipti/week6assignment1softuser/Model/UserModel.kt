package com.dipti.week6assignment1softuser.Model

class UserModel {

    fun Login(username: String, password: String): Boolean {
        return username.toLowerCase().equals("softwarica") &&
                password.toLowerCase().equals("coventry");
    }
}