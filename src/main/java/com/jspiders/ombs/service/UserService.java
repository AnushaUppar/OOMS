package com.jspiders.ombs.service;

import org.springframework.http.ResponseEntity;

import com.jspiders.ombs.dto.UserRequestDTO;
import com.jspiders.ombs.dto.UserResponseDTO;
import com.jspiders.ombs.util.ResponseStructure;


public interface UserService {
	
/**
 * THIS METHOD IS TO SAVE THE USER DETAILS*/
	public  ResponseEntity<ResponseStructure<UserResponseDTO>> userSave(UserRequestDTO userRequest);
	/**
	 * THIS METHOD IS TO LOGIN USERDETAILS*/
	public ResponseEntity<ResponseStructure<UserResponseDTO>> userLogin(UserRequestDTO userRequest);
	
	
	public ResponseEntity<ResponseStructure<String>> forgotPasswordValidation(String userEmail);
	
	
	
}

