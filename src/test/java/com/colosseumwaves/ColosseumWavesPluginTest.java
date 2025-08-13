package com.colosseumwaves;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ColosseumWavesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ColosseumWavesPlugin.class);
		RuneLite.main(args);
	}
}