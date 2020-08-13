package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<TopicPojo> topicsList=new ArrayList<>(Arrays.asList(
			 new TopicPojo("spring","SpringFramework","SpringFrameworkDescription"),
			 new TopicPojo("s","Framework","FrameworkDescription"),
			 new TopicPojo("spri","Spring","SpringkDescription")
			 ));
	
	public List<TopicPojo> getAllTopis()
	{
		return topicsList;
	}
	
	public TopicPojo getTopic(String id)
	{
		
		return topicsList.stream().filter(topic->topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicPojo topicPojo) {
		topicsList.add(topicPojo);
		
	}

	public void updateTopic(String id, TopicPojo topicPojo) {
		for(int i=0 ; i<topicsList.size(); i++) {
			TopicPojo tp = topicsList.get(i);
			if(tp.getId().equals(id))
			{
				topicsList.set(i,topicPojo);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topicsList.removeIf(topic -> topic.getId().equals(id));
		
	}
}
