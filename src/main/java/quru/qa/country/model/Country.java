package quru.qa.country.model;

import java.util.Date;

public record Country(String name,
                      String code,
                      Date dateOfIndependent) {
}
