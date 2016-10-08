这个包中的文件就是为了测试测试Spring整合hibenate框架
	1.方式1，就是将heibernate的核心配置文件保留，在spring的applicationcontext
	中直接将这个文件作为一个属性加载到sessionfactory这个类的文件中
	2.如果我们的dao层的实现对象继承了hibernateJdbcSupport，那么，在dao中我们就
	可以直接注入sessionFactory，注入sessionFactory后我们可以在dao中使用
	this.getHibernateTemplate方法获取hibernateTemplate对象，然后调用
	对应的方法。
	3.开启事务，可以有两种方法，配置文件和注解
	注解方式和配置文件都需要在applicationContext.xml中配置事务管理器，
	使用注解方式的时候要在applicationContext.xml中开启事务注解自动扫描
	
	
