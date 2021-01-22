${basedir} 项目根目录
${project.build.directory} 构建目录，缺省为target
${project.build.outputDirectory} 构建过程输出目录，缺省为target/classes
${project.build.finalName} 产出物名称，缺省为${project.artifactId}-${project.version}
${project.packaging} 打包类型，缺省为jar
${project.xxx} 当前pom文件的任意节点的内容



Maven对一些生命周期的阶段（phase）默认绑定了插件目标，因为不同的项目有jar、war、pom等不同的打包方式，因此对应的有不同的绑定关系，其中针对default生命周期的jar包打包方式的绑定关系如下：

compile       -----------------------------------------  compiler:compile
test          -----------------------------------------  surefire:test
package       -----------------------------------------  jar:jar
install       -----------------------------------------  install:install
deploy        -----------------------------------------  deploy:deploy


exec_maven_plugin 项目是在绑定在测试阶段运行 java class, 顺便能测试 maven 的内置变量

jacoco_maven_plugin 包含了 maven-surefire-plugin
maven-jar-plugin    包含了 maven-dependency-plugin