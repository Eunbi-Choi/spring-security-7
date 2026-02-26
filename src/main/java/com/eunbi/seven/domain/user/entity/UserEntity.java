package com.eunbi.seven.domain.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    // DB에 저장될 때 그냥 enum으로  세팅해버리면
    // 앞 쪽부터 0번, 1번 이런 식으로 저장되기 때문에
    // 그걸 막고자 @Enumerated(EnumType.STRING)로
    // 선언한 ADMIN, USER로 저장되게 해야 함
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
