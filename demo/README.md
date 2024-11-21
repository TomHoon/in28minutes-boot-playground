[rev-sec02]
#### @Bean(name = "내가 원하는 이름")
#### ** context.getBean("메소드명") 혹은 context.getBean(Address.class) 로 접근 가능
#### ** @Bean 안에서 다른 bean을 의존하는 방법 -> new Person(name(), age())
#### ** @Bean 안에서 다른 bean inject 할 때 변수명으로 하기

<ul>
    <li>Q1. Spring Container vs Spring Context vs IOC Container vs Application Context</li>
    <li>Spring Container == IOC container</li>

    <li>Q2. Java Bean vs Spring bean</li>
    <li>Q3. How can I list all beans managed by Spring Framework</li>
    <li>Q4. What if multiple matching beans are available</li>
    <li>Q5. Spring is managing object and performaing auto-wiring</li>
</ul>

#### IOC container
#### >> runtime 때에 작동한다. 
![alt text](<제목 없음.png>)