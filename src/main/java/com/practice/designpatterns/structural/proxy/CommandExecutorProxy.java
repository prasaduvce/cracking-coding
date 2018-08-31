package com.practice.designpatterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private CommandExecutorImpl commandExecutor;
	private boolean isAdmin;

	public CommandExecutorProxy(String usr, String pwd) {
		this.commandExecutor = new CommandExecutorImpl();
		if (usr.equals("xxx") && pwd.equals("yyy")) {
			this.isAdmin = true;
		}
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (cmd.startsWith("rm") && !isAdmin) {
			throw new Exception("rm command cannot be executed.");
		}
		this.commandExecutor.runCommand(cmd);
	}
}
