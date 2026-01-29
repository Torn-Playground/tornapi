package eu.tornplayground.tornapi.models.user.report.reportdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.StringDateConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Reference extends Model {

    @JsonProperty("joined")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate joined;

    @JsonProperty("left")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate left;

    @JsonProperty("name")
    private String name;

}
