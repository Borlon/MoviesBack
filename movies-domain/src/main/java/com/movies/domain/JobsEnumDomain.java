package com.movies.domain;

public enum JobsEnumDomain {
	
	ACTOR("Actor", 1), DIRECTOR("Director", 2);

	private String tipoJob;
	private Integer id;

	JobsEnumDomain(String tipoJob, Integer id) {
		this.tipoJob = tipoJob;
		this.id = id;
	}

	public String getTipoJob() {
		return tipoJob;
	}

	public void setTipoJob(String tipoJob) {
		this.tipoJob = tipoJob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
