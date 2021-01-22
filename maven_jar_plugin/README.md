maven-jar-plugin用于生成META-INF/MANIFEST.MF文件的部分内容，

<mainClass>com.xxg.Main</mainClass>指定MANIFEST.MF中的Main-Class，
<addClasspath>true</addClasspath>会在MANIFEST.MF加上Class-Path项并配置依赖包，
<classpathPrefix>lib/</classpathPrefix>指定依赖包所在目录。


maven-dependency-plugin 负责把依赖包抄到指定目录