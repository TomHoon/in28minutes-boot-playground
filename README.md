<h1>Sec02 Summary</h1>
<h3>Sec02 - 13 </h3>
<p>
	above picuture is how Spring helps injection
</p>
<img src="/uploads/couplingBySpring.png"/>




<hr/>
<h3>Sec02 - 14 Spring Bean & Spring setting get started </h3>
<ul>
	<li>Delete "LearnSpringFrameworkApplication" file</li>
	<li>Refactor -> Rename (AppGamingBasic.java -> App01GamingBasic.java)</li>
</ul>






<hr/>
<h3>What is Spring Context important!</h3>
<img src="/uploads/springcontext.png"/>
<img src="/uploads/springcontext2.png"/>






<hr/>

<h3>Sec02 - 17 </h3>
<img src="/uploads/futherQuestion.png"/>

<hr/>
<h3> What is Spring Container </h3>
<p>
*** IOC container means Spring Context.
<img src="/uploads/iocAndSpringContext.png"/>

<img src="/uploads/ioccontainer.png"/>

Inside of Ioc Container, 
- Bean Factory
- Application Context
</p>







<hr/>

<h3>Sec02 - 19  </h3>
<img src="/uploads/vsBeans.png"/>

<p>
	<img src="/uploads/vsBeansCode.png"/>
		
</p>

<hr/>
<h3>Sec02 - 20</h3>
<h3>How Can I list all beans managed by Spring Framework?</h3>
<p>
	"
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
	"
</p>


<h3>what is @Primary, @Qualifier("address3qualifier")</h3>
<p>
	If I have Multiple Beans, We have two options.
	One is @primary
	Second one is @Qualifier
</p>



<hr/>
<h3>Bean name first? @Primary first?</h3>
<p>
	<img src="/uploads/primaryCode.png"/>
</p>


<hr/>
<h3>if I want to use bean which is specific one, use @Qualifier</h3>
<p>
	<img src="/uploads/@qualifier.png"/>
</p>
