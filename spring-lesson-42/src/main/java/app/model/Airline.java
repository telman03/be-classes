package app.model;

import lombok.Data;

import java.util.Optional;
import java.util.UUID;


@Data
public class Airline {
    Optional<UUID> id;
    String name;
    String code;
    String country;
}
