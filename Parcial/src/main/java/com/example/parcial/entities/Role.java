package com.example.parcial.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_role;
    @Column(name="rol", length = 64,  nullable = false)
    private String rol;

    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User user;

    public Long getId() {
        return id_role;
    }

    public void setId(Long id_role) {
        this.id_role = id_role;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
