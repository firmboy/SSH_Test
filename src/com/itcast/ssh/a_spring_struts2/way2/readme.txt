这个包中的文件就是为了测试Struts2和Spring框架整合的第二种方式：
1.action由Spring框架创建，在这个过程中需要注意以下三点
	1.action在applicationcontext中要设置为多例的
	2.在struts.xml中配置action时，class要写在applicationcontext中的id值
