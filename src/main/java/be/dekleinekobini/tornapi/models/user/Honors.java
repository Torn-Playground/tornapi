package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Honors extends Model {

    private long id;
    private LocalDateTime awarded;

    public static List<Honors> of(JsonNode json) {
        List<Long> awarded = OBJECT_MAPPER.convertValue(json.get("honors_awarded"), new TypeReference<>() {
        });
        List<LocalDateTime> times = OBJECT_MAPPER
                .copy()
                .convertValue(json.get("honors_time"), new TypeReference<List<Long>>() {
                })
                .stream()
                .map((epoch) -> Instant.ofEpochSecond(epoch).atOffset(ZoneOffset.UTC).toLocalDateTime())
                .collect(Collectors.toList());
        if (awarded.size() != times.size())
            throw new IllegalStateException("Awarded honors and times should always be the same size!");

        List<Honors> honors = new ArrayList<>();
        for (int i = 0; i < awarded.size(); i++) {
            Honors honor = new Honors();
            honor.setId(awarded.get(i));
            honor.setAwarded(times.get(i));

            honors.add(honor);
        }

        return honors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getAwarded() {
        return awarded;
    }

    public void setAwarded(LocalDateTime awarded) {
        this.awarded = awarded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honors honors = (Honors) o;
        return id == honors.id && Objects.equals(awarded, honors.awarded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, awarded);
    }

}
