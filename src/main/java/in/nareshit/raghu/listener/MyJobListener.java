package in.nareshit.raghu.listener;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
//not required
public class MyJobListener implements JobExecutionListener {

	public void beforeJob(JobExecution je) {
		System.out.println("ON STARTUP => " + je.getStatus());
		System.out.println("ON STARTUP => " + new Date());
	}

	public void afterJob(JobExecution je) {
		System.out.println("ON END => " + je.getStatus());
		System.out.println("ON END => " + new Date());
	}

}
