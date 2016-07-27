package com.example.bug.model;

public class Project {
    private Role role;

    @Override
    public String toString() {
        return "Project{" +
                "role=" + role +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Project() {
    }
}
