package com.java.vaccnow.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "branch")
public class Branch implements Serializable {

    @Id
    @Column(name = "branchId")
    private Integer id;

    @Column(name = "branchName")
    private String branchName;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "createdAy")
    private Integer createdBy;

    @Column(name = "modifiedAt")
    private Date modifiedAt;

    @Column(name = "modifiedAy")
    private Integer modifiedBy;

    public Branch(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Branch(Integer id, String branchName, Date createdAt, Integer createdBy, Date modifiedAt, Integer modifiedBy) {
        this.id = id;
        this.branchName = branchName;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(id, branch.id) && Objects.equals(branchName, branch.branchName) && Objects.equals(createdAt, branch.createdAt) && Objects.equals(createdBy, branch.createdBy) && Objects.equals(modifiedAt, branch.modifiedAt) && Objects.equals(modifiedBy, branch.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, branchName, createdAt, createdBy, modifiedAt, modifiedBy);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", branchName='" + branchName + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                ", modifiedAt=" + modifiedAt +
                ", modifiedBy=" + modifiedBy +
                '}';
    }
}