package com.practice.designpatterns.structural.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String cmd) throws Exception {
		Process process = Runtime.getRuntime().exec(cmd);

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		String line;
		while ((line = bufferedReader.readLine())!= null ) {
			System.out.println(line);
		}

		System.out.println("' "+cmd+"' command executed, command output is above: ");
	}
}
