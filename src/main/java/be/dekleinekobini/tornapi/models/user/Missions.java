package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Missions extends Model {

    @JsonProperty("Duke")
    private List<Mission> duke;

    public List<Mission> getDuke() {
        return duke;
    }

    public void setDuke(List<Mission> duke) {
        this.duke = duke;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Missions missions = (Missions) o;
        return Objects.equals(duke, missions.duke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duke);
    }

    public static class Mission {

        private String title;
        private Status status;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Mission mission = (Mission) o;
            return Objects.equals(title, mission.title) && status == mission.status;
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, status);
        }

        public enum Status {

            COMPLETED, FAILED, ACCEPTED, NOT_ACCEPTED;

            private static final Map<String, Status> namesMap = new HashMap<>() {{
                put("notaccepted", NOT_ACCEPTED);
            }};

            @JsonCreator
            public static Status forValue(String value) {
                return namesMap.computeIfAbsent(value.toLowerCase(), (key) -> Status.valueOf(key.toUpperCase()));
            }

        }

    }

}
