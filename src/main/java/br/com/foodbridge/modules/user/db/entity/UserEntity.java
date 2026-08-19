package br.com.foodbridge.modules.user.db.entity;

import br.com.foodbridge.modules.user.enums.RoleEnumType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String cnpj;

    private String phone;

    @Column(nullable = false)
    private RoleEnumType role;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @CreationTimestamp
    private LocalDate created_at;

    @UpdateTimestamp
    private LocalDate update_at;


}
