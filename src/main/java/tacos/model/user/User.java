package tacos.model.user;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@RequiredArgsConstructor
@Table(name = "users")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private final String email;

    @Column(name = "username")
    private final String username;

    @Column(name = "password")
    private final String password;

    @Column(name = "fullname")
    private final String fullname;

    @Column(name = "street")
    private final String street;

    @Column(name = "city")
    private final String city;

    @Column(name = "state")
    private final String state;

    @Column(name = "zip")
    private final String zip;

    @Column(name = "phoneNumber")
    private final String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
