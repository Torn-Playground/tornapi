package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;

public class JobPoints extends Model {

    private Map<String, Long> jobs;
    private Map<Long, CompanyPoints> companies;

    public Map<String, Long> getJobs() {
        return jobs;
    }

    public void setJobs(Map<String, Long> jobs) {
        this.jobs = jobs;
    }

    public Map<Long, CompanyPoints> getCompanies() {
        return companies;
    }

    public void setCompanies(Map<Long, CompanyPoints> companies) {
        this.companies = companies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPoints jobPoints = (JobPoints) o;
        return Objects.equals(jobs, jobPoints.jobs) && Objects.equals(companies, jobPoints.companies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, companies);
    }

    public static class CompanyPoints {

        private String name;
        @JsonProperty("jobpoints")
        private long jobPoints;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getJobPoints() {
            return jobPoints;
        }

        public void setJobPoints(long jobPoints) {
            this.jobPoints = jobPoints;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompanyPoints that = (CompanyPoints) o;
            return jobPoints == that.jobPoints && name.equals(that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, jobPoints);
        }

    }

}
