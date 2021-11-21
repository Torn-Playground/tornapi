package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Bars extends Model {

    @JsonProperty("server_time")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime serverTime;
    private Bar happy;
    private Bar life;
    private Bar energy;
    private Bar nerve;
    private ChainBar chain;

    public static Bars of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Bars.class);
    }

    public LocalDateTime getServerTime() {
        return serverTime;
    }

    public void setServerTime(LocalDateTime serverTime) {
        this.serverTime = serverTime;
    }

    public Bar getHappy() {
        return happy;
    }

    public void setHappy(Bar happy) {
        this.happy = happy;
    }

    public Bar getLife() {
        return life;
    }

    public void setLife(Bar life) {
        this.life = life;
    }

    public Bar getEnergy() {
        return energy;
    }

    public void setEnergy(Bar energy) {
        this.energy = energy;
    }

    public Bar getNerve() {
        return nerve;
    }

    public void setNerve(Bar nerve) {
        this.nerve = nerve;
    }

    public ChainBar getChain() {
        return chain;
    }

    public void setChain(ChainBar chain) {
        this.chain = chain;
    }

    public static class Bar {

        private long current;
        private long maximum;
        private long increment;
        private Duration interval;
        private Duration ticktime;
        private Duration fulltime;

        public long getCurrent() {
            return current;
        }

        public void setCurrent(long current) {
            this.current = current;
        }

        public long getMaximum() {
            return maximum;
        }

        public void setMaximum(long maximum) {
            this.maximum = maximum;
        }

        public long getIncrement() {
            return increment;
        }

        public void setIncrement(long increment) {
            this.increment = increment;
        }

        public Duration getInterval() {
            return interval;
        }

        public void setInterval(Duration interval) {
            this.interval = interval;
        }

        public Duration getTicktime() {
            return ticktime;
        }

        public void setTicktime(Duration ticktime) {
            this.ticktime = ticktime;
        }

        public Duration getFulltime() {
            return fulltime;
        }

        public void setFulltime(Duration fulltime) {
            this.fulltime = fulltime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bar bar = (Bar) o;
            return current == bar.current && maximum == bar.maximum && increment == bar.increment && Objects.equals(interval, bar.interval) && Objects.equals(ticktime, bar.ticktime) && Objects.equals(fulltime, bar.fulltime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(current, maximum, increment, interval, ticktime, fulltime);
        }

    }

    public static class ChainBar {

        private long current;
        private long maximum;
        private long timeout; // FIXME - Verify type.
        private float modifier;
        private long cooldown;  // FIXME - Verify type.

        public long getCurrent() {
            return current;
        }

        public void setCurrent(long current) {
            this.current = current;
        }

        public long getMaximum() {
            return maximum;
        }

        public void setMaximum(long maximum) {
            this.maximum = maximum;
        }

        public long getTimeout() {
            return timeout;
        }

        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        public float getModifier() {
            return modifier;
        }

        public void setModifier(float modifier) {
            this.modifier = modifier;
        }

        public long getCooldown() {
            return cooldown;
        }

        public void setCooldown(long cooldown) {
            this.cooldown = cooldown;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ChainBar chainBar = (ChainBar) o;
            return current == chainBar.current && maximum == chainBar.maximum && timeout == chainBar.timeout && Float.compare(chainBar.modifier, modifier) == 0 && cooldown == chainBar.cooldown;
        }

        @Override
        public int hashCode() {
            return Objects.hash(current, maximum, timeout, modifier, cooldown);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bars bars = (Bars) o;
        return Objects.equals(serverTime, bars.serverTime) && Objects.equals(happy, bars.happy) && Objects.equals(life, bars.life) && Objects.equals(energy, bars.energy) && Objects.equals(nerve, bars.nerve) && Objects.equals(chain, bars.chain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverTime, happy, life, energy, nerve, chain);
    }

}
