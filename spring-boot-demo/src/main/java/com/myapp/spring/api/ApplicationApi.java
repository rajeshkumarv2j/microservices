package com.myapp.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.model.Application;
import com.myapp.spring.repository.ApplicationRepository;

@RestController
@RequestMapping("/api/v1/apps")
public class ApplicationApi {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@GetMapping
	public ResponseEntity<List<Application>> findAll(){
		return new ResponseEntity<List<Application>> (applicationRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Application> postNewApp(@RequestBody Application application){
		return new ResponseEntity<Application> (applicationRepository.save(application), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{appId}")
	public ResponseEntity<Application> delete(@PathVariable("appId") Integer appId) throws AppNotFoundException{
		Application application =  applicationRepository.findById(appId).orElseThrow(()->new AppNotFoundException("test"));
		applicationRepository.delete(application);
		return null;
	}
//	@PatchMapping(path = "/{appId}", cos)
//	public ResponseEntity<Application> partialAppUpdate(Integer appId, @RequestBody JsonPatch patch){
//		return new ResponseEntity<Application> (applicationRepository.save(application), HttpStatus.CREATED);
//	}
	
}
