# rest-spring-test
a restful with classify and train

/classes
实现分类 返回分类结果和ID 
输入参数 int ID  待分类的文本 String Doc 分类模型文件地址 String ModleFile
返回字符串 分类和ID

/trainned
训练分类模型
参数 模型文件地址 String ModleFile  训练集文件地址String sourceFile

部署时需要将weka.jar IKAnalyzer2012_u6.jar lucene-core-3.6.0.jar放入本地的Maven库中
配置pom.xml中


		<dependency> 
			<groupId>IKAnalyzer.IKAnalyzer</groupId> 
			<artifactId>IKAnalyzer2012_u6</artifactId> 
         	<version>1.1.0</version> 
		</dependency> 
		
		<dependency> 
			<groupId>weka.weka</groupId> 
			<artifactId>weka-core</artifactId> 
         	<version>1.1.0</version> 
		</dependency> 
		
		
		<dependency> 
			<groupId>lucene.lucene</groupId> 
			<artifactId>lucene-core</artifactId> 
         	<version>3.6.0</version> 
		</dependency> 
