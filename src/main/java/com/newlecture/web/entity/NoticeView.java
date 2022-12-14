package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice {

	private String memberName;
	
	public NoticeView() {

	}

	 //부모클래스로 필드가지고 생성자만듦 
	public NoticeView(int id, String title, String content, Date regdate, int hit, boolean pub, int memberId, String memberName) {
		super(id, title, content, regdate, hit, pub, memberId); 

		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Noticeview [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate() + ", getHit()=" + getHit()
				+ ", isPub()=" + isPub() + ", getMemberId()=" + getMemberId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
