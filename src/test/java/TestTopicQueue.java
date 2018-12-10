import com.cqu.ssg.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yang.song on 2018/12/10 21:40
 * <p>
 * e-mail:binaryys@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-jms-producer.xml")
public class TestTopicQueue {

    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void testQueue(){
        topicProducer.setJmsTemplate("hello song song ge");
    }
}
