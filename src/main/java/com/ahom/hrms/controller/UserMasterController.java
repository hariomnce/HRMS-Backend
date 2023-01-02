package com.ahom.hrms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.dto.UserMasterDto;
import com.ahom.hrms.serviceimpl.UserMasterServiceImpl;
import com.ahom.hrms.util.JwtUtil;

@RequestMapping("/usermaster")
@CrossOrigin
@RestController
public class UserMasterController {
	
	@Autowired
	UserMasterServiceImpl userMasterService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	//save data
	@PostMapping("/saveuser")
	public ResponseEntity<UserMasterDto> saveUsers(@RequestBody UserMasterDto userMasterDto){
		String pwd = userMasterDto.getPassword();
		String encryptpwd = passwordEncoder.encode(pwd);
		userMasterDto.setPassword(encryptpwd);
		userMasterService.saveUser(userMasterDto);
		return new ResponseEntity<>(userMasterDto, HttpStatus.CREATED);
	}
	
	//JWT authentication API
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody UserMasterDto userMasterDto) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userMasterDto.getUserName(), userMasterDto.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(userMasterDto.getUserName());
    }
	
	//fetch data
	@GetMapping("/fetchuser/{userName}")
	public ResponseEntity<UserMasterDto> getUser(@PathVariable("userName") String userName){
		UserMasterDto allUser = userMasterService.fetchByUser(userName);
		ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.of(Optional.of(allUser));
	}
	
	//update data
	@PutMapping("/updateuser")
	public ResponseEntity<UserMasterDto> updateUser(@RequestBody UserMasterDto userMasterDto){
		userMasterService.updateUser(userMasterDto);
		return new ResponseEntity<>(userMasterDto, HttpStatus.ACCEPTED);
	}

}
