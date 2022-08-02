package com.hoaxify.ws.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.ws.shared.View;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull(message="{hoxify.validation.username.NotNull.message}")
    @Size(min = 3, max = 255)
    @UniqueUsername
    @JsonView(View.Base.class)
    private String username;
    @NotNull
    @Size(min = 3, max = 255)
    @JsonView(View.Base.class)
    private String displayName;
    @NotNull
    @Size(min = 8, max = 255)
    @Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{hoxify.validation.password.Pattern.message}")
    private String password;

    @JsonView(View.Base.class)
    private String image;

}
