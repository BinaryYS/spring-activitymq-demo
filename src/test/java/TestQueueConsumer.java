import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yang.song on 2018/12/10 21:50
 * <p>
 * e-mail:binaryys@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-jms-consumer-queue.xml")
public class TestQueueConsumer {

    @Test
    public void testConsumer(){
        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
