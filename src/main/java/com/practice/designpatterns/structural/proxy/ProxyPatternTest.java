package com.practice.designpatterns.structural.proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("test", "test");
		try {
			executor.runCommand("ls -ltr");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			executor.runCommand("rm -f *.iml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
