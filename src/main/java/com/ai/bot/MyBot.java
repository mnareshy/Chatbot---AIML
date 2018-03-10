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
		
		Bot bot = new Bot("BABABot", root.getAbsolutePath()+"/src/main/"+ "resources");
//		bot.setAllPaths("./recources", "bots");
		

		
		Chat chatSession =  new Chat(bot, "BABABot");
		
		
		bot.brain.nodeStats();
		MagicBooleans.trace_mode = false;
		 
		
		
		String input =  null;
		String botResponse = null; 
		
		boolean botAwake = true;
		
		while(botAwake){
			
			System.out.println("BABABOT : "+"How Can I Help You :");
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
			
			
		}
				
				
	}
	

}
