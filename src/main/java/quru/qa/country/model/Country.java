package quru.qa.country.model;

import java.time.LocalDate;
import java.util.UUID;

public record Country(
        UUID id,
        String name,
        String code,
        LocalDate dateOfIndependence) {
}
