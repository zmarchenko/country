package quru.qa.country.mapper;

import org.mapstruct.Mapper;
import quru.qa.country.data.CountryEntity;
import quru.qa.country.model.Country;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toModel(CountryEntity countryEntity);

    CountryEntity toEntity(Country countryModel);

}