package com.zheng.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.zheng.game.SpaceShooterGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
//		config.height = 128;
//		config.width = 72;
		int height =640;
		int width = 360;
		config.setWindowSizeLimits(width,height,width,height);
		config.setForegroundFPS(60);
		config.setTitle("SpaceShooter");
		new Lwjgl3Application(new SpaceShooterGame(), config);
	}
}
