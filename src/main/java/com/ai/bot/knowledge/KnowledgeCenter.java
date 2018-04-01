package com.ai.bot.knowledge;

import java.io.File;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.MagicStrings;

public class KnowledgeCenter {

	public static void main(String[] args) {
		File root = new File("");

//		Bot bot = new Bot("BABABot", root.getAbsolutePath()+"/src/main/"+ "resources");
		
		Bot bot = new Bot("TestBot", root.getAbsolutePath()+"/src/main/"+ "resources");
		
		//		bot.setAllPaths("./recources", "bots");

//		MagicStrings.programNameVersion = "SAIRAM";

//		Chat chatSession =  new Chat(bot, "BABABot");
		
		
		
		bot.writeAIMLFiles();

	}

}
