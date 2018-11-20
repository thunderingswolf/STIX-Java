package io.digitalstate.stix.domainobjects.properties;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import io.digitalstate.stix.helpers.StixDataFormats;
import io.digitalstate.stix.domainobjects.types.KillChainPhase;

import java.time.ZonedDateTime;
import java.util.LinkedHashSet;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

public abstract class IndicatorProperties extends CommonProperties{

    @JsonInclude(NON_NULL)
    protected String name = null;

    @JsonInclude(NON_NULL)
    protected String description = null;

    protected String pattern;

    @JsonProperty("valid_from")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StixDataFormats.DATEPATTERN)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    protected ZonedDateTime validFrom;

    @JsonProperty("valid_until")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = StixDataFormats.DATEPATTERN)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    protected ZonedDateTime validUntil;

    @JsonInclude(NON_NULL)
    protected LinkedHashSet<KillChainPhase> killChainPhases = null;

    //
    // Getters and Setters
    //

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public ZonedDateTime getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public ZonedDateTime getValidUntil() {
        return validUntil;
    }
    public void setValidUntil(ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public LinkedHashSet<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }
    public void setKillChainPhases(LinkedHashSet<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
    }
}
