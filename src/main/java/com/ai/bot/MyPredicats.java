package com.ai.bot;

import java.util.HashMap;

import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.Predicates;

public class MyPredicats extends Predicates {

	public class Predicates extends HashMap<String, String>
	{
		public String put(String key, String value)
		{
			
			return ((String)super.put(key, value));
		}
	}

}
