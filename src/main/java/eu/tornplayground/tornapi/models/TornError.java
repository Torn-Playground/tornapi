package eu.tornplayground.tornapi.models;

import java.util.Objects;

public class TornError extends Model {

    private long code;
    private String error;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TornError tornError = (TornError) o;
        return code == tornError.code && Objects.equals(error, tornError.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, error);
    }

}
