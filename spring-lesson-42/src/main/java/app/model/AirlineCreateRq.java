package app.model;

import lombok.Data;

import java.util.UUID;

@Data
public class AirlineCreateRq {

    String name;
    String code;
    String country;

}

