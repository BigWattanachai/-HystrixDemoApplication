package com.example.hystrixdemo.service;

import com.example.hystrixdemo.model.MemberResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Random;

@Service
public class MemberService {
    private ExternalService externalService;

    public MemberService(ExternalService externalService) {
        this.externalService = externalService;
    }

    private void randomlyRunLong() {
        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;
        if (randomNum == 3) sleep();
    }

    private void sleep() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @HystrixCommand(
            fallbackMethod = "fallbackGetAllMembers",
            threadPoolKey = "bnk48ThreadPool",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "30"),
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            },
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
            })
    public MemberResponse getAllMembers() {
        randomlyRunLong();
        return externalService.findAllBnk48Members();
    }

    private MemberResponse fallbackGetAllMembers() {
        MemberResponse memberResponse = new MemberResponse();
        memberResponse.setMembers(Collections.emptyList());
        return memberResponse;
    }
}


