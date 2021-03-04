package com.mcsunnyside.BBSToper;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultContainer {
    private String user;
    private String date;
    private String action;

	public boolean isTopCard(){
        return action.contains("服务器提升卡");
    }
	public String getUser() {
		// TODO Auto-generated method stub
		return user;
	}
	public String getDate() {
		// TODO Auto-generated method stub
		return date;
	}
		
	public ResultContainer user(String user) {
		this.user = user;
		return this;
	}
		
	public ResultContainer date(String date) {
		this.date = date;
		return this;
	}
		
	public ResultContainer action(String action) {
		this.action = action;
		return this;
	}
	protected static ResultContainer builder() {
		// TODO Auto-generated method stub
		return new ResultContainer();
	}
	public ResultContainer build() {
		// TODO Auto-generated method stub
		return this;
	}

}
