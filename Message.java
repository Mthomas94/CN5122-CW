import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Message implements Serializable{

    private String type;
    private byte[] b;
    private File file;
    private String srcUser;
    private String messageBody;
    private ArrayList<String> destUsers=new ArrayList<>();
    private ArrayList<String> onlineUsers=new ArrayList<>();
    private ArrayList<String> offlineUsers=new ArrayList<>();
    private String username;
    private String password;
    private boolean response;
    private String reason;
    private String chatName;
    private String fileName;
    //clientSendingMessages type MESSAGE
    public Message(String type, String srcUser, ArrayList<String> destUsers, String messageBody, String chatName){
		this.type = type;
		this.srcUser = srcUser;
		this.destUsers = destUsers;
		this.messageBody = messageBody;
		this.chatName = chatName;
	}

    public Message(String type, String username, String password){
  		this.type = type;
  		this.username = username;
  		this.password = password;
  	}
    public Message(String type, String srcUser, ArrayList<String> destUser, byte[] file, String fileName, String chatName){
  		this.type = type;
  		this.srcUser = srcUser;
  		this.destUsers = destUser;
  		this.fileName = fileName;
  		this.chatName = chatName;

  	}
    public Message(String type, boolean response,String reason){
    	this.type = type;
    	this.response = response;
    	this.reason = reason;
  	}
    public Message(String type , ArrayList<String> onlineUsers,ArrayList<String> offlineUsers){
    	this.type = type;
    	this.onlineUsers=onlineUsers;
    	this.offlineUsers = offlineUsers;
   	}
    public String getType(){
		 return this.type;
	 }
	 public String getUserName(){
		 return this.username;
	 }
	 public String getPassword(){
		 return this.password;
	 }
	 public Boolean getResponse(){
		 return this.response;
	 }
	 public String getReason(){
		 return this.reason;
	 }
	 public ArrayList<String> getOnlineUsers(){
	    return this.onlineUsers;
	 }
	 public ArrayList<String> getOfflineUsers(){
	    	return this.offlineUsers;
	 }
	 public String getChatName(){
		 return this.chatName;
	 }
	 public String getFileName(){
		 return this.fileName;
	 }
	 public String getsrcUser() {
	        return this.srcUser;
	 }
	 public ArrayList<String> getDestUsers(){
	    	return this.destUsers;
	 }
	 public String getMessageBody() {
	        return this.messageBody;
	 }
	 public byte[] getBody() {
	        return this.b;
	 }
	 public byte[] getFile() {
	        Path f = file.toPath();
	        try {
	            return Files.readAllBytes(f);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            return null;
	        }
	 }

}
