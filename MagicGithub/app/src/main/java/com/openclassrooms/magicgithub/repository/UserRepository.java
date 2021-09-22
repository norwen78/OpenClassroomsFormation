package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: Done
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();
        // TODO: Done
    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);
        // TODO: Done
    }
}
