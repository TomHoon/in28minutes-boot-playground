##### Spring Context에 실을 대상을 @Component로 알려줌
##### @ComponentScan 을 통해 SpringContext 넣을 대상들을 가져감 

<hr/>

##### SpringContext에 실을 때 @Component 사용 안하는 경우

<p>
    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }
</p>

![Alt text](image.png) 

##### SpringContext에 실을 때 @Component 사용 하는 경우

![Alt text](image-1.png)


<hr/>