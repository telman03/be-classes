package app.model;

import lombok.Data;

import java.util.UUID;


@Data
public class Airline {
    UUID id;
    String name;
    String code;
    String country;
}
