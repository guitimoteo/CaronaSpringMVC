package br.com.carona.exception;

public class UserExistException extends Exception {
	public UserExistException(String message){
		super(message);
	}
}
