maven-surefire-report-plugin 的意思是生成 


这个插件的特点：

    1.能把生成的xml报告转换成html

    2.能指定哪些测试类需要被执行，哪些测试类不被执行

    3.能兼容JUnit 3、JUnit 4以及TestNG

    4.在默认情况下，我们无法在在某一个生命周期去调用它，因为并不是所有的用户每次构建软件的时候都会需要html格式。

如果要生成html格式的测试报告，我们需要单独执行命令：mvn surefire-report:report

调用这个命令会执行的步骤：

   1.先编译源文件和测试用例

   2.再调用surefire插件（这个插件主要是用来执行单元测试的插件）生成txt和xml个数的测试输出信息

   3.surefire报告插件（也就是maven-surefire-report-plugin）会把target/surefire-reports下的所有xml报告转换成一份html格式的文件。并将这个html格式的测试报告保存在target/site目录下。