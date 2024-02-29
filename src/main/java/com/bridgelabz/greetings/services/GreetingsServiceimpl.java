package com.bridgelabz.greetings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetings.entity.Greetings;
import com.bridgelabz.greetings.repository.GreetingsRepository;

@Service
public class GreetingsServiceimpl implements IGreetingsService {

@Autowired
private GreetingsRepository greetingsDao;
	
	/*
	 * List<Course> list;
	 */	
	public GreetingsServiceimpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Course(145, "Java core course",
		 * "this is a course that teaches core java")); list.add(new Course(146,
		 * "Springboot course", "this is a course that teaches springboot"));
		 */
	}

	@Override
	public List<Greetings> getGreetings() {
		// TODO Auto-generated method stub
		return greetingsDao.findAll();
	}

	@Override
	public Greetings getGreeting(long greetingsId) {
		// TODO Auto-generated method stub
		
		/*
		 * Course c = null; for(Course course:list) { if(course.getId() == courseId) { c
		 * = course; break; } }
		 */
		return greetingsDao.getOne(greetingsId);
	}

	@Override 
	public Greetings addGreetings(Greetings greetings) {
		/*
		 * list.add(course);
		 */		
		greetingsDao.save(greetings);
		return greetings;
	}

	@Override
	public Greetings updateGreetings(Greetings greetings) {
		// TODO Auto-generated method stub
		
		/*
		 * list.forEach(e->{ if(e.getId() == course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription());
		 * }});
		 */
		greetingsDao.save(greetings);
		return greetings;
	}
	
	@Override
	public void deleteGreetings(Long parseLong) {
		/*
		 * list =
		 * this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList(
		 * ));
		 */	
		Greetings entity = greetingsDao.getOne(parseLong);
		greetingsDao.delete(entity);
	}
}
