package com.ai.bot;

import java.io.File;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;

public class MyBot {
	
	public static void main(String[] args) {
		
		
		File root = new File("");
		
//		Bot bot = new Bot("BABABot", root.getAbsolutePath()+"/src/main/"+ "resources");
//		bot.setAllPaths("./recources", "bots");a 
		
		Bot bot = new Bot("TestBot", root.getAbsolutePath()+"/src/main/"+ "resources");
		
//		Chat chatSession =  new Chat(bot, "BABABot");
		Chat chatSession =  new Chat(bot, "TestBot");
		
		
		bot.brain.nodeStats();
		MagicBooleans.trace_mode = true;
		MagicBooleans.enable_external_sets = true;
//		MagicBooleans.jp_morphological_analysis = true;
		 
		
		
		String input =  null;
		String botResponse = null; 
		
		boolean botAwake = true;
		
		System.out.println("TestBot : "+"How Can I Help You :");		
		while(botAwake){
			
			
			input = IOUtils.readInputTextLine();
			
			if((input == null) && (input.length() < 1))
				input = MagicStrings.null_input;
			
			if((input.equalsIgnoreCase("exit")) || (input.equalsIgnoreCase("quit")))
				System.exit(0);
			
			
			
//			chatSession.chat();
			
			botResponse = chatSession.multisentenceRespond(input);
//			History<String>  history = chatSession.inputHistory;
			
//			history.printHistory();
//			System.out.println(input);
			
			System.out.println("BABABOT : " + botResponse);
			System.out.println("You : " );
			
			
		}
				
				
	}
	

}
