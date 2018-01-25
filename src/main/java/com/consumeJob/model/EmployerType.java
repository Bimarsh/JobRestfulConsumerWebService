package com.consumeJob.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public enum EmployerType {

	RECRUITER,DIRECTHIRE
}
