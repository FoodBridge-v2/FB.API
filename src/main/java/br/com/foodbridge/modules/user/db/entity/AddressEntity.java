package br.com.foodbridge.modules.user.db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String street;

    private String number;

    private String complement;

    private String city;

    private String state;

    private String zip_code;

    private String latitude;

    private String longitude;
}
