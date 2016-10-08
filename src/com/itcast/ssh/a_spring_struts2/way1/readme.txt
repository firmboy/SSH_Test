	1.这个包主要是测试Struts的核心配置文件struts.xml改怎样配置位置
	<filter>
		<filter-name>struts2</filter-name>
		<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
		<init-param>
			<param-name>config</param-name>
			<param-value>struts-default.xml,struts-plugin.xml,com/itcast/ssh/a_spring_struts2/way1/struts.xml</param-value>
		</init-param>
	</filter>

	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	
	param-value中的路径包含三个，位置不能换，也不能少写，第三个就是我们自己要设置的，是classpath下的路径