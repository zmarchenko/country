package quru.qa.country.model;

import java.time.LocalDate;

public record Country(String name,
                      String code,
                      LocalDate dateOfIndependent) {
}
