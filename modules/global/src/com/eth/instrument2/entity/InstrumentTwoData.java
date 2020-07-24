package com.eth.instrument2.entity;

import com.eth.proposals.entity.Proposal;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "INSTRUMENT2_INSTRUMENT_TWO_DATA")
@Entity(name = "instrument2_InstrumentTwoData")
@NamePattern("%s|purpose")
public class InstrumentTwoData extends StandardEntity {
    private static final long serialVersionUID = 4889722722069271106L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROPOSAL_ID")
    private Proposal proposal;

    @NotNull
    @Column(name = "PURPOSE", nullable = false)
    private String purpose;

    @JoinTable(name = "INSTRUMENT2_INSTRUMENT_TWO_DATA_USER_LINK",
            joinColumns = @JoinColumn(name = "INSTRUMENT_TWO_DATA_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    @ManyToMany
    private List<User> colleagues;

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    public List<User> getColleagues() {
        return colleagues;
    }

    public void setColleagues(List<User> colleagues) {
        this.colleagues = colleagues;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}