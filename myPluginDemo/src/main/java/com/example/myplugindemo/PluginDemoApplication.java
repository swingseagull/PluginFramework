package com.example.myplugindemo;

import android.app.Activity;
import android.app.Application;

public class PluginDemoApplication extends Application {
//	private PluginController pluginController;
	public static Activity launchActivity;
//	private static PluginDemoApplication application;
//	private PluginDataSource pluginDataSource;

//	public static PluginDemoApplication getInstance() {
//		if (application == null)
//			application = new PluginDemoApplication();
//		return application;
//	}

	public PluginDemoApplication() {
		// TODO Auto-generated constructor stub
	}
	

//	/**
//	 * @return the pluginController
//	 */
//	public PluginController getPluginController() {
//		if (pluginController == null && launchActivity != null) {
//			pluginController = new PluginController(launchActivity);
//		}
//		return pluginController;
//	}
//
//
//	public PluginDataSource getPluginDataSource() {
//		
//	}
	
	public void attachLaunchActivity(MainActivity mainActivity) {
		launchActivity = mainActivity;
	}

	public void detachActivity() {
		launchActivity = null;
	}

	/**
	 * @return the launchActivity
	 */
	public static Activity getLaunchActivity() {
		return launchActivity;
	}


}
