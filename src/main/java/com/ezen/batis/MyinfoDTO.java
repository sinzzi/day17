package com.ezen.batis;

public class MyinfoDTO {
	int id;
	String name, tel;
	ScoreDTO scoreDTO;
	InsaDTO insaDTO;
	
	public MyinfoDTO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public ScoreDTO getScoreDTO() {
		return scoreDTO;
	}

	public void setScoreDTO(ScoreDTO scoreDTO) {
		this.scoreDTO = scoreDTO;
	}

	public InsaDTO getInsaDTO() {
		return insaDTO;
	}

	public void setInsaDTO(InsaDTO insaDTO) {
		this.insaDTO = insaDTO;
	}
	
	
}
