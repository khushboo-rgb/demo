package io.javabrains.springbootstarter.topic;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<TopicPojo> getAllTopics()
	{
		return topicService.getAllTopis();
	}

	@RequestMapping("/topics/{id}")
	public TopicPojo getTopic(@PathVariable String id)
	{

		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addToipcs(@RequestBody TopicPojo topicPojo)
	{
		topicService.addTopic(topicPojo);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateToipcs(@RequestBody TopicPojo topicPojo, @PathVariable String id)
	{
		topicService.updateTopic(id,topicPojo);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteToipcs(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
}
