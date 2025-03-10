package io.containerapps.javaruntime.workshop.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "statistics")
@Serdeable
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "framework")
    private String framework;

    @Column(name = "type")
    private StatisticsType type;

    @Column(name = "parameter")
    private int parameter;
    
    @Column(name = "duration")
    private long duration;
    
    @Column(name = "instant")
    private Instant instant;
    
    @Column(name = "description")
    private String description;

    public enum StatisticsType {
        MEMORY, CPU
    }

    // Constructors
    public Statistics() {
    }

    public Statistics(String framework, StatisticsType type, int parameter, long duration, String description) {
        this.framework = framework;
        this.type = type;
        this.parameter = parameter;
        this.duration = duration;
        this.instant = Instant.now();
        this.description = description;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public StatisticsType getType() {
        return type;
    }

    public void setType(StatisticsType type) {
        this.type = type;
    }

    public int getParameter() {
        return parameter;
    }

    public void setParameter(int parameter) {
        this.parameter = parameter;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}