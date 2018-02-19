package com.example.hystrixdemo.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MemberResponse{

	@JsonProperty("members")
	private List<Member> members;

	@JsonProperty("total_page")
	private int totalPage;

	@JsonProperty("current_page")
	private int currentPage;
}