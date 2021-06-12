package com.cg.society.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name="VotedList")
public class VotedList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;//serialno.
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date datetime;
	
	
	//@Column(name="Society")
	//@NotNull
	//private CooperativeSociety society;
	
	
	//@Column(name="Registered_Voters")
	//@NotNull
	//private RegisteredSocietyVoters voter;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//VotedList votedList;

	
	@OneToOne(cascade =CascadeType.ALL)
	private RegisteredSocietyVoters registeredSociety;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CooperativeSociety society;
	
	@OneToOne(cascade = CascadeType.ALL)
	private NominatedCandidate candidates;
}
