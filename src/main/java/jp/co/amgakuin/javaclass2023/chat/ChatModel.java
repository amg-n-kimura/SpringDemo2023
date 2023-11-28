package jp.co.amgakuin.javaclass2023.chat;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ChatModel implements Serializable {
	private Date time;
	private String name;
	private String text;
	
	public ChatModel() {
		time = new Date();
		name = "名無しさん";
		text = "";
	}
}
