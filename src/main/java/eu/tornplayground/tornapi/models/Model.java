package eu.tornplayground.tornapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public abstract class Model {
}

