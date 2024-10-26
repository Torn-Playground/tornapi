package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Cooldowns extends Model {

    @JsonProperty("drug")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration drug;

    @JsonProperty("medical")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration medical;

    @JsonProperty("booster")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration booster;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cooldowns cooldowns = (Cooldowns) o;
        return Objects.equals(drug, cooldowns.drug) && Objects.equals(medical, cooldowns.medical) && Objects.equals(booster, cooldowns.booster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drug, medical, booster);
    }

}
