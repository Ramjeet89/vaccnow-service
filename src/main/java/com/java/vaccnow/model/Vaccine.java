package com.java.vaccnow.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.util.Date;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "vaccine")
public class Vaccine implements Serializable {

    @Id
    @Column(name = "vaccineId")
    private Integer id;

    @Column(name = "vaccineName")
    private String vaccineName;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "modifiedAt")
    private Date modifiedAt;

    @Column(name = "modifiedBy")
    private Integer modifiedBy;

    public Vaccine() {

    }

    public Vaccine(Integer id, String vaccineName, Date createdAt, Integer createdBy, Date modifiedAt, Integer modifiedBy) {
        this.id = id;
        this.vaccineName = vaccineName;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }

    public Integer getId() {
        return id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaccine vaccine = (Vaccine) o;
        return Objects.equals(id, vaccine.id) && Objects.equals(vaccineName, vaccine.vaccineName) && Objects.equals(createdAt, vaccine.createdAt) && Objects.equals(createdBy, vaccine.createdBy) && Objects.equals(modifiedAt, vaccine.modifiedAt) && Objects.equals(modifiedBy, vaccine.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vaccineName, createdAt, createdBy, modifiedAt, modifiedBy);
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                ", modifiedAt=" + modifiedAt +
                ", modifiedBy=" + modifiedBy +
                '}';
    }
}
