package com.example.bug.model;

import java.util.List;

public class Project {
    List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "roles=" + roles +
                '}';
    }
}
