package com.namuna.JobApp.repo;

import com.namuna.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs =new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must Have experience in Java",2,List.of("Java", "Spring","Flask")),
            new JobPost(2,"PHP Developer","Must Have experience in PHP",10,List.of("PHP", "Spring","Flask"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
