exec主要由两个goal组成：exec:exec和exec:java。你应该如何选择呢？

首先，你需要记住，exec:exec总是比exec:java强大而灵活，
两者的主要区别是在线程管理上：



exec:exec总是启动一个新的线程，并且在只剩下守护线程的时候从VM上退出(关闭应用程序)。
exec:java，当所有非守护线程结束时，守护线程会被joine或interrupt，应该程序不会关闭。


如果你的工程启动非常简单，不需要设置jvm参数、系统属性、命令行参数，那么就用exec:java，你只需要指定一下mainClass，